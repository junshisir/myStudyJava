package concrrentfure;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import ziduanbianma.stringbuilder;

class downloadtask implements Callable<String>{
	String url;
	
	public  downloadtask(String url) {
		this.url=url;
	
	}
	public String call() throws Exception{
		System.out.println("start download"+url+"...");
		URLConnection connection=new URL(this.url).openConnection();
		connection.connect();
		try(BufferedReader reader=new BufferedReader(new InputStreamReader(null, url))){
			String s=null;
			stringbuilder sb=new stringbuilder();
			while ((s=reader.readLine())!=null) {
				sb.append(s).append("\n");
			}
			return sb.toString();
		}
		
	}
}
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ExecutorService executorService=Executors.newFixedThreadPool(3);
		downloadtask task=new downloadtask("www.baidu.com");
		Future<String> future=executorService.submit(task);
		String html=future.get();
		System.out.println(html);
		executorService.shutdown();
	}

}
