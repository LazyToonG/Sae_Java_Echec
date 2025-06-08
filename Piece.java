public class Piece{
	private Case destination;
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

	public Case getDestination(){
		return destination;
	}

	public void setDestination(Case destination){
		this.destination=destination;
	}

	public int avance(int new_x, int new_y) {
		if deplacement(new_x,new_y){
			mangePiece();
			this.destination.getPositionX=new_x;
			this.destination.getPositionY=new_y;
		}
	}

	public void mangePiece(){
		if Case.getPiece===null{
			Case.deletePiece();
		}
	}

}

