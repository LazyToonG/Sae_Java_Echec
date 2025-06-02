public class Roi extends Piece{
	private int x;
	private int y;
	
	public Roi(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public boolean deplacement(int new_x, int new_y) {
			return (new_x==x-1 || new_y==y-1 || new_x==x+1 || new_y==y+1);
	}
	
	public boolean EnEchec() {
	}
}