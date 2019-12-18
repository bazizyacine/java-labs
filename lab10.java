
public class lab10 {
	public static void main(String[] args) {

		System.out.println("Méthode affiche de la classe Point :");
		Point p0 = new Point(3, 5);
		p0.affiche();
		System.out.println("Méthode affiche de la classe PointColore :");
		PointColore p1 = new PointColore(4, 8, (byte) 2);
		p1.affiche();
		System.out.println("Méthode affiche de la classe PointEtq :");
		PointEtq p3 = new PointEtq(1, 2, (byte) 7, "etq");
		p3.affiche();
		
		A a = new A() ;
		B b = new B() ;
		int n = 3;
		
		a.f(n);
		b.f(n);
		a = b;
		a.f(n);
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
}

class A {
	public A() {}
	public void f(float x) { System.out.println("1"); }
}

class B extends A {
	public B() {}
	public void f(float x) { System.out.println("2"); } // redéfinition de f
	public void f(int n) { System.out.println("3"); } // surcharge de f
}
