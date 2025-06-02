public class Cavalier extends Piece{
	private int x;
	private int y;
	
	public Cavalier(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public boolean deplacement(int new_x, int new_y) {
		return ((new_x==x-2 && new_y==y-1) || (new_x==x-2 && new_y==y+1) || (new_x==x-1 && new_y==y-2) || (new_x==x+1 && new_y==y-2) || (new_x==x+2 && new_y==y-1) || (new_x==x+2 && new_y==y+1) || (new_x==x-1 && new_y==y+2) || (new_x==x+1 && new_y==y+2));
	}
	
}