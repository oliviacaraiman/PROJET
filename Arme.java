
public class Arme {
	
    private String nom;
    private int cout;
    private int attaque;
    private int numero;
    
    public Arme(int numero ){
        numero = this.numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public int getAttaque(int numero){
        return attaque(numero);
    }
    
    public String getNom(){
        return nom;
    }
    
    public int getCout(){
        return cout;
    }
    
    public void setArme(int numero){
    	n = numero;
    	if (n=1) {
    		cout = 5;
    		nom = "pierre";
    		attaque = 5;
    	}
    	if (n=2) {
    		cout = 10;
    		nom = "bouteille";
    		attaque = 10;
    	}
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

