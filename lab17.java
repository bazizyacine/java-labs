import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class lab17 {
	public static void main(String[] args) {
		try {
			new FichierLire().LireFichierGerer();
			new FichierLire().LireFichierRemonter();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class FichierLire {
	public void LireFichierGerer() {
		try {
			InputStream ips = new FileInputStream("F:\\TP3_enonce.pdf");
		}
		catch (FileNotFoundException e) {
			System.out.println("Erreur de lecture du fichier ! Gérer l’exception");
		}
	}
	
	public void LireFichierRemonter() throws FileNotFoundException {
			InputStream ips = new FileInputStream("F:\\TP3_enonce.pdf");
			System.out.println("Erreur de lecture du fichier ! Remonter l’exception");
	}
}