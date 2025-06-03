public class Echiquier {

    private Case[][] echiquier;

    public Echiquier (Case[][] echiquier) {
        this.echiquier = echiquier;
        for (int i = 0; i< 8; i++){
            for (int y = 0; y < 8; y++) {
                echiquier[i][y] = new Case(i,y);
            }
            echiquier[0][0].setPiece(new Tour());
            echiquier[0][1].setPiece(new Cavalier);
            echiquier[0][2].setPiece(new Four);
            echiquier[0][3].setPiece(new Dame);
            echiquier[0][4].setPiece(new Roi);
            echiquier[0][5].setPiece(new Fou);
            echiquier[0][6].setPiece(new Cavalier);
            echiquier[0][7].setPiece(new Tour);
            for (int i = 0; i < 8; i++) {
                echiquier[1][i].setPiece(new Pion());
            }
            echiquier[8][0].setPiece(new Tour());
            echiquier[8][1].setPiece(new Cavalier);
            echiquier[8][2].setPiece(new Four);
            echiquier[8][3].setPiece(new Dame);
            echiquier[8][4].setPiece(new Roi);
            echiquier[8][5].setPiece(new Fou);
            echiquier[8][6].setPiece(new Cavalier);
            echiquier[8][7].setPiece(new Tour);
            for (int i = 0; i < 8; i++) {
                echiquier[7][i].setPiece(new Pion());
            }
        }

    }

    public Case[][] getEchiquier (){
        return echiquier;
    }

		
}



    
