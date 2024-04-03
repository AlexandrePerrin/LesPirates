package game;


public class Jeu {
	
	protected Joueur[] joueurs = new Joueur[2];
	protected int nombreJoueur=0; 
	protected PaireDes des= new PaireDes(1,1);
	protected int tour=0;
	protected Plateau plateau= new Plateau();
	
	public Jeu(Joueur joueur1,Joueur joueur2) {

		ajouterJoueur(joueur1);
		ajouterJoueur(joueur2);
		
	}
	
	public void ajouterJoueur(Joueur joueur) {
		if (this.nombreJoueur == 1) {
			joueurs[1]=joueur;
		}
		if (this.nombreJoueur ==0) {
			joueurs[0]=joueur;
		}
		this.nombreJoueur++;
	}

	
	public void changerTour() {
		this.tour = (this.tour+1)%2;
	}
	
	public void lancerJeu(Affichage afficheur) {
		do {
			
			this.changerTour();
			
			afficheur.parler("Joueur "+this.joueurs[this.tour].getNom());
		
			this.des.lancerDes();
			afficheur.parler("Des 1 = "+des.des1);
			afficheur.parler("Des 2 = "+des.des2);
				
			if (this.joueurs[this.tour].stunned != 0) {
				afficheur.parler("Le joueur "+this.joueurs[this.tour].getNom()+" est stunned, les deux dés prennent la valeur 0");
				this.des = new PaireDes(0,0);
			}
			
			this.joueurs[this.tour].deplacer(des.des1+des.des2);
			afficheur.parler("Position joueur "+this.joueurs[this.tour].coordonnee);
			
			afficheur.afficherPlateau(this.joueurs[0].getCoordonnee(),this.joueurs[1].getCoordonnee());
			
			this.plateau.cases[this.joueurs[this.tour].coordonnee-1].effetCase(this.joueurs[this.tour], this.joueurs[(this.tour+1)%2],afficheur);
			
			afficheur.afficherPlateau(this.joueurs[0].getCoordonnee(),this.joueurs[1].getCoordonnee());
				
		}	while((!this.joueurs[0].fini()) && !(this.joueurs[1].fini()));
		this.changerTour();
		afficheur.parler("Le joueur "+this.joueurs[this.tour].getNom()+" a gagné" );
	}
}
