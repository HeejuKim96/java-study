package variable;

public class Swqp {

	public static void main(String[] args) {
		
		int num = 10;
		int num2 = 20;
		int temp = 0;
		
		temp = num;
		num = num2;
		num2 = temp;
		
		System.out.println(num);
		System.out.println(num2);
	}
}
