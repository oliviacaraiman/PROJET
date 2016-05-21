public class Jeu {
	
	public static void main (String args[]) {
		
        int[] armeJoueur1 = new int[3];  								// Tableau d'armes en integer pour Joueur 1
        int[] armeJoueur2 = new int[3];  								// Tableau d'armes en integer pour Joueur 2
        java.util.Scanner clavier = new java.util.Scanner(System.in);
        
        // Creation des armes
		Arme a1 = new Arme(1, "Pierre", 5);
		Arme a2 = new Arme(2, "Bouteille", 10);
		Arme a3 = new Arme(3, "Baton", 15);
		Arme a4 = new Arme(4, "Couteau", 20);
		Arme a5 = new Arme(5, "Revolver", 40);
		Arme a6 = new Arme(6, "Fusile", 50);
		Arme a7 = new Arme(7, "Grenade", 70);
        
        // Presentation des armes
        System.out.println("Voici la liste des armes disponibles:");
        System.out.println();
        System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
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
        
		System.out.println();
		System.out.println("                              <<<LA BATAILLE DU SIECLE>>>");
		System.out.print(j1);System.out.print("    <----CONTRE---->    ");System.out.println(j2);
		
		
	}
}

