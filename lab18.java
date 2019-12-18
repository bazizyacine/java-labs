public class lab18 {
	public static void main(String[] args) {	
		try {
			Point a = new Point(-3, 5);
			System.out.println(a);
		}
		catch (ErrConstructeurException e) {
			System.out.println("Erreur construction Point");
			//System.out.println("Coord. erronees: " + e.getAbs() + " " + e.getOrd());
			System.out.println(e.getMessage());
			System.exit(-1) ;
		}
	}
}

class Point {
	private int abs, ord;

	public Point(int x, int y) throws ErrConstructeurException {
		if (x < 0 || y < 0) {
			///throw new ErrConstructeurException(x, y);
			throw new ErrConstructeurException("Coord. erronees: " + x + " " + y);
		}
		
		this.abs = x; 
		this.ord = y;
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

class ErrConstructeurException extends Exception { 
	private static final long serialVersionUID = 1L;
	private int abs, ord;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getAbs() {
		return abs;
	}

	public int getOrd() {
		return ord;
	}

	public ErrConstructeurException() {
		System.out.println ("L’une des coordonnées est négative !");
	}
	
	public ErrConstructeurException(int abs, int ord) {
		this.abs = abs; 
		this.ord = ord;
	}
	
	public ErrConstructeurException(String message) {
		super(message);
	}
}