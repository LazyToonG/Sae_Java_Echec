public class Tour extends Piece{

	public Tour(Case destination, String couleur) {
		super(couleur,destination)
	}
	
	public boolean deplacement(Case destination) {
		new_x=destination.getPositionX;
		new_y=destination.getPositionY;
		x=this.destination.getPositionX;
		y=this.destination.getPositionY;
		return ((new_x==x && new_y!=y) || (new_x!=x && new_y==y));
	}
	
}