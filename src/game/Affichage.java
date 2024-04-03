package game;

public class Affichage {
	
	protected String phrase;
	
	public Affichage(String phrase){this.phrase = phrase;}
	
	public void parler(String phrase) {
		System.out.println(phrase);
	}
	
	public void parler() {
		System.out.println(this.phrase);
	}
	
	public int[] determinerPosition(int position) {
		
		int[] pos = new int[2];
		
		if (position == 1) {
			pos[0]=0;
			pos[1]=0;
		}
		
		if (position == 2) {
			pos[0]=0;
			pos[1]=1;
		}
		if (position == 3) {
			pos[0]=0;
			pos[1]=2;
		}
		if (position == 4) {
			pos[0]=0;
			pos[1]=3;
		}
		if (position == 5) {
			pos[0]=0;
			pos[1]=4;
		}
		if (position == 6) {
			pos[0]=0;
			pos[1]=5;
		}
		if (position == 7) {
			pos[0]=1;
			pos[1]=5;
		}
		if (position == 8) {
			pos[0]=2;
			pos[1]=5;
		}
		if (position == 9) {
			pos[0]=3;
			pos[1]=5;
		}
		if (position == 10) {
			pos[0]=4;
			pos[1]=5;
		}
		if (position == 11) {
			pos[0]=4;
			pos[1]=4;
		}
		if (position == 12) {
			pos[0]=4;
			pos[1]=3;
		}
		if (position == 13) {
			pos[0]=4;
			pos[1]=2;
		}
		if (position == 14) {
			pos[0]=4;
			pos[1]=1;
		}
		if (position == 15) {
			pos[0]=4;
			pos[1]=0;
		}
		if (position == 16) {
			pos[0]=3;
			pos[1]=0;
		}
		if (position == 17) {
			pos[0]=2;
			pos[1]=0;
		}
		if (position == 18) {
			pos[0]=1;
			pos[1]=0;
		}
		if (position == 19) {
			pos[0]=1;
			pos[1]=1;
		}
		if (position == 20) {
			pos[0]=1;
			pos[1]=2;
		}
		if (position == 21) {
			pos[0]=1;
			pos[1]=3;
		}
		if (position == 22) {
			pos[0]=1;
			pos[1]=4;
		}
		if (position == 23) {
			pos[0]=2;
			pos[1]=4;
		}
		if (position == 24) {
			pos[0]=3;
			pos[1]=4;
		}
		if (position == 25) {
			pos[0]=3;
			pos[1]=3;
		}
		if (position == 26) {
			pos[0]=3;
			pos[1]=2;
		}
		if (position == 27) {
			pos[0]=3;
			pos[1]=1;
		}
		if (position == 28) {
			pos[0]=2;
			pos[1]=1;
		}
		if (position == 29) {
			pos[0]=2;
			pos[1]=2;
		}
		if (position == 30) {
			pos[0]=2;
			pos[1]=3;
		}
		
		
		return pos;
	}
	
	
	public void afficherPlateau(int joueur1, int joueur2) {


		int n = 5;
	    int m = 6;
	    int[][] tableau = new int[n][m];
	    
	    int valeur = 1;
	    int ligne = 0;
	    int colonne = 0;
	        
	    while (ligne < n && colonne < m) {
	    	for (int i = colonne; i < m; ++i) {
	    		tableau[ligne][i] = valeur++;
	        }
	        ligne++;
	        for (int i = ligne; i < n; ++i) {
	        	tableau[i][m - 1] = valeur++;
	        }
	        m--;
	            
	        if (ligne < n) {
	        	for (int i = m - 1; i >= colonne; --i) {
	        		tableau[n - 1][i] = valeur++;
	            }
	            n--;
	        }
	        
	        if (colonne < m) {
	        	for (int i = n - 1; i >= ligne; --i) {
	        		tableau[i][colonne] = valeur++;
	            }
	            colonne++;
	        }
	    }
	        
	    int caseBleueLigne = determinerPosition(joueur1)[0];
	    int caseBleueColonne = determinerPosition(joueur1)[1];
	    int caseVerteLigne = determinerPosition(joueur2)[0];
	    int caseVerteColonne = determinerPosition(joueur2)[1];
	    int caseRougeLigne1 = determinerPosition(14)[0];
	    int caseRougeColonne1 = determinerPosition(14)[1];
	    int caseRougeLigne2 = determinerPosition(19)[0];
	    int caseRougeColonne2 = determinerPosition(19)[1];
	    int caseCielLigne1 = determinerPosition(4)[0];
	    int caseCielColonne1 = determinerPosition(4)[1];
	    int caseCielLigne2 = determinerPosition(9)[0];
	    int caseCielColonne2 = determinerPosition(9)[1];
	        
	    for (int i = 0; i < tableau.length; i++) {
	    	for (int j = 0; j < tableau[i].length; j++) { 
	    		if (i == caseBleueLigne && j == caseBleueColonne) {
	    			System.out.print("\033[44m" + String.format("%2d", tableau[i][j]) + "\033[0m "); // Case bleue
	            } else if (i == caseVerteLigne && j == caseVerteColonne) {
	                System.out.print("\033[42m" + String.format("%2d", tableau[i][j]) + "\033[0m "); // Case verte
	            } else if ((i == caseRougeLigne1 && j == caseRougeColonne1) ||(i == caseRougeLigne2 && j == caseRougeColonne2)){
	            	System.out.print("\033[41m" + String.format("%2d", tableau[i][j]) + "\033[0m "); // Case verte
	            } else if ((i == caseCielLigne1 && j == caseCielColonne1) ||(i == caseCielLigne2 && j == caseCielColonne2)){
	                System.out.print("\033[46m" + String.format("%2d", tableau[i][j]) + "\033[0m "); // Case verte
	            } else {
	                System.out.print(String.format("%2d ", tableau[i][j])); // Case blanche
	            }
	            	
	    	} 
	        System.out.println();
	    }
	}
}

