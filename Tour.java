public class Tour extends Piece{
	private int x;
	private int y;
	
	public Tour(int x,int y, String couleur) {
		super(x,y,"TOUR",couleur)
	}
	
	public boolean deplacement(int new_x, int new_y) {
		return ((new_x==x && new_y!=y) || (new_x!=x && new_y==y));
	}
	
}