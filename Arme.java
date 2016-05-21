public class Arme {
	
	
	public static void main (String args[]) {
		
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
    
    public String getNom(){
        return nom;
    }
    
    public int getCoutAttaque(){
        return coutAttaque;
    }
	
    public String toString(){
        String res = this.numero + ") " + this.nom + " : Capacite de frappe = " + this.coutAttaque;
        return res;            
    }
    
    
}

