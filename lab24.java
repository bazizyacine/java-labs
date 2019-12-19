
public class lab24 {
	public static void main(String[] args) {
		int t[][]={{1, 2, 3},{11, 12},{21, 22, 23, 24}};
		System.out.println("====> t avant raz : ");
		Util.affiche1(t);
		System.out.println ("====> t apres raz : ");
		Util.raz(t);
		Util.affiche1(t);
	}
}

class Util { 
	 public static void raz(int Mat[][]) { 
		 for (int i = 0; i < Mat.length; i++) 
			 for (int j = 0; j < Mat[i].length; j++) 
				 Mat[i][j] = 0;
	 } 
	 
	 public static void affiche1(int Mat[][]) { 
		 for (int i = 0; i < Mat.length; i++) 
			 for (int j = 0; j < Mat[i].length; j++) 
				 System.out.printf("Mat[%d][%d] = %d\n", i, j, Mat[i][j]); 
	 }
	
	public static void affiche2(int Mat[][]) { 
		 for (int[] tab : Mat) 
			for (int e : tab) 
				System.out.printf("[%4d]\n", [e]); 
	 }
 }
 
