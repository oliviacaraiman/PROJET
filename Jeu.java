public class Jeu {
	
	public static void main (String args[]) {
		
        
        int[] armeJoueur1 = new int[3];
        int[] armeJoueur2 = new int[3];
        
        System.out.println("Nom de Joueur 1:");
        java.util.Scanner clavier = new java.util.Scanner(System.in);
        String nom1 = clavier.nextLine();
        
        for (int i=1; i<=3; i++) {
                System.out.println("Arme " + i + " pour Joueur 1 :");
                String str = clavier.nextLine();
                int tabNumero1[i] = Integer.parseInt(str); 
            }
            
        for (int i=1; i<=3; i++) {
                System.out.println("Arme " + i + " pour Joueur 2 :");
                String str = clavier.nextLine();
                int tabNumero2[i] = Integer.parseInt(str); 
            }
            
        
            
            
       
            
        
        System.out.println("Arme 1 pour Joueur 1:");
            java.util.Scanner clavier = new java.util.Scanner(System.in);
            String str = clavier.nextLine();
            int n1 = Integer.parseInt(str);
            System.out.println("Arme 2 pour Joueur 1:");
            java.util.Scanner clavier = new java.util.Scanner(System.in);
            String str = clavier.nextLine();
            int n2 = Integer.parseInt(str);
            System.out.println("Arme 3 pour Joueur 1:");
            java.util.Scanner clavier = new java.util.Scanner(System.in);
            String str = clavier.nextLine();
            int n3 = Integer.parseInt(str);
	}
}

