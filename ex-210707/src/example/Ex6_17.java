package example;

import java.util.Arrays;

public class Ex6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ori = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(Arrays.toString(ori));
		
		int[] result = suffle(ori);
		
		System.out.println(Arrays.toString(result));
	}

	private static int[] suffle(int[] ori) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < ori.length; i++) {
			int r = (int)(Math.random() * ori.length);
			int temp;
			
			temp = ori[i];
			ori[i] = ori[r];
			ori[r] = temp;
			
		}
		
		
		return ori;
	}
	
	


}
