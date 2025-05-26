public class Case {

    //Atributs
    private int positionX;
    private int positionY;

    //Constructeur
    public Case (int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    //Methodes
    public String caseActuelle() {
        return positionX + " " + positionY;
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

    //Getter
    public int getPositionX () {
        return positionX;
    }

    public int getPositionY () {
        return positionY;
    }

}