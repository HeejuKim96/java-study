package example;

public class Ex4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 15 ;
		char ch = ' ';
		int year = 300;
		boolean powerOn = false;
		String str = "yes";
		
		System.out.println(10 < x && x < 20);
		System.out.println(ch != ' ' || ch != '\t');
		System.out.println(ch == 'X' || ch == 'x');
		System.out.println('0' <= ch && ch <= '9');
		System.out.println('A' <= ch && 'z' <= ch);
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		System.out.println(!powerOn);
		System.out.println(str.equals("yes"));

	}

}
