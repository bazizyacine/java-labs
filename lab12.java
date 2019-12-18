
public class lab12 {
	public static void main(String[] args) {
	  
		Point a = new Point (1, 2);
		Point b = new Point (1, 2);
		Object o1 = new Point (1, 2);
		Object o2 = new Point (1, 2);
		
		if (a.equals(b) == true) 
			System.out.println("a = b");
		else 
			System.out.println("a != b");
		
		if (o1.equals(o2) == true) 
			System.out.println("o1 = o2");
		else 
			System.out.println("o1 != o2");
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
		System.out.println("Abscisse : " + this.abs + " Ordonnee : " + this.ord);
	}
	
	public String toString() {
		return " Abscisse : " + this.abs +
				" Ordonnee : " + this.ord;
	}
	
    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {           
            return ((Point) object).abs == this.abs && ((Point) object).ord == this.ord;
        } 
        else
            return false;
    }
}

class PointColore extends Point {
	private byte couleur;
	
	public PointColore(int x, int y, byte couleur) {
		super(x, y);
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
		System.out.println("Couleur : " + this.couleur) ;
	}
	
	public String toString() {
		return super.toString() + " Couleur : " + this.couleur;
	}
}

class PointEtq extends PointColore {
	private String etq;
	
	public PointEtq(int x, int y, byte couleur, String etq) {
		super(x, y, couleur);
		this.etq = etq;
	}
	
	public void setEtq(String etq) {
		this.etq = etq;
	}
	
	public String getEtq() {
		return etq;
	}
	
	public void affiche() {
		super.affiche();
		System.out.println("Etq : " + this.etq) ;
	}
	
	public String toString() {
		return super.toString() + " Etq : " + this.etq;
	}
}

class A {
	public A() {}
	public void f(float x) { System.out.println("1"); }
}

class B extends A {
	public B() {}
	public void f(int n) { System.out.println("3"); } // surcharge de f
	public void f(float x) { System.out.println("2"); } // redéfinition de f
}
