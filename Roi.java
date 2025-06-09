public class Roi extends Piece{
	
	public Roi(Case destination, String couleur) {
		super(destination,couleur)
	}
	
	public boolean deplacement(int new_x, int new_y) {
			return (new_x==x-1 || new_y==y-1 || new_x==x+1 || new_y==y+1);
	}
	
	public boolean EnEchec() {
	}
}