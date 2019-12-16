public class lab3 {
	public static void main(String[] args) {
		Objet o1 = new Objet(), o2 = new Objet(), o3 = new Objet();
		
		System.out.printf("NombreInstances = %d\n", o1.getNombreInstances());
		/*
		 * System.out.printf("NombreInstances = %d\n", o1.nbreInstances);
		 * o1.nbreInstances = 15; System.out.printf("NombreInstances = %d\n",
		 * Objet.nbreInstances);
		 */
	}
}

class Objet {
	private static int nbreInstances = 0;
	
	Objet() {
		Objet.nbreInstances++;
	}
	
	public int getNombreInstances()
	  {
	    return nbreInstances;
	 }  
}
