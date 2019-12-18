
public class lab16 {
	public static void main(String[] args) {	
		try {
			Point a = new Point(1, -4);
			System.out.println(a);
		}
		catch (ErrConstructeurException e) {
		}
	}
}

class Point{
	private int abs, ord;

	public Point(int x, int y) throws ErrConstructeurException {
		if (x < 0 || y < 0)
			throw new ErrConstructeurException();
		else {
			this.abs = x; 
			this.ord = y;
		}
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

	public ErrConstructeurException() {
		System.out.println ("L’une des coordonnées est négative !");
	}  
}
