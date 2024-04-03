package game;

public class Joueur {
	
	private String nom;
	private int vie;
	private Couleur couleur;
	protected int coordonnee;
	protected int stunned=0;

	public Joueur(String nom,Couleur couleur) {
		this.nom  = nom;
		this.vie = 5;
		this.couleur = couleur;
		this.coordonnee=1;
	}
	
	public boolean mort() {
		if (this.vie == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String getNom() {return this.nom;}
	public int getVie() {return this.vie;}
	public Couleur getCouleur() {return this.couleur;}
	public int getCoordonnee() {return this.coordonnee;}
	
	public void deplacer(int deplacement) {
		
		if (this.coordonnee + deplacement < 31 ) {
			this.coordonnee = this.coordonnee + deplacement;
		}
		else {
			this.coordonnee = 60 - (this.coordonnee + deplacement );
		}
	}
	
	public boolean gagner() {
		if (this.coordonnee == 30) {return true;}
		else {return false;}
	}
	
	public boolean fini() {
		if (this.gagner() || this.mort()) {
			return true;
		}
		else {return false;}
		
		
	}

}
