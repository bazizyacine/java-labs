public class lab4 {
	public static void main(String[] args) {
		Point p1 = new Point ();
		Point p2 = new Point (1);
		Point p3 = new Point (1, 2);
		Point p4 = new Point (p3);
		
		System.out.printf("p1.abs = %d\np1.abs = %d"
							+ "\np2.abs = %d\np2.abs = %d"
							+ "\np3.abs = %d\np3.abs = %d"
							+ "\np4.abs = %d\np4.abs = %d",
							p1.getABS(), p1.getORD(), 
							p2.getABS(), p2.getORD(),
							p3.getABS(), p3.getORD(),
							p4.getABS(), p4.getORD());
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