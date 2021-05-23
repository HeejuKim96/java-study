package loop;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break
		int num = 0;
		
		while(true) {
			System.out.println(num++);
			
			if(num >= 5) {
				break;
			}
		}
		
		System.out.println("continue");
		
		// continue
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;
			} 
			System.out.println(i);
		}
		
		
	}

}
