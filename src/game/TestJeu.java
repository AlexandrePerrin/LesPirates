package game;

public class TestJeu {
	
	public static void main(String[] args) {
	
		Joueur joueur1 = new Joueur("Bleu",Couleur.BLEU);
		Joueur joueur2 = new Joueur("Vert",Couleur.VERT);
			
		Affichage afficheur = new Affichage("");
			
		Jeu jeux = new Jeu(joueur1,joueur2); 
			
		jeux.lancerJeu(afficheur);

	}
}
