package game;


public class Plateau {
	
	protected Case[] cases = new Case[30];
	
	public Plateau() {
		generer();
	}

	public void generer() {
		Vent vent1 = new Vent();
		Canon canon1 = new Canon();
		Normal normal1 = new Normal();
		
		for(int i=0;i<30;i++) {
			
			if ((i==4) || ( i==9)){
				cases[i]=vent1;
			}
			else if ((i==6) || (i==19)){
				cases[i]=canon1;
			}
			else {
				cases[i]=normal1;
			}
			
		}
	}
	
}
