package example;

public class Ex6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDistance(1, 1, 2, 2));
		
	}

	
	static double getDistance(int x, int y, int x2, int y2) {
		
		return Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
	}
}
