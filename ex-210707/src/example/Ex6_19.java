package example;

public class Ex6_19 {
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOL = 100;
	final int MIN_VOL = 0;
	final int MAX_CHA = 100;
	final int MIN_CHA = 1;
	
	void turnOnOff() {
		if(isPowerOn) {
			isPowerOn = false;
		} else {
			isPowerOn = true;
		}	
	}
	
	void volUp() {
		if(volume < MAX_VOL) {
			volume++;
		}
		
	}
	
	void volDown() {
		if(volume > MIN_VOL) {
			volume--;
		}
	}
	
	void chaUp() {
		if(channel >= MAX_CHA) {
			channel = MIN_CHA;
		} else {
			channel++;
		}
	}
	
	void chaDown() {
		if(channel <= MIN_CHA) {
			channel = MAX_CHA;
		} else {
			channel--;
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ex6_19 tv = new Ex6_19();
		
		tv.channel = 100;
		tv.volume = 0;
		
		System.out.println("CH : " + tv.channel + ", VOL : " + tv.volume);
		
		tv.chaDown();
		tv.volDown();
		
		System.out.println("CH : " + tv.channel + ", VOL : " + tv.volume);
		
		tv.volume = 100;
		tv.chaUp();
		tv.volUp();
		
		System.out.println("CH : " + tv.channel + ", VOL : " + tv.volume);
	}

}
