public class Cavalier extends Piece{
	
	public Cavalier(Case destination, String couleur) {
		super(couleur, destination)
	}
	
	public boolean deplacement(Case destination) {
		new_x=destination.getPositionX;
		new_y=destination.getPositionY;
		x=this.destination.getPositionX;
		y=this.destination.getPositionY;
		return ((new_x==x-2 && new_y==y-1) || (new_x==x-2 && new_y==y+1) || (new_x==x-1 && new_y==y-2) || (new_x==x+1 && new_y==y-2) || (new_x==x+2 && new_y==y-1) || (new_x==x+2 && new_y==y+1) || (new_x==x-1 && new_y==y+2) || (new_x==x+1 && new_y==y+2));
	}
	
}