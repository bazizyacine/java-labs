public class lab5 {
	public static void main(String[] args) {
		Point p = new Point(0,0);
		Cercle c = new Cercle(p, 5);
		c.afficheCercle();
	}
}

class Point {
	private int x, y;
	
	public Point(int abs, int ord) {
		this.x = abs;
		this.y = ord;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int abs) {
		this.x = abs;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int ord) {
		this.y = ord;
	}
}

class Cercle {
	private double rayon;
	private Point centre;
	
	public Cercle(Point c, double r) {
		this.centre = c;
		this.rayon = r;
	}
	
	public void afficheCercle() {
		System.out.printf("R = %f\n"
				+ "Cercle.abs = %d\n"
				+ "Cercle.ord = %d"
				, this.rayon, this.centre.getX(), this.centre.getY()) ;
	}
	
}
