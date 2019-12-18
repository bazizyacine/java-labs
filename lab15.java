
public class lab15 {
	public static void main(String[] args) {	
		Integer nObj = new Integer(12);
		Double xObj = new Double(5.25);

		int n = nObj.intValue();
		double x = xObj.doubleValue();
		
		nObj = nObj + 2;
		nObj++;
		
		System.out.printf("nObj = %d, xObj = %f", nObj, xObj);
	}
}
