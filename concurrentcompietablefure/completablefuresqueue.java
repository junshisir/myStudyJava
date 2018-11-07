package concurrentcompietablefure;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import ziduanbianma.stringbuilder;

class Price{
	final String code;
	final float price;
	
	public Price( String code,float price) {
		// TODO Auto-generated constructor stub
		this.code=code;
		this.price=price;
	}
}
class stocklookupsupplier implements Supplier<String>{
	String name;
	public stocklookupsupplier(String name) {
		this.name=name;
	}
	
	public String get() {
		System.out.println("lookup"+name);
		try {
			String url="www.baidu.com";
			String result=downloadutil.download(url);
			String[] ss=result.split(",");
			return ss[3];
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
public class completablefuresqueue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String name="上证指数";
		CompletableFuture<String> getstockcodefuture=CompletableFuture.supplyAsync(new stocklookupsupplier(name));
		CompletableFuture<String> getstockpricefuture=getstockcodefuture.thenApplyAsync(new Function<String, price>() {
			public Price apply(String code) {
				System.out.println("get code"+name);
				try {
					String url="www.baidu.com";
					String result=downloadutil.download(url);
					String[] ss=result.split(",");
					return new Price(code, Float.parseFloat(ss[3])) ;
				} catch (Exception e) {
					// TODO: handle exception
					throw new RuntimeException(e);
				}
			}
		});
		getstockcodefuture.thenAccept(new Consumer<Price>() {
			public void accept(Price p) {
				System.out.println(p.code+":"+p.price);;
				
			}
		});
		getstockcodefuture.join();
	}

}
