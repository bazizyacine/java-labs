public class lab3 {
	public static void main(String[] args) {
		Objet o1 = new Objet(), o2 = new Objet(), o3 = new Objet();
		
		System.out.printf("NombreInstances = %d\n", Objet.getNombreInstances());
	}
}

class Objet {
	private static int nbreInstances = 0;
	
	Objet() {
		Objet.nbreInstances++;
	}
	
	public static int getNombreInstances()
	  {
	    return Objet.nbreInstances;
	 }  
}
