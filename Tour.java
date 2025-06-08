public class Tour extends Piece{
	private Case destination;
	
	public Tour(Case destination, String couleur) {
		super(destination,"TOUR",couleur)
	}
	
	public boolean deplacement(int new_x, int new_y) {
		return ((new_x==x && new_y!=y) || (new_x!=x && new_y==y));
	}

	public boolean echec(){}
	
}