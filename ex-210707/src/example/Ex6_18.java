package example;

public class Ex6_18 {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "1234";
		
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "123o";
		
		System.out.println(str + "는 숫자입니까? " + isNumber(str));

	}

	private static boolean isNumber(String str) {
		// TODO Auto-generated method stub
		boolean flag = true;
		
		for (int i = 0; i < str.length(); i++) {
			if(!String.valueOf(str.charAt(i)).matches("^[0-9]$")) {
				flag = false;
				break;
			} 
		}
		
		return flag;
		
	}

}
