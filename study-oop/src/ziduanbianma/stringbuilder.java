package ziduanbianma;

public class stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="world";
		StringBuilder sb=new StringBuilder();
		sb.append("hello,").append(name).append("!");
		String s=sb.toString();
		System.out.println(s);
		
		}

}
