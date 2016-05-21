public class Cowboy {

    // Attributs
    private String nom;
    private int a1, a2, a3;
    private Arme arme1, arme2, arme3;
    private int vie;
    private int energie; 
    
    // Constructeur
    public Cowboy(String nom, int a1, int a2, int a3) {    				// Constructeur tres long
        this.nom = nom;
        this.vie = 100;
        this.energie = 100;
        this.a1= a1;
        this.a2= a2;
        this.a3= a3;
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
        String res = nom + "(" + this.getArme1().getNomArme() + ", "
					+ this.getArme2().getNomArme() + ", "+this.getArme3().getNomArme()+")";
        
        return res;            
    }
			  
}
            
        
              
        
        
        
        
        
        
    
