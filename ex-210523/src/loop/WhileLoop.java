package loop;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		
		
		
		
		// for와 while 은 호환이 된다 
		// for문은 내가 몇번할건지 정확히 알 때 
		// while문은 종료시점은 알고있으나 시작점을 모를경
		while(num != 5) {
			System.out.println(num);
			num++;
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		System.out.println();
		
		
		
	}

}
