package game;

import java.security.SecureRandom;

public class PaireDes {
	
	protected int des1;
	protected int des2;
	
	public PaireDes(int v1, int v2) {
	this.des1 = v1;
	this.des2 = v2;
	}
	
	public void lancerDes(){
		SecureRandom secureRandom = new SecureRandom();

		int d1 = secureRandom.nextInt(5)+1;
		int d2 = secureRandom.nextInt(5)+1;
		this.des1 = d1;
		this.des2 = d2;
	}

}
