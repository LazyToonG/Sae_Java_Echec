public class Piece{
	private int x;
	private int y;
	private String nom;
	private String couleur;
	
	public Piece(int x,int y, String nom, String couleur) {
		this.x=x;
		this.y=y;
		this.nom=nom;
		this.couleur=couleur;
	}
	
	public String getNom(){
		return nom;
	}

	public String getCouleur(){
		return couleur;
	}

	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public int avance(int new_x, int new_y) {
		if deplacement(new_x,new_y){
			this.x=new_x;
			this.y=new_y;
		}
	}

}

