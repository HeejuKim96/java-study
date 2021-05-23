package conditional;

public class SwitchConditional {

	public static void main(String[] args) {
		int num = 10;

		// 값 계산 후	케이스를 찾아가는거라서 if문에 비해 빠름
		// 케이스에 변수가 들어가지 못함 -> 문자는 가능	
		// break -> jdk 14에 수정되어서 출시됨 
		switch (num) {
		case 10:
			System.out.println(num);
			break;
		case 20:
			System.out.println(num);
			break;
		case 30:
			System.out.println(num);
			break;
		default:
			System.out.println("err");
			break;
		}
	}
}
