
public class lab9 {
	public static void main(String[] args) {
		PointColore pc = new PointColore(1, 5, (byte) 3);
		
		System.out.printf("Abscisse : %d, Ordonnée : %d, Couleur : %d", 
				pc.getABS(), pc.getORD(), pc.getCouleur());
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
	
	public int getABS() {
	    return abs;
	 }  
	
	public int getORD() {
	    return ord;
	 }  
}

class PointColore extends Point {
	private byte couleur;
	
	public PointColore(int x, int y, byte couleur) {
		super(x);
		this.couleur = couleur ;
	}
	
	public void setCouleur(byte couleur) {
		this.couleur = couleur ;
	}
	
	public byte getCouleur() {
		return couleur;
	}
}