public class Jeu{
	
	public static void main (String args[]) {
		
        int[] armeJoueur1 = new int[3];  								// Tableau d'armes en integer pour Joueur 1
        int[] armeJoueur2 = new int[3];  								// Tableau d'armes en integer pour Joueur 2
        java.util.Scanner clavier = new java.util.Scanner(System.in);
        
        System.out.println( " Once upon a time in the Far West...");
        System.out.println(" - Je ne m'attendais pas a te revoir ici... ");
        System.out.println(" - Après tant de temps...");
        System.out.println(" - Qu'est ce que tu veux? ");
        System.out.println(" - J'ai passe 3 ans en prison, parce que tu m'as abandonne, tu t'en souviens? ");
        System.out.println(" - Comment veux-tu que j'oublie ca? ");
        System.out.println(" - Je suis venu pour prendre ma vengeance! Je veux un duel!!");
        System.out.println(" - Comme tu veux, cowboy, cette ville est trop petite pour nous deux... ");
        System.out.println();
        System.out.println(" Vous allez participer a un duel entre cowboys. Nous vous proposons sept armes, dont vous allez ");
        System.out.println(" choisir trois pour les utiliser durant le duel.");
        System.out.println(" Chaque arme a sa capacite de frappe, mais prenez garde, les utiliser va vous couter de l'energie,  ");
        System.out.println(" autant que son pouvoir de frappe. Vous pourrez choisir a chaque tour la cantite d'energie que vous voulez ");
        System.out.println(" depenser pour vous defendre. Le spoints de vie que vous perderez sera la difference de la capacite de");
        System.out.println(" frappe de l'arme de votre attaquant, et votre energie de defense.");
        System.out.println();
        System.out.println(" Bonne chance!");
        
        // Creation des armes
		Arme a1 = new Arme(1);
		Arme a2 = new Arme(2);
		Arme a3 = new Arme(3);
		Arme a4 = new Arme(4);
		Arme a5 = new Arme(5);
		Arme a6 = new Arme(6);
		Arme a7 = new Arme(7);
        
        // Presentation des armes
        System.out.println("Voici la liste des armes disponibles:");
        System.out.println();
        System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		System.out.println(a6.toString());
		System.out.println(a7.toString());
		System.out.println();
        
        // Nom et armes pour Joueur 1
        System.out.print("Nom de Joueur 1: ");
        String nom1 = clavier.nextLine();
        System.out.println();
        System.out.println(" Choisissez vos armes:");
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
        System.out.println(" Choisissez vos armes:");
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

