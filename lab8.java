import java.util.Scanner;

public class lab8 {
	
	public static void main(String[] args) {
		double val;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Entrez une mesure : " );
			val = sc.nextDouble();
			new Mesure(val);
			
			if (val == 0) {
				Mesure.afficherMoyenne();
				break;
			}
		} while(val != 0);
		
		sc.close();
	}
	
}

class Mesure {
	private static final double MIN = -100;
	private static final double MAX = 100;
	private static int NbMesures;
	private static double sommeMesures;

	private double Valeur;

	public Mesure(double v) {
		if (v >= MIN & v <= MAX & v != 0) {
			this.Valeur = v;
			Mesure.NbMesures++;
			Mesure.sommeMesures += this.Valeur;
		}
		else
			System.out.println("Mesure hors intervalle");
	}
	
	public static void afficherMoyenne() {
		System.out.printf("La moyenne des %d mesures est : %f", Mesure.NbMesures,
				Mesure.sommeMesures/Mesure.NbMesures);
	}
}