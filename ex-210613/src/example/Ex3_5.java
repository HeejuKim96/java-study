package example;

import java.util.Scanner;

public class Ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("입력 : ");
			
			int num = scan.nextInt();
			
			
			System.out.println(num > 0 ? "양수" : (num == 0 ?  "0" : "음수	")) ;
			
			if(num == -1) {
				System.out.println("끝");
				break;
			}
		}

	}

}
