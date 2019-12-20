import java.awt.*;
import javax.swing.*;

public class lab31 {
	public static void main(String[] args) {	
		new TestInterfaceBorderLayout().dessinerFenetre();
	}	
}

class TestInterfaceBorderLayout extends JFrame {
	private static final long serialVersionUID = 1L;

	TestInterfaceBorderLayout() {
	}
	
	public void dessinerFenetre() {
		this.setSize(500, 300);
		this.setTitle("Mon Interface");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		Container conteneur = this.getContentPane(); // Type Container
		conteneur.setLayout(new BorderLayout()); //Utilisation BorderLayout
		
		JButton monBouton = new JButton("OK"); //Création compostants
		JPanel panneau = new JPanel();
		
		panneau.setBackground(Color.WHITE);
		conteneur.add(monBouton, BorderLayout.SOUTH); //Positionnement
		conteneur.add(panneau, BorderLayout.CENTER);
		
		this.setVisible(true); // Affichage fenêtre
	}
}
