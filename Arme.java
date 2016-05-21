
public class Arme {
	
    private String nom;
    private int cout;
    private int attaque;
    private int numero;
    
    public Arme( String nom, int cout, int frappe, int numero ){
        this.nom = nom;
        this.cout = cout;
        this.attaque = frappe;
        this.numero = numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getAttaque(){
        return attaque;
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getCout(){
        return cout;
    }
    
    public String toString(){
        String res = this.getNumero() + ": "
                    + this.getNom() + " capacité de frappe: " 
                    + this.getAttaque() + " cout en energie: " 
                    + this.getCout();
        
        return res;            
    }
    
    public static void main(String [] args){
        
        
    }
}

