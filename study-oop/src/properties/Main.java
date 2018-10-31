package properties;

import java.util.Properties;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties props=new Properties();
		props.load(Main.class.getResourceAsStream("/properties/setting.properties"));
		String url=props.getProperty("url");
		String lang=props.getProperty("langguage");
		String title=props.getProperty("course.title");
		String description=props.getProperty("course.description");

		System.out.println(url);
		System.out.println(lang);
		System.out.println(title);
		System.out.println(description);
	}

}
