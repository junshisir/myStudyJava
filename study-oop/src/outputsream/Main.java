package outputsream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try(OutputStream output=new FileOutputStream("output.txt")){
			byte[] b1="hello".getBytes("UTF-8");
			output.write(b1);
			byte[] b2="���".getBytes("UTF-8");
			output.write(b2);
		}

	}

}
