package variable;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Variable {
	
	public static void main(String[] args) {
		boolean b = false;
		
		//	문자 
		char c = 'd';	 
		
		// 정수 
		int i = Integer.MAX_VALUE; // int의 최대값 
		long l = Long.MAX_VALUE;	// long의 최대값 
		
		BigInteger big = new BigInteger("1234123412341234123412341234123412341234");	// 숫자가 아닌데 숫자처럼 쓰는거 스트링값ㄷ임
		BigDecimal big2 = new BigDecimal("234123412341234123412341234123412341234");
		
		
		
		// 실수 
		double d = 0.14;
		float f = 0.14f; // 뒤에 f가 붙어야됨 -> 안붙으면 에러뜸 
		
		System.out.println(big);
		System.out.println(big2);
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(d);
		System.out.println(f);
		
		
		final int number = 100; // 100은 상수값 -> 리터럴이라고도 함 
		 
		
		 
		
		
	}
	
}
