public class Cowboy {
	
	public static void main (String args[]) {
		
		// Creation des armes
		Arme a1 = new Arme(1, "Pierre", 5);
		Arme a2 = new Arme(2, "Bouteille", 10);
		Arme a3 = new Arme(3, "Baton", 15);
		Arme a4 = new Arme(4, "Couteau", 20);
		Arme a5 = new Arme(5, "Revolver", 40);
		Arme a6 = new Arme(6, "Fusile", 50);
		Arme a7 = new Arme(7, "Grenade", 70);
		
	}

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
        
        //switch (a1) {
			//case 1: this.arme1 = new Arme(1, "Pierre", 5); break;
			//case 2: this.arme1 = new Arme(2, "Bouteille", 10); break;
			//case 3: this.arme1 = new Arme(3, "Baton", 15); break;
			//case 4: this.arme1 = new Arme(4, "Couteau", 20); break;
			//case 5: this.arme1 = new Arme(5, "Revolver", 40); break;
			//case 6: this.arme1 = new Arme(6, "Fusile", 50); break;
			//case 7: this.arme1 = new Arme(7, "Grenade", 70); break;
		//}
        //switch (a2) {
			//case 1: this.arme1 = new Arme(1, "Pierre", 5); break;
			//case 2: this.arme1 = new Arme(2, "Bouteille", 10); break;
			//case 3: this.arme1 = new Arme(3, "Baton", 15); break;
			//case 4: this.arme1 = new Arme(4, "Couteau", 20); break;
			//case 5: this.arme1 = new Arme(5, "Revolver", 40); break;
			//case 6: this.arme1 = new Arme(6, "Fusile", 50); break;
			//case 7: this.arme1 = new Arme(7, "Grenade", 70); break;
		//}
        //switch (a3) {
			//case 1: this.arme1 = new Arme(1, "Pierre", 5); break;
			//case 2: this.arme1 = new Arme(2, "Bouteille", 10); break;
			//case 3: this.arme1 = new Arme(3, "Baton", 15); break;
			//case 4: this.arme1 = new Arme(4, "Couteau", 20); break;
			//case 5: this.arme1 = new Arme(5, "Revolver", 40); break;
			//case 6: this.arme1 = new Arme(6, "Fusile", 50); break;
			//case 7: this.arme1 = new Arme(7, "Grenade", 70); break;
		//}
		
		
        
		if (a1==1) {
			this.arme1 = new Arme(1, "Pierre", 5);
		}
		if (a1==2) {
			this.arme1 = new Arme(2, "Bouteille", 10);
		}
		if (a1==3) {
			this.arme1 = new Arme(3, "Baton", 15);
		}
		if (a1==4) {
			this.arme1 = new Arme(4, "Couteau", 20);
		}
		if (a1==5) {
			this.arme1 = new Arme(5, "Revolver", 40);
		}
		if (a1==6) {
			this.arme1 = new Arme(6, "Fusile", 50);
		}
		if (a1==7) {
			this.arme1 = new Arme(7, "Grenade", 70);
		}
		
        if (a2==1) {
			this.arme2 = new Arme(1, "Pierre", 5);
		}
        if (a2==2) {
			this.arme2 = new Arme(2, "Bouteille", 10);
		}
        if (a2==3) {
			this.arme2 = new Arme(3, "Baton", 15);
		}
        if (a2==4) {
			this.arme2 = new Arme(4, "Couteau", 20);
		}
        if (a2==5) {
			this.arme2 = new Arme(5, "Revolver", 40);
		}
        if (a2==6) {
			this.arme2 = new Arme(6, "Fusile", 50);
		}
        if (a2==7) {
			this.arme2 = new Arme(7, "Grenade", 70);
		}
		
        if (a3==1) {
			this.arme3 = new Arme(1, "Pierre", 5);
		}
        if (a3==2) {
			this.arme3 = new Arme(2, "Bouteille", 10);
		}
        if (a3==3) {
			this.arme3 = new Arme(3, "Baton", 15);
		}
        if (a3==4) {
			this.arme3 = new Arme(4, "Couteau", 20);
		}
        if (a3==5) {
			this.arme3 = new Arme(5, "Revolver", 40);
		}
        if (a3==6) {
			this.arme3 = new Arme(6, "Fusile", 50);
		}
        if (a3==7) {
			this.arme3 = new Arme(7, "Grenade", 70);
		}
        
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
            
        
        
        
        
        
        
        
        
        
    
