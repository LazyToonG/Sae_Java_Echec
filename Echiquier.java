import java.util.*;

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
            echiquier[8][3].setPiece(new Roi);
            echiquier[8][4].setPiece(new Dame);
            echiquier[8][5].setPiece(new Fou);
            echiquier[8][6].setPiece(new Cavalier);
            echiquier[8][7].setPiece(new Tour);
            for (int i = 0; i < 8; i++) {
                echiquier[7][i].setPiece(new Pion());
            }
        }
    }

    public String demandeCase(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Veuiller mettre une case");
        String nomCase = sc.nextLine();
        sc.close();
        return nomCase;
    }

    public int traduitCaseColonne(){
        int indexColonneInt;
        char indexColonneChar = demandeCase().charAt(0);
        if (indexColonneChar == 'a' || indexColonneChar == 'A'){
            indexColonneInt = 0;}
        if (indexColonneChar == 'b' || indexColonneChar == 'B'){
            indexColonneInt = 1;}
        if (indexColonneChar == 'c' || indexColonneChar == 'C'){
            indexColonneInt = 2;}
        if (indexColonneChar == 'd' || indexColonneChar == 'D'){
            indexColonneInt = 3;}
        if (indexColonneChar == 'e' || indexColonneChar == 'E'){
            indexColonneInt = 4;}
        if (indexColonneChar == 'f' || indexColonneChar == 'F'){
            indexColonneInt = 5;}
        if (indexColonneChar == 'g' || indexColonneChar == 'G'){
            indexColonneInt = 6;}
        if (indexColonneChar == 'h' || indexColonneChar == 'H'){
            indexColonneInt = 7;}
        else {indexColonneInt = -1;}
        return indexColonneInt;
    }
        

    public int traduitCaseLigne(){
        int indexLigneInt;
        char indexLigneChar = demandeCase().charAt(1);
        if (indexLigneChar == '8'){
            indexLigneInt = 0;}
        if (indexLigneChar == '7'){
            indexLigneInt = 1;}
        if (indexLigneChar == '6'){
            indexLigneInt = 2;}
        if (indexLigneChar == '5'){
            indexLigneInt = 3;}
        if (indexLigneChar == '4'){
            indexLigneInt = 4;}
        if (indexLigneChar == '3'){
            indexLigneInt = 5;}
        if (indexLigneChar == '2'){
            indexLigneInt = 6;}
        if (indexLigneChar == '1'){
            indexLigneInt = 7;}
        else {indexLigneInt = -1;}
        return indexLigneInt;
    }

    public void bougerPion(){
        
    }


    public Case[][] getEchiquier (){
        return echiquier;
    }

		
}



    
