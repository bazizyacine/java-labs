import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab31 {
	public static void main(String[] args) {	
		new MaFenetre();
	}	
}

class MaFenetre extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton b1, b2;
	
	MaFenetre() {
		this.setTitle("Deux-boutons");
		this.setSize(200,80);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		b1 = new JButton("OK");
		b2 = new JButton("Annuler");
		this.getContentPane().add(b1);
		this.getContentPane().add(b2);
		this.getContentPane().setLayout (new FlowLayout());
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			System.out.println("OK");
		else
			System.out.println("Annuler");
	}
}
