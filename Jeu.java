public class Jeu {
	
	public static void main (String args[]) {
		
        int[] armeJoueur1 = new int[3];  								// Tableau d'armes en integer pour Joueur 1
        int[] armeJoueur2 = new int[3];  								// Tableau d'armes en integer pour Joueur 2
        java.util.Scanner clavier = new java.util.Scanner(System.in);
        
        // Creation des armes
		Arme pierre = new Arme(1, "Pierre", 5);
		Arme bouteille = new Arme(2, "Bouteille", 10);
		Arme baton = new Arme(3, "Baton", 15);
		Arme couteau = new Arme(4, "Couteau", 20);
		Arme revolver = new Arme(5, "Revolver", 40);
		Arme fusile = new Arme(6, "Fusile", 50);
		Arme grenade = new Arme(7, "Grenade", 70);
        
        // Presentation des armes
        System.out.println(pierre);
		System.out.println(bouteille);
		System.out.println(baton);
		System.out.println(couteau);
		System.out.println(revolver);
		System.out.println(fusile);
		System.out.println(grenade);
		System.out.println();
        
        // Nom et armes pour Joueur 1
        System.out.print("Nom de Joueur 1: ");
        String nom1 = clavier.nextLine();
        System.out.println();
        int n=0;
        for (int i=1; i<=3; i++) {
			do {
				System.out.print("Donnez un nombre de 1 a 7 pour choisir l'arme numero " + i + " pour Joueur 1 : ");
				String str = clavier.nextLine();
				n = Integer.parseInt(str);
			} while (!(n>=1 && n<=7));
            armeJoueur1[i-1] = n; 
        }
        
        System.out.println();
        
        
        // Nom et armes pour Joueur 2    
        System.out.print("Nom de Joueur 2: ");
        String nom2 = clavier.nextLine();
        System.out.println();
        for (int i=1; i<=3; i++) {
            do {
				System.out.print("Donnez un nombre de 1 a 7 pour choisir l'arme numero " + i + " pour Joueur 2 : ");
				String str = clavier.nextLine();
				n = Integer.parseInt(str);
			} while (!(n>=1 && n<=7));
            armeJoueur2[i-1] = n; 
        }
        
        // Creation de 2 joueurs avec nom et armes    
        Cowboy j1 = new Cowboy(nom1, armeJoueur1[0], armeJoueur1[1], armeJoueur1[2]);
        Cowboy j2 = new Cowboy(nom2, armeJoueur2[0], armeJoueur2[1], armeJoueur2[2]);
    
		
	}
}

