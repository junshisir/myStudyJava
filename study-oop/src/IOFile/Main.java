package IOFile;


import java.io.File;

public class Main {
	public static void main (String[] args) {
		
		File win=new File("d:\\windows");
		System.out.println(win.isDirectory());
		File notepad=new File("d:\\windows\\notepad.exe");
		System.out.println(notepad.isFile());
		File dir=new File("d:\\abc\\xyz");
		System.out.println(dir.mkdir());
		File readme= new File("./src/readme.txt");
		System.out.println(readme.isFile());
		System.out.println(readme.getAbsolutePath());
		
	}

}
