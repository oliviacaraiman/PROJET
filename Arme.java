public class Arme {
	
	
	public static void main (String args[]) {
		
		// Creation des armes
		Arme a1 = new Arme(1, "Pierre", 5);
		Arme a2 = new Arme(2, "Bouteille", 10);
		Arme a3 = new Arme(3, "Baton", 15);
		Arme a4 = new Arme(4, "Couteau", 20);
		Arme a5 = new Arme(5, "Revolver", 40);
		Arme a6 = new Arme(6, "Fusile", 50);
		Arme a7 = new Arme(7, "Grenade", 70);
		
		// Presentation des armes
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		
	}
	
	// Attributs
    private String nom;
    private int coutAttaque;
    private int numero;
    
    // Constructeurs
    public Arme(int numero){
        this.numero = numero;
    }
    
    public Arme(int numero, String nom, int coutAttaque) {
		this.numero = numero;
		this.nom = nom;
		this.coutAttaque = coutAttaque;
	}
    
    // Methodes
    public int getNumero(){
        return numero;
    }
    
    public int getCoutAttaque(){
        return coutAttaque;
    }
	
	public String getNomArme() {
		return nom;
	}
	
    public String toString(){
        String res = this.numero + ") " + this.nom + " : Capacite de frappe = " + this.coutAttaque;
        return res;            
    }
    
    
}

