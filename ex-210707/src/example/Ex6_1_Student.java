package example;

public class Ex6_1_Student {

	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Ex6_1_Student(String name, int ban, int no, int kor, int eng, int math) {

		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	
		
	}
	

	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		
		float f = ((float)Math.round((kor+eng+math)) / 3);
		return (int) (float)(f * 100 +0.5) / 100f;
	}

	public String info() {
		return "Ex6_1_Student [name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng
				+ ", math=" + math + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBan() {
		return ban;
	}


	public void setBan(int ban) {
		this.ban = ban;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}
	
	
	

}
