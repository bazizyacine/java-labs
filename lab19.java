public class lab19 {
	public static void main(String[] args) {	
		try {
			Point a = new Point(-1, -4);
			a.f(); 
		}
		catch (ErrConst e) {
			System.out.println("Dans catch ErrConst de main");
			System.out.println("Coord. erronees: " + e.getAbs() + ", " + e.getOrd());
		}
		catch (ErrBidon e) {
			System.out.println("Dans catch ErrBidon de main"); 
		}
		
		System.out.println("Apres catch de main");
	}
}

class Point {
	private int x, y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point(int x, int y) throws ErrConst {
		if ((x <= 0) || (y <= 0)) throw new ErrConst(x, y);
		this.x = x;
		this.y = y;
	}
	
	public void f() throws ErrBidon {
		try {
			Point p = new Point(-3, 2);
		}
		catch (ErrConst e) {
			System.out.println("Dans catch de f");
			// on lance une nouvelle exception
			throw new ErrBidon(); 
		}
		finally {
			System.out.println("Dans finally de f") ;
		}
		
		System.out.println("Apres catch de f");
	}
}

class ErrConst extends Exception { 
	private static final long serialVersionUID = 1L;
	
	private int abs, ord;

	public int getAbs() {
		return abs;
	}

	public int getOrd() {
		return ord;
	}
	
	public ErrConst(int abs, int ord) {
		this.abs = Math.abs(abs); 
		this.ord = Math.abs(ord);
	}
}

class ErrBidon extends Exception {
	private static final long serialVersionUID = 1L;
}
