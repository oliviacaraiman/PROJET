public class Jeu {
	
	public static void main (String args[]) {
		
        int[] armeJoueur1 = new int[3];
        int[] armeJoueur2 = new int[3];
        java.util.Scanner clavier = new java.util.Scanner(System.in);
        
        
        // Nom et armes pour Joueur 1
        System.out.print("Nom de Joueur 1: ");
        String nom1 = clavier.nextLine();
        for (int i=1; i<=3; i++) {
                System.out.print("Arme " + i + " pour Joueur 1 : ");
                String str = clavier.nextLine();
                armeJoueur1[i] = Integer.parseInt(str); 
            }
        
        // Nom et armes pour Joueur 2    
        System.out.print("Nom de Joueur 1: ");
        String nom2 = clavier.nextLine();
        for (int i=1; i<=3; i++) {
                System.out.print("Arme " + i + " pour Joueur 2 : ");
                String str = clavier.nextLine();
                armeJoueur2[i] = Integer.parseInt(str); 
            }
            
        
	}
}

