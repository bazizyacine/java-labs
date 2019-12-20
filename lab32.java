import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab32 {
	public static void main(String[] args) {	
		new MaFenetre();
	}	
}

class MaFenetre extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JButton b1, b2;
	private JLabel lb;
	
	MaFenetre() {
		this.setTitle("Action Listener");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
		b1 = new JButton("Afficher Hello");
		b2 = new JButton("Réinitialiser");
		
		Container c = this.getContentPane();		
		c.setLayout(new BorderLayout());
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		
		c.add(p1, BorderLayout.SOUTH);
		c.add(p2, BorderLayout.NORTH);

		p1.add(b1, BorderLayout.EAST);
		p1.add(b2, BorderLayout.WEST);
		
		lb = new JLabel();
		p2.add(lb);

		b1.addActionListener(this);
		b2.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {	
		if (e.getSource() == b1)
			lb.setText("Hello!");
		else
			lb.setText("");
	}
}
