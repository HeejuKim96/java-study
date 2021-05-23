package variable;

public class Casting2 {
	
	public static void main(String[] args) {
        
        int i = 3;
        char c = (char) (i + '0');
        System.out.println("int to char : c = " + c);

        char c2 = '5';
        int i2 = c2 - '0'; // -'0'부분이 char c2의 ''를 떼주는 애 
        System.out.println("char to int : i2 = " + i2);

        int i3 = 10;
        String s = i3 + "";  //스트링으로 변환하려고 ""을 붙여주는거 
        System.out.println("int to String : s = " + s);

        String s2 = "100";
        int i4 = Integer.parseInt(s2);
        System.out.println("String to int : i4 = " + i4);

        String s3 = "2";
        char c3 = s3.charAt(0);
        System.out.println("String to char : c3 = " + c3);

        char c4 = '9';
        String s4 = c4 + "";
        System.out.println("char to String : s4 = " + s4);

	}

}
