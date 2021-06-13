package example;

public class Ex2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1; // 2
		int y = 2; // 3
		int z = 3; // 1
		
		int temp;
		
		temp = x;
		x = y;
		y = z;
		z = temp;
		
		
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
		
		
	}

}
