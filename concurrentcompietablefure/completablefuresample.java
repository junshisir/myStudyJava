package concurrentcompietablefure;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import javax.management.RuntimeErrorException;

class stocksupplier implements Supplier<Float>{
	@Override
	public Float get() {
		String url="www.baidu.com";
		System.out.println("GET:"+url);
		try {
			String result=DownloadUtil.download(url);
			String[] ss=result.split(",");
			return Float.parseFloat(ss[3]);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
public class completablefuresample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		CompletableFuture<Float> getstockfuture=CompletableFuture.supplyAsync(new stocksupplier());
		getstockfuture.thenAccept(new Consumer<Float>() {
			@Override
			public void accept(Float price) {
				System.out.println("current price:"+price);;
				getstockfuture.exceptionally(new Function<Throwable, Float>() {
					@Override
					public Float apply(Throwable t) {
						System.out.println("error"+t.getMessage());
						return Float.NaN;
					}
				});
				
			}
		});
		getstockfuture.join();
	}

}
