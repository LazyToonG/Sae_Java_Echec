public class Pion extends Piece{
    
    public pion (int deplacementX, int deplacementY)  {
        super(deplacementX, deplacementY);
    }


    public boolean deplacement(Case destination){
        if (destination.getPositionX()+1==destination.getPositionX())
    		return true;
        if(destination.getPositionX()+1==destination.getPositionX() && destination.getPositionY()+1==destination.getPositionY())
    		return true;
        return false;
    }

    public int avanceDeDeux (int deplacementX) {
        if (deplacementX.equal(7) || deplacementX.equal(2)){

        }
    }
}
