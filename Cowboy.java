
public class Cowboy {

	// Attributs
	private String nom;
	private int a1, a2, a3;
	private Arme arme1, arme2, arme3;
	private int vie;
	private int energie;

	// Constructeur
	public Cowboy(String nom, int a1, int a2, int a3) { // Constructeur tres
														// long
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

	public void utiliseArme(int id_arme) {
		if (id_arme == a1) {
			this.energie = this.energie - arme1.getCoutAttaque();
		} else if (id_arme == a2) {
			this.energie = this.energie - arme2.getCoutAttaque();
		} else if (id_arme == a3) {
			this.energie = this.energie - arme3.getCoutAttaque();
		}
	}

	public void defense(int id_arme, int n) {
		if (id_arme == a1) {
			if( arme1.getCotAttaque()- n >= 0 ){
				this.vie = this.vie - (arme1.getCoutAttaque() - n);
			}
		} else if (id_arme == a2) {
			if( arme2.getCotAttaque()- n >= 0 ){
				this.vie = this.vie - (arme2.getCoutAttaque() - n);
			}
		} else if (id_arme == a3) {
			if( arme3.getCotAttaque()- n >= 0 ){
				this.vie = this.vie - (arme3.getCoutAttaque() - n);
			}
		}
	}
	
	// Verifie que le joueur a suffisament d'energie pour se defendre
	public boolean EnergieSuffisante(int n) {
		boolean b = true;
		if( this.energie < n) {
			b = false;
		}
		return b;
	}
	
		
	
	public boolean codeArme(String code_entre, String code_arme) {
		return (code_entre.equals(code_arme));
	}

	public void decryptCodeArme(String code_entre, String code_arme, int id_arme, int nb_defense) {
		if (codeArme(code_entre, code_arme)) {
			if (nb_defense == 0) {
				utiliseArme(id_arme);
			} else {
				defense(id_arme, nb_defense);
			}
		}
	}

	public boolean estMort() {
		boolean m = false;
		if (this.vie == 0) {
			m = true;
		}
		return m;
	}

}

