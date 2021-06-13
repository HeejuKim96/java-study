package example;

public class Ex4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int num = 0;
		int sign = 1;
		
		for(int i = 1; ; i++, sign =- sign) {
			num = sign * i;
			sum += num;
			
			if(i > 195) {
				System.out.println(sum  + " " + i);
			}
			
			if(sum  >= 100) {
				System.out.println(i);
				break;
				
			}
		}
		
		
	}

}
