package game;

public class Vent extends Case{
	
	@Override
	public void effetCase(Joueur joueur1,Joueur joueur2,Affichage speaker) {
		joueur1.deplacer(10);
		speaker.parler("Le joueur "+joueur1.getNom()+" prend un coup de vent, +10 cases");
	}

}
