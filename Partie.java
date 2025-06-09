 public class Partie {

    Echiquier plateau = new Echiquier();
    Roi roi = new Roi(null, null);

    public void afficheJeu(){
      while (roi.EnEchec() == false){
         System.out.println(plateau.getEchiquier());
      }
    }
 }
