package game;

public class Canon extends Case{
	
	@Override
	public void effetCase(Joueur joueur1,Joueur joueur2,Affichage speaker) {
		
		if (joueur1.coordonnee < joueur2.coordonnee) {
			joueur1.coordonnee = joueur2.coordonnee;
			speaker.parler("Le joueur " + joueur1.getNom()+ " saute vers le joueur "+ joueur2.getNom());
			
		}
		else { 
			joueur2.stunned = 1;
			speaker.parler("Le joueur "+joueur2.getNom()+ " stunned pendant 1 tour");
			
		}
			
	}

}
