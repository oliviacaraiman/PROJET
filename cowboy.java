public class Cowboy {

// cowboy Attributs
    private String pseudo;
    private Arme arme1, arme2, arme3;
    private int vie;
    private int energie; 
    
    // constructeurs
    public Cowboy(String pseu, int a1, int a2, int a3) {
        pseudo = pseu;
        vie = 100;
        energie = 100;
        a1= this.a1;
        a2= this.a2;
        a3= this.a3;
        }
        
        
        // accesseurs
        public String getPseudo() {
            return pseudo;
        }
        
        public void setArme1(int a1) {
			arme1 = Arme(a1); 
        }
        
        public void setArme2(int a2) {
			arme2 = Arme(a2); 
        }
        
        public void setArme3(int a3) {
			arme3 = Arme(a3); 
        }   
        
          
}
            
        
        
        
        
        
        
        
        
        
    
