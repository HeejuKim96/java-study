package conditional;

public class IfConditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;

		if (score > 60) {
			if(score > 80) {
				System.out.println("A+");
			}
	        System.out.println("합격입니다.");
	    } else if(score > 40){
	    	System.out.println("노력하세요.");
	    } else {
	        System.out.println("불합격입니다.");
	    }
	}

}
