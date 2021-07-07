package example;

public class Ex6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,9,4,7};
		
		System.out.println(max(data));
		
		
	}

	
	public static int max(int[] arr) {
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
}
