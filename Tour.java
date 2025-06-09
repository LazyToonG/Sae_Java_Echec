public class Tour extends Piece{

	public Tour(Case destination, String couleur) {
		super(couleur,destination)
	}
	
	public boolean deplacement(Case destination) {
		int new_x=destination.getPositionX;
		int new_y=destination.getPositionY;
		int x=this.destination.getPositionX;
		int y=this.destination.getPositionY;
		return ((new_x==x && new_y!=y) || (new_x!=x && new_y==y));
	}
	
}