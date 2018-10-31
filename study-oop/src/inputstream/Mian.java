package inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Mian {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try(InputStream input=new FileInputStream("..\readme.txt")){
			int n;
			while((n=input.read())!=-1) {
				System.out.println(n);
			}
		}
				
	}

}
