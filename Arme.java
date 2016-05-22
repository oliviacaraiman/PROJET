public class Arme {
	
	// Attributs
    private String nom;
    private int coutAttaque;
    private int numero;
    
    // Constructeurs
    public Arme(int numero){
        this.numero = numero;
        int n = this.numero;
        // Noms
        if(n == 1) {
        	this.nom = "Pierre";
        	this.coutAttaque = 5;
        }
        else if(n == 2) {
        	this.nom = "Bouteille";
        	this.coutAttaque = 10;
        }
        else if(n == 3) {
        	this.nom = "Lasso";
        	this.coutAttaque = 15;
        }
        else if(n == 4) {
        	this.nom = "Couteau";
        	this.coutAttaque = 20;
        }
        else if(n == 5) {
        	this.nom = "Revolver";
        	this.coutAttaque = 40;
        }
        else if(n == 6) {
        	this.nom = "Fusile";
        	this.coutAttaque = 50;
        }
        else if (n == 7) {
        	this.nom = "Dynamite";
        	this.coutAttaque = 70;
        }
    }
    //fin constructeur
    
    
    
    //Methodes
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

