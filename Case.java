public class Case {

    //Atributs
    private int positionX;
    private int positionY;
    private Piece piece;

    //Constructeur
    public Case (int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.piece = null;
    }

    //Methodes
    







    public boolean caseActuelle(Piece p) {
        if (p == null){
            this.contientPiece = false;
        } else {
            this.contentpiece = true;
        }
    }

    public void caseChoisie (int positionX, int positionY) {
        if (dansEchiquier()){
            this.positionX = positionX;
            this.positionY = positionY;
        }
    }

    public boolean dansEchiquier() {
        return positionX<9 && positionY<9; 
    }

    //Setter
    public void setPositionX (int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY (int positionY) {
        this.positionY = positionY;
    }

    public void setPiece(Piece piece){
		this.piece = piece;
	}

    //Getter
    public int getPositionX () {
        return positionX;
    }

    public int getPositionY () {
        return positionY;
    }

    public Piece getPiece () {
        return piece;
    }










    public boolean contientPiece(){
        return contientPiece;
    }

}