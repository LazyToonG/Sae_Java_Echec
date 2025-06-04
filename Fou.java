public class Fou extends Pion{

    public Fou (int deplacementX, int deplacementY, String couleur, Case destination){
        super(deplacementX, deplacementY, couleur, destination);
    }


    public boolean deplacement(Case destination){
    	for(int i=0; i<= 8; i++){
    		if(this.destination.getPositionX()+i==getPositionX() && this.getPositionY()+i==getPositionY()){
    			return true;}
    		if(this.x-i==x && this.y-i==y)
    			return true;
    		if(this.x+i==x && this.y-i==y)
    			return true;
    		if(this.x-i==x && this.y+i==y)
    			return true; 		
    	}
    		return false;
    	
    	
    }
}