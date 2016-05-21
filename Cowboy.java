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
        this.a1= a1;
        this.a2= a2;
        this.a3= a3;
        }
        
	// Accesseurs
	public String getNom() {
		return this.nom;
	}
	
	public int getVie() {
		return this.vie;
	}
	
	public int getEnergie() {
		return this.energie;
	}
	
	public int getArme1() {
		return this.a1;
	}
	
	public int getArme2() {
		return this.a2;
	}
	
	public int getArme3() {
		return this.a3;
	}
			
	public String toString() {
        String res = "Ce cowboy s'appelle "+ getNom() + " et il a choisi comme arme: ";
        
        return res;            
    }
			  
}
            
        
        
        
        
        
        
        
        
        
    
