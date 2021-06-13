package example;

public class Ex4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int result = 0;
		
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 || i % 3 != 0) {
				result += i;
			}
		}
		
		System.out.println(result);
	}

}
