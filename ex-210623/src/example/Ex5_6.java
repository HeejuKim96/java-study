package example;

import java.util.Scanner;

public class Ex5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] wd = {"television", "computer", "mouse", "phone"};
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < wd.length; i++) {
			char[] q = wd[i].toCharArray();
			
			// logic
			
			for (int j = 0; j < q.length; j++) {
				int idx = (int)(Math.random() * q.length);
				
				char tmp = q[j];
				q[j] = q[idx];
				q[idx] = tmp;
			}
			
			
			
			
			System.out.printf("Q%d. %s의 정답을 입력하세요 = >", i+1, new String(q));
			
			String answer = scan.nextLine();
			
			if(wd[i].equals(answer.trim())) {
				System.out.println("dd");
			} else {
				System.out.println("nn");
			}
		}

	}

}
