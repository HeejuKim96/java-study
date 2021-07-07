package example;

public class Ex6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "123";
		String ss  = change(str);
		System.out.println(ss);
	}
	
	public static String change(String str) {
		return str += "456";
	}

}
