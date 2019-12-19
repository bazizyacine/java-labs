import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class lab22 {
	public static void main(String[] args) {
		Point p1 = new Point(3, 3);
		Point p2 = new Point(3, 3);
		
		if (p1.equals(p2) == true) 
			System.out.println("equals : p1 = p2");
		else 
			System.out.println("equals : p1 != p2");
		
		if (p1.compareTo(p2) < 0) 
			System.out.println("compareTo : p1 < p2");
		
		if (p1.compareTo(p2) > 0) 
			System.out.println("compareTo : p1 > p2");

		if (p1.compareTo(p2) == 0) 
			System.out.println("compareTo : p1 = p2");
		
		new TestPoint();
	}
}

class Point implements Comparable<Point> {
	private int abs, ord;
	
	public Point(int x,  int y) {
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
		System.out.println("Abscisse : " + this.abs + " Ordonnee : " + this.ord);
	}

	@Override
	public String toString() {
		return "Point(" + this.abs + ", " + this.ord + ")";
	}
	
    @Override
    public boolean equals(Object object) {
        if (object != null && object.getClass() == this.getClass()) {           
            return ((Point) object).abs == this.abs && ((Point) object).ord == this.ord;
        } 
        else
            return false;
    }
	
	@Override
    public int compareTo(Point Point2) {	
		Double DE1 = Math.sqrt(Math.pow(this.getAbs(), 2) + Math.pow(this.getOrd(), 2));
		Double DE2 = Math.sqrt(Math.pow(Point2.getAbs(), 2) + Math.pow(Point2.getOrd(), 2));;
		
		return DE1.compareTo(DE2);
    }
}

class PointComparator implements Comparator<Point> {
	public int compare(Point point1, Point point2)
	{
		int compAbs = ((Integer) point1.getAbs()).compareTo(((Integer) point2.getAbs()));
		  
		if (compAbs != 0) { return compAbs; }
		  
		int compOrd = ((Integer) point1.getOrd()).compareTo(((Integer) point2.getOrd()));

	    if (compOrd != 0) { return compOrd; }

	    return 0;
	}
}

class TestPoint {
	public TestPoint() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Len = ");
		int len = sc.nextInt();
		
		Point[] points = new Point[len];
		
		for (int i = 0; i < points.length; i++) {
			points[i] = new Point(sc.nextInt(), sc.nextInt());
			System.out.printf("%s\n", points[i].toString());
		}
		
		System.out.printf("points[] : %s\n", Arrays.toString(points));
		
		Arrays.sort(points);
		
		System.out.printf("Sort points[] : %s\n", Arrays.toString(points));

		Point pointsKey = new Point(sc.nextInt(), sc.nextInt());
		System.out.printf("%s\n", pointsKey.toString());
		
		System.out.printf("%s found at index = %d",
				pointsKey.toString(), Arrays.binarySearch(points, pointsKey)); 
		
		sc.close();
	}
}
