public class Personne {
	public static void main(String[] args) {
		MaPersonne p = new MaPersonne("baziz");
		p.setPrenom("Yassine");
		System.out.printf("Prenom = %s\n", p.getPrenom());
		int x =5;
		int y = 10;
		int z;
		z = x;
		System.out.printf("z = %d\n", z);
		x = 50;
		System.out.printf("z = %d\n", z);
		
		Entier objX = new Entier(5);
		Entier objY = new Entier(10);
		Entier objZ = objX;
		System.out.printf("objZ = %d\n",objZ.valeur);
		objX.valeur = 50;
		System.out.printf("objZ = %d\n",objZ.valeur);
	}
}

class MaPersonne {
	private String prenom;

	MaPersonne(String prenom) {
		this.setPrenom(prenom);
	}
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String p) {
		this.prenom = p.toUpperCase();
	}
}

class Entier {
	int valeur;
	
	Entier(int v) {
		this.valeur = v;
	}
 }
