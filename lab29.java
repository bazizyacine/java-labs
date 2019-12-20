import java.util.ArrayList;
import java.util.List;

public class lab29 {
	public static void main(String[] args) {	
		List<Point> points = new ArrayList<Point>();
		
		Point p = new Point(3,3);
		points.add(p);
		points.add(new Point(1,1));
		points.add(new Point(2,2));
		
		//Parcours de la liste
		for(Point point : points)
			System.out.println(point.getX());
		
		//Autres manipulations
		System.out.println("Taille : " + points.size());
		System.out.println("Deuxième point : " + points.get(1));
		System.out.println("Index de p : " + points.indexOf(p));
		points.remove(1);
		
		Object[] t = points.toArray();
		
		for(Object o : t)
			System.out.print(((Point) o).getX());
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

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
