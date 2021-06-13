package example;

import java.util.Random;

public class Ex4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val = (int) (Math.random() * 6) + 1;
		
		System.out.println("val = " + val);
		
		Random random = new Random();
		int i = random.nextInt(6) + 1;
		System.out.println(i);

	}

}
