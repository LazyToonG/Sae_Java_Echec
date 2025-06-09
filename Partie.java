 import java.util.Scanner;
 
 public class Partie {

   Echiquier plateau = new Echiquier();
   //Roi roi = new Roi(null, null);
   String[] listeCoups;

   Scanner demandeNom = new Scanner(System.in);
   System.out.println("Entrer un premier nom de joueur");
   String nom = demandeNom.nextLine();
   Joueur joueur1 = new Joueur(nom,'blanc');

   Scanner demandeNom = new Scanner(System.in);
   System.out.println("Entrer un deuxième nom de joueur");
   String nom = demandeNom.nextLine();
   Joueur joueur2 = new Joueur(nom,'noir');

   Joueur joueurCourant=joueur1;

   public void afficheJeu(){
      System.out.println(plateau.getEchiquier());
   }

   public void afficheCoups(){
      for(int i=0;i<listeCoups.length;i++){
         System.out.println(listeCoups[i])
      }
   }

   public Joueur changementJoueur(Joueur joueurCourant){
      if(joueurCourant.getNom()==joueur1.getNom()){
         joueurCourant=joueur2;
      }
      if(joueurCourant.getNom()==joueur2.getNom()){
         joueurCourant=joueur1;
      }
   }

   public Class detectePiece(String nom){
      if(nom=='cavalier'){return Cavalier;}
      if(nom=='dame'){return Dame;}
      if(nom=='fou'){return Fou;}
      if(nom=='Pion'){return Pion;}
      if(nom=='roi'){return Roi;}
      if(nom=='tour'){return Tour;}
   }

   public void tour(Joueur joueurCourant){
      while (Roi.echecEtMat()==false){
         afficheJeu();
         afficheCoups();

         Scanner demandePiece = new Scanner(System.in);
         System.out.println("Entrer le nom de la pièce que vous voulez bouger");
         String nomPiece = demandePiece.nextLine();
         Scanner demandeCoup = new Scanner(System.in);
         System.out.println("Entrer ses nouvelles coordonnées x");
         String coupX = demandeCoup.nextLine();
         Scanner demandeCoup = new Scanner(System.in);
         System.out.println("Entrer ses nouvelles coordonnées y");
         String coupY = demandeCoup.nextLine();

         Class piece = detectePiece(nomPiece);
         boolean piece.deplacement(coupX,coupY);
         changementJoueur(joueurCourant);
      }
   }

 }
