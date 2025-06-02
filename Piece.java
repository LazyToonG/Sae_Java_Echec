public class Piece{
	private int x;
	private int y;
	
	public Piece(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public int avance(int new_x, int new_y) {
		if deplacement(int new_x,int new_y) && Case(new_x,new_y) {
			this.x=new_x;
			this.y=new_y;
		}
	}
}

