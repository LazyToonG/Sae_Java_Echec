public class Roi extends Piece{
	private int x;
	private int y;
	
	public Roi(int x,int y, String couleur) {
		super(x,y,"ROI",couleur)
	}
	
	public boolean deplacement(int new_x, int new_y) {
			return (new_x==x-1 || new_y==y-1 || new_x==x+1 || new_y==y+1);
	}
	
	public boolean EnEchec() {
	}
}