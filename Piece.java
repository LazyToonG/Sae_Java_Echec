public abstract class Piece{
	private Case destination;
	private String nom;
	private String couleur;
	
	public Piece(Case destination, String nom, String couleur) {
		this.destination=destination;
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

	public abstract boolean deplacement(Case destination);

	public int avance(int new_x, int new_y) {
		if deplacement(new_x,new_y) && horsPlateau{
			mangePiece();
			this.destination.getPositionX=new_x;
			this.destination.getPositionY=new_y;
		}
	}

	public void mangePiece(Case destination){
		if destination.getPiece!=null{
			destination.deletePiece();
		}
	}

	public boolean horsPlateau(int new_x, int new_y){
		return 0<new_x<8 && 0<new_y<8;
	}

	public int allieDevant(int new_x, int new_y){
		i=this.destination.getPositionX;
		j=this.destination.getPositionY;
		if i<new_x && j==new_y{
			for(int i;i<new_x;i++){
				if (Case.getPositionX==i && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if i>new_x && j==new_y{
			for(int i;i>new_x;i--){
				if (Case.getPositionX==i && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if j<new_y && i==new_x{
			for(int j;j<new_y;j++){
				if (Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if j>new_y && i==new_x{
			for(int j;j>new_y;j--){
				if (Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if i<new_x && j<new_y{
			for(int i;i<new_x;i++){
				for (int j;j<new_y;j++){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
		if i>new_x && j<new_y{
			for(int i;i>new_x;i--){
				for(int j;j<new_y;j++){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
		if j>new_y && i<new_x{
			for(int j;j<new_y;j--){
				for(int i;i<new_y;i++){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
		if j>new_y && i>new_x{
			for(int j;j>new_y;j--){
				for(int i;i<new_y;i--){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
	}

	public int roiDevant(Case destination, int new_x, int new_y){
		i=destination.getPositionX;
		j=destination.getPositionY;
		if i<new_x && j==new_y{
			for(int i;i<new_x;i++){
				if (Case.getPositionX==i && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if i>new_x && j==new_y{
			for(int i;i>new_x;i--){
				if (Case.getPositionX==i && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if j<new_y && i==new_x{
			for(int j;j<new_y;j++){
				if (Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if j>new_y && i==new_x{
			for(int j;j>new_y;j--){
				if (Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
					return i,j;
				}
			}
		}
		if i<new_x && j<new_y{
			for(int i;i<new_x;i++){
				for (int j;j<new_y;j++){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
		if i>new_x && j<new_y{
			for(int i;i>new_x;i--){
				for(int j;j<new_y;j++){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
		if j>new_y && i<new_x{
			for(int j;j<new_y;j--){
				for(int i;i<new_y;i++){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
		if j>new_y && i>new_x{
			for(int j;j>new_y;j--){
				for(int i;i<new_y;i--){
					if (Case.getPositionX==i && Case.getPositionY==j && Case.getPiece!=null && Case.getPiece.getCouleur===this.couleur){
						return i,j;
					}
				}
			}
		}
	}

	public boolean enEchec(Case destination){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(Echiquier.getEchiquier()[i][j].getClass().getSimpleName().equals("Roi")){
					int x=i;
					int y=j;
				}
			}
		}
		return roiDevant(destination,x,y);
	}

}

