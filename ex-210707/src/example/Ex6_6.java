package example;

public class Ex6_6 {
	
	int x;
	int y;
	
	public Ex6_6(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x, int y) {
		
		return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
	}
	

}


