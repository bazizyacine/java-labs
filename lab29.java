
public class lab29 {
	public static void main(String[] args) {	
		Couple<Integer> ci = new Couple<Integer>(3, 5);
		System.out.println(ci);
		Couple<Double> cd = new Couple<Double>(2.0, 12.0);
		System.out.println(cd);
		Double p = cd.getPremier();
		System.out.println("1er élément du couple = " + p);
	}	
}

class Couple <T> {
	private T x, y; // les deux éléments du couple
	public Couple(T premier, T second) {
		x = premier;
		y = second;
	}
	public String toString()
	{
		// x et y convertis automatiquement par toString
		return ("Valeur 1 :" + x + "– Valeur 2 :" + y);
	}
	T getPremier() {
		return x;
	}
}
