import java.io.Console;

public class Jeu {

	public static void main(String args[]) {

		Console console = System.console();

		int[] armeJoueur1 = new int[3]; // Tableau d'armes en integer pour
										// Joueur 1
		int[] armeJoueur2 = new int[3]; // Tableau d'armes en integer pour
										// Joueur 2
		java.util.Scanner clavier = new java.util.Scanner(System.in);

		System.out.println("Once upon a time in the Far West...");
		System.out.println("- Je ne m'attendais pas a te revoir ici... ");
		System.out.println("- Après tant de temps...");
		System.out.println("- Qu'est ce que tu veux? ");
		System.out.println("- J'ai passe 3 ans en prison, parce que tu m'as abandonne, tu t'en souviens? ");
		System.out.println("- Comment veux-tu que j'oublie ca? ");
		System.out.println("- Je suis venu pour prendre ma vengeance! Je veux un duel!!");
		System.out.println("- Comme tu veux, cowboy, cette ville est trop petite pour nous deux... ");
		System.out.println();
		System.out.println(
				"Vous allez participer a un duel entre cowboys. Nous vous proposons sept armes, dont vous allez ");
		System.out.println("choisir trois pour les utiliser durant le duel.");
		System.out.println(
				"Chaque arme a sa capacite de frappe, mais prenez garde, les utiliser va vous couter de l'energie,  ");
		System.out.println(
				"autant que son pouvoir de frappe. Vous pourrez choisir a chaque tour la cantite d'energie que vous voulez ");
		System.out.println(
				"depenser pour vous defendre. Le spoints de vie que vous perderez sera la difference de la capacite de");
		System.out.println("frappe de l'arme de votre attaquant, et votre energie de defense.");
		System.out.println("De plus, a chaque fois que votre energie descend a 0, vous perderez 10 points de vie...");
		System.out.println();
		System.out.println("Bonne chance!");
		System.out.println();
		System.out.println();
		System.out.println();

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
		System.out.println("Choisissez vos armes:");
		int n = 0;
		for (int i = 1; i <= 3; i++) {
			do {
				System.out.print("Donnez un nombre de 1 a 7 pour choisir l'arme numero " + i + " pour Joueur 1 : ");
				String str = clavier.nextLine();
				n = Integer.parseInt(str);
			} while (!(n >= 1 && n <= 7));
			armeJoueur1[i - 1] = n;
		}

		System.out.println();

		// Touches pour le Joueur 1
		String[] combJoueur1 = new String[3]; //tableau contenant les touches pour les arme du premier joueur
		for (int i = 0; i < 3; i++) {
			System.out.print(nom1 + ", ecrivez la combinaison de touches pour votre " + (i + 1) + " arme: ");
			combJoueur1[i] = clavier.nextLine();
		}

		System.out.println();

		// Nom et armes pour Joueur 2
		System.out.print("Nom de Joueur 2: ");
		String nom2 = clavier.nextLine();
		System.out.println();
		System.out.println("Choisissez vos armes:");
		for (int i = 1; i <= 3; i++) {
			do {
				System.out.print("Donnez un nombre de 1 a 7 pour choisir l'arme numero " + i + " pour Joueur 2 : ");
				String str = clavier.nextLine();
				n = Integer.parseInt(str);
			} while (!(n >= 1 && n <= 7));
			armeJoueur2[i - 1] = n;
		}

		System.out.println();

		// Touches pour le Joueur 2
		String[] combJoueur2 = new String[3]; //tableau contenant les touches pour les arme du premier joueur
		for (int i = 0; i < 3; i++) {
			System.out.print(nom2 + ", ecrivez la combinaison de touches pour votre " + (i + 1) + " arme: ");
			combJoueur2[i] = clavier.nextLine();
		}

		// Creation de 2 joueurs avec nom et armes
		Cowboy j1 = new Cowboy(nom1, armeJoueur1[0], armeJoueur1[1], armeJoueur1[2]);
		Cowboy j2 = new Cowboy(nom2, armeJoueur2[0], armeJoueur2[1], armeJoueur2[2]);

		System.out.println();
		System.out.println("                              <<<LE DUEL DU SIECLE>>>");
		System.out.print(j1);
		System.out.print("    <----CONTRE---->    ");
		System.out.println(j2);

		// Debut du jeu

		do {
			//affichage des barres de vie et energie	
			System.out.println();
			System.out.println(nom1 + " : ");
			System.out.println("Vie:     " + j1.afficheVie() + " " + j1.getVie());
			System.out.println("Energie: " + j1.afficheEnergie() + " " + j1.getEnergie());
			System.out.println();
			System.out.println(nom2 + " : ");
			System.out.println("Vie:     " + j2.afficheVie() + j2.getVie());
			System.out.println("Energie: " + j2.afficheEnergie() + j2.getEnergie());
			System.out.println();

			// Le joueur 1 attaque, le joueur 2 se defend
			String s1 = "";
			do {
				s1 = new String(console.readPassword(nom1
						+ ", ecrivez le code de l'arme que vous voulez utiliser (le code ne sera pas affiche) : "));	
			} while (!(s1.equals(combJoueur1[0]) || s1.equals(combJoueur1[1]) || s1.equals(combJoueur1[2])));
			System.out.println("Votre code a ete enregistre.");
			System.out.println();
			System.out.print(nom2 + ", choisissez un nombre de 0 a 70 pour vous defendre:");
			
			String str_j1 = clavier.nextLine();
			int nb_defense_j1 = Integer.parseInt(str_j1);
			System.out.println();

			for (int i = 0; i < 3; i++) {
				j1.decryptCodeArme(s1, combJoueur1[i], armeJoueur1[i], -1, j1);
				j2.decryptCodeArme(s1, combJoueur1[i], armeJoueur1[i], nb_defense_j1, j1);
			}
			
			// verifie si le joueur n'est pas mort pour lui offrir la possibilite d'avoir un bonus
			if (!j1.estMort()) {
				j1.bonus();
			}

			if (j1.estMort() || j2.estMort()) {
				break;
			}

			// Le joueur 2 attaque, le joueur 1 se defend
			System.out.println();
			System.out.println(nom1 + " : ");
			System.out.println("Vie:     " + j1.afficheVie() + " " + j1.getVie());
			System.out.println("Energie: " + j1.afficheEnergie() + " " + j1.getEnergie());
			System.out.println();
			System.out.println();
			System.out.println(nom2 + " : ");
			System.out.println("Vie:     " + j2.afficheVie() + " " + j2.getVie());
			System.out.println("Energie: " + j2.afficheEnergie() + " " + j2.getEnergie());
			System.out.println();
			
			String s2 = "";
			do {
				s2 = new String(console.readPassword(nom2
						+ ", ecrivez le code de l'arme que vous voulez utiliser (le code ne sera pas afficher) : "));
			} while (!(s2.equals(combJoueur2[0]) || s2.equals(combJoueur2[1]) || s2.equals(combJoueur2[2])));
			System.out.println("Votre code a ete enregistre. ");
			System.out.println();
			System.out.print(nom1 + ", choisissez un nombre de 0 a 70 pour vous defendre:");
			
			String str_j2 = clavier.nextLine();
			int nb_defense_j2 = Integer.parseInt(str_j2);
			System.out.println();

			for (int i = 0; i < 3; i++) {
				j2.decryptCodeArme(s2, combJoueur2[i], armeJoueur2[i], -1, j2);
				j1.decryptCodeArme(s2, combJoueur2[i], armeJoueur2[i], nb_defense_j2, j2);
			}
			
			// verifie si le joueur n'est pas mort pour lui offrir la possibilite d'avoir un bonus
			if (!j2.estMort()) {
				j2.bonus();
			}
			
		} while (!j1.estMort() && !j2.estMort());

		System.out.println("Le jeu e termine.");

		if (j1.getVie() < j2.getVie()) {
			System.out.println(nom1 + " a ete moins fort, " + nom2 + " a sauve son prestige de cowboy!");
		} else if (j1.getVie() > j2.getVie()) {
			System.out.println(nom2 + " a ete moins fort, " + nom1 + " a sauve son prestige de cowboy!");
		} else {
			System.out.println("Les deux cowboys sont morts en meme temps et ils ont les memes points de vie!");
		}
	}
}
