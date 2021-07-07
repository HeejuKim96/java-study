package example;

public class Ex6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 5;
		System.out.println(abs(val));
		val = -10;
		System.out.println(abs(val));

	}

	private static int abs(int val) {
		// TODO Auto-generated method stub

		if(val < 0) {
			return val * -1;
		} else {
			return val;
		}

	}

}
