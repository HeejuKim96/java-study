package example;

import java.util.Random;
import java.util.Scanner;

public class Ex4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int answer = random.nextInt(100) + 1;
		System.out.println(answer);
		int input = 0;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		
		do{
			count++;
			System.out.print("1 ~ 100 사이의 값을 입력하세요 : ");
			input = scan.nextInt();
			
			if(answer == input) {
				System.out.println("맞혔습니다.");
				System.out.println("시도횟수는 " +count + "번 입니다. ");
				break;
			} else if (answer > input) {
				System.out.println("더 큰 수를 입력하세요. ");
			} else {
				System.out.println("더 작은 수를 입력하세요. ");
			}
		} while(true);
	}

}
