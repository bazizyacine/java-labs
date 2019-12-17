
public class lab9 {
	public static void main(String[] args) {
		PointColore pc = new PointColore(1, 5, (byte) 3);
		
		System.out.printf("Abscisse : %d, Ordonnée : %d, Couleur : %d\n", 
				pc.getAbs(), pc.getOrd(), pc.getCouleur());
		
		pc.affiche();
	}
}


class Point{
	private int abs, ord;
	
	// constructeur1
	public Point () {
	}
	
	// constructeur2
	public Point(int x) {
		this.abs = x; this.ord = x;
	}
	
	// constructeur3
	public Point(int x, int y) {
		this.abs = x; this.ord = y;
	}

	// constructeur4
	public Point(Point p) {
		this.abs = p.abs; this.ord = p.ord;
	}
	
	public int getAbs() {
		return abs;
	}

	public void setAbs(int abs) {
		this.abs = abs;
	}

	public int getOrd() {
		return ord;
	}

	public void setOrd(int ord) {
		this.ord = ord;
	}

	public void affiche() {
		System.out.println("Abscisse : " + this.abs +" Ordonnee : " + this.ord);
	}
}

class PointColore extends Point {
	private byte couleur;
	
	public PointColore(int x, int y, byte couleur) {
		super(x);
		this.couleur = couleur;
	}
	
	public void setCouleur(byte couleur) {
		this.couleur = couleur;
	}
	
	public byte getCouleur() {
		return couleur;
	}
	
	public void affiche() {
		super.affiche();
		System.out.print("Couleur : " + this.couleur) ;
	}
}