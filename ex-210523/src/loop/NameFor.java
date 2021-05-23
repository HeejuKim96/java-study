package loop;

public class NameFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   OutterLoop : for (int i = 2; i < 9; i++) {
	        System.out.println("구구단 " + i + "단!");

	        InnerLoop : for (int j = 1; j < 9; j++) {
	            if (i > 3) {
	                break OutterLoop;
	            }
	            
	            System.out.println("i x j = " + i * j);
	        }
	        System.out.println(); 
	   }
	}
}
