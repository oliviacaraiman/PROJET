
public class Cowboy {

	// Attributs
	private String nom;
	private int a1, a2, a3;
	private Arme arme1, arme2, arme3;
	private int vie;
	private int energie;

	// Constructeur
	public Cowboy(String nom, int a1, int a2, int a3) { 
											
		this.nom = nom;
		this.vie = 100;
		this.energie = 100;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.arme1 = new Arme(a1);
		this.arme2 = new Arme(a2);
		this.arme3 = new Arme(a3);
	}

	// Accesseurs
	public String getNomJoueur() {
		return this.nom;
	}

	public int getVie() {
		return this.vie;
	}

	public int getEnergie() {
		return this.energie;
	}

	public int getNbArme1() {
		return this.a1;
	}

	public int getNbArme2() {
		return this.a2;
	}

	public int getNbArme3() {
		return this.a3;
	}

	public Arme getArme1() {
		return this.arme1;
	}

	public Arme getArme2() {
		return this.arme2;
	}

	public Arme getArme3() {
		return this.arme3;
	}

	public String toString() {
		String res = nom + "(" + this.getArme1().getNomArme() + ", " + this.getArme2().getNomArme() + ", "
				+ this.getArme3().getNomArme() + ")";

		return res;
	}
	
	/**
     * Méthode permettant de diminuer l'energie du joueur qui a utilise un arme pour attaquer.
     * @param id_arme : le numero de l'arme
     * La méthode modifie directement les attributs
     */
	public void utiliseArme(int id_arme) {
		if (id_arme == a1) {
			changeEnergie(arme1.getCoutAttaque());
		} else if (id_arme == a2) {
			changeEnergie(arme2.getCoutAttaque());
		} else if (id_arme == a3) {
			changeEnergie(arme3.getCoutAttaque());
		}
	}
	
	/**
     * Méthode permettant de diminuer la vie du joueur en dependance de sa defense.
     * @param n : nombre qui change l'energie
     * @param id_arme : le numero de l'arme
     * @param j : le cowboy qui utilise son arme pour attaquer 
     * La méthode modifie directement les attributs
     */
	public void defense(int id_arme, int n, Cowboy j) {
		changeEnergie(n);
		if (id_arme == j.getNbArme1()) {
			if ((j.arme1.getCoutAttaque() - n) > 0) {
				this.vie = this.vie - (j.arme1.getCoutAttaque() - n);
			}
		} else if (id_arme == j.getNbArme2()) {
			if ((j.arme2.getCoutAttaque() - n) > 0) {
				this.vie = this.vie - (j.arme2.getCoutAttaque() - n);
			}
		} else if (id_arme == j.getNbArme3()) {
			if ((j.arme3.getCoutAttaque() - n) > 0) {
				this.vie = this.vie - (j.arme3.getCoutAttaque() - n);
			}
		}
	}
	
	/**
     * Méthode permettant de diminuer l'energie du joueur.
     * @param n : nombre qui change l'energie
     * La méthode modifie directement les attributs
     */
	public void changeEnergie(int n) {
		if (!energieSuffisante(n)) {
			this.vie = this.vie - 10;
			this.energie = this.energie + 100 - n;
		} else {
			this.energie = this.energie - n;
		}
	}
	
	/**
     * Méthode permettant de verifier s'il reste suffisament d'energie pour attaquer ou se defendre
     * @param n : nombre qui change l'energie
     * @return true ou false
     */
	public boolean energieSuffisante(int n) {
		boolean b = true;
		if (this.energie < n) {
			b = false;
		}
		return b;
	}
	
	/**
     * Méthode permettant de verifier si le code entre correspond avec celui de l'arme
     * @param code_entre : le code entre
     * @param code_arme: le code reel de l'arme
     * @return true ou false
     */
	public boolean codeArme(String code_entre, String code_arme) {
		return (code_entre.equals(code_arme));
	}
	
	/**
     * Méthode faisant la liason entre la classe principale et cette classe;
     * la methode permet de voir si le joueur et dans sa poistion de defense ou d'attaque.
     * @param code_entre: le code entre par l'utlisateur chaque fois qu'il veut utilise un arme
     * @param code_arme: le code de l'arme 
     * @param id_arme: le numero de l'arme
     * @param nb_defense: nombre de points introduits par le joueur pour se defendre
     * @param j: le cowboy qui attaque
     * La méthode modifie directement les attributs
     */
	public void decryptCodeArme(String code_entre, String code_arme, int id_arme, int nb_defense, Cowboy j) {
		if (codeArme(code_entre, code_arme)) {
			if (nb_defense < 0) {
				utiliseArme(id_arme);
			} else {
				defense(id_arme, nb_defense, j);
			}
		}
	}
	
	/**
     * Méthode qui donne des bonuses aux joueurs
     * @param bon: un nombre de 0 a 0.99
     */
	public void bonus() {
		double bon = Math.random();

		if ((bon >= 0.5) && (bon < 0.7)) {
			System.out.println(nom+ ", *****Vous avez gagne une cigarette au poker! Ca vous donne 10 points d'energie******");
			changeEnergie(10);
		} else if ((bon >= 0.7) && (bon < 0.8)) {
			System.out.println(nom+ ", *****Vous avez ete invite a un verre de whiskey au saloon! Ca vous donne 30 points d'energie*****");
			this.energie = this.energie + 30;
		} else if ((bon >= 0.8) && (bon < 0.85)) {
			System.out.println(nom+", *******On vous a apporte une banane! Ca vous donne 10 points de vie*******");
			this.vie = this.vie + 10;
		} else if ((bon >= 0.85) && (bon < 0.9) && (this.vie > 10)) {
			System.out.println(nom+", *****Ouuuf! Vous vous etes heurte le pied. Vous avez perdu 10 points de vie*****");
			this.vie = this.vie - 10;
		} else if ((bon >= 0.9) && (bon < 0.95)) {
			System.out.println(nom+ ", ****Le sherif a du intervenir!!  Vous avez perdu 30 points d'energie !******");
			changeEnergie(30);
		} else if ((bon >= 0.95) && (bon < 1)&& (this.vie > 5)) {
			System.out.println(nom+", *****Oh la la! Vous avez eu un coup de soleil... vous perdez 5 points de vie !*****");
			this.vie = this.vie - 5;
		}
	}
	
	/**
     * Méthode qui affiche la vie d'un joueur
     */
	public String afficheVie(){
        
    	int n = (int)( this.getVie() / 2);
    	String res = "";
    	for( int i = 1; i <= n; i++){
        	res = res+ "#" ;
    	}
    	return res;
	}
	
	/**
     * Méthode qui affiche l'energie d'un joueur
     */
	public String afficheEnergie(){
    
    	int n = (int)( this.getEnergie() / 2);
    	String res = "";
    	for( int i = 1; i <= n; i++){
    		res = res+ "!" ;
    	}
    	return res;
	}

	/**
     * Méthode qui verifie si qqun des joueurs est mort
     */
	public boolean estMort() {
		boolean m = false;
		if (this.vie <= 0) {
			m = true;
		}
		return m;
	}

}
