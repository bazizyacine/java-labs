public class lab6 {
	public static void main(String[] args) {
		Cercle c = new Cercle(0, 0, 5);
		c.afficheCercle();
	}
}

class Cercle {
	private double rayon;
	private Point centre;
	
	public Cercle(int abs, int ord, double rayon) {
		centre = new Point(abs, ord);
		this.rayon= rayon;
	}
	
	public void afficheCercle() {
		System.out.println("Centre : " + centre.x + " , " + centre.y);
		System.out.println("Rayon : " + rayon);
	}
	
	class Point {
		private int x , y;
		
		public Point(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
}