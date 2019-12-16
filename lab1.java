import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		Facturation facturation = new Facturation();
		double prixHT = facturation.getPrixHT();
		
		System.out.printf("Prix Net = %f", 
				facturation.getPrixNet(facturation.getPrixTTC(prixHT), 
				facturation.getRemise(facturation.getPrixTTC(prixHT))));
		
	}

}

class Facturation {
	final double TVA = 18.6;
	
	double getPrixHT() {
		Scanner sc = new Scanner(System.in);
		System.out.print("prixHT = ");
		double prixHT = sc.nextDouble();
		sc.close();
		return prixHT;
	}
	
	double getPrixTTC(double prixHT) {
		return prixHT * (1 + (TVA/100));
	}
	
	double getRemise(double prixTTC) {
		double remise;
		
		if (prixTTC < 1000)
			remise = 0.0;
		
		if (prixTTC <= 1000 & prixTTC < 2000)
			remise = 1.0;
		
		if (prixTTC <= 2000 & prixTTC < 5000)
			remise = 3.0;
		else
			remise = 5.0;
		
		return ((remise/100) * prixTTC);
	}
	
	double getPrixNet(double prixTTC, double remise) {
		return prixTTC - remise;
	}
	
}