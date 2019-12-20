
public class lab26 {
	static Mois m;
	
	public static void main(String[] args) {
		for(Mois m : Mois.values())
			System.out.printf("Mois %d : %s(%s) - %d jours\n", m.ordinal() + 1, m.toString().toLowerCase(), m.getMoisAnglais(), m.getNbJours());
	}
}

enum Mois {
	JANVIER(31, "January"), FEVRIER(28, "February"), MARS(30, "March"), AVRIL(31, "April"), MAI(30, "May"), JUIN(31, "June"), JUILLET(30, "July"), AOUT(31, "August"), SEPTEMBER(30, "September"), OCTOBRE(31, "October"), NOVEMBRE(30, "November"), DECEMBRE(31, "December");
	
	private int nbJours;
	private String moisAnglais;
	
	private Mois(int nbJ, String mA) {
		this.nbJours = nbJ;
		this.moisAnglais = mA;
	}

	public int getNbJours() {
		return nbJours;
	}

	public String getMoisAnglais() {
		return moisAnglais;
	}
}
