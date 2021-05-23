package loop;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] arr = new String[0];   사이즈에 0 넣으면 기본으로 나옴 
		String[] arr = {"A", "B", "C", "D"};
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		// for문보다 속도가 빠름 / 이터레이터라서 
		// 인덱스가 없어서 값 바꾸기가 어려움 -> 그리고 값을 바꾼 후 저장이 안되는 단점이 있음(원본복사가 아니라 윈도우 바로가기느낌)
		// 역순으로 돌릴수가 없음
		// 조건을 주기가 어려움
		for (String str : arr) {
			System.out.println(str);
		}
		
	}

}
