package example;

public class Ex4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;	// 1+2/ 1+2+3
		int total = 0;	// (1+2) + (1+2+3)
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			total += sum;
		}
		System.out.println(sum);
		System.out.println(total);
	}

}
