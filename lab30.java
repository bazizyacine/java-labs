
public class lab30 {
	public static void main(String[] args) {	
		Ecrit e1 = new Ecrit("A", 10, 1000);
		Ecrit e2 = new Ecrit("B", 12, 1000);
		Ecrit e3 = new Ecrit("C", 5, 1500);
		
		new Thread(e1).start();
		new Thread(e2).start();
		new Thread(e3).start();
	}	
}

class Ecrit implements Runnable {
	private String texte;
	private int nb;
	private long attente;
	
	public Ecrit(String texte, int nb, long attente) {
		this.texte = texte;
		this.nb = nb;
		this.attente = attente;
	}
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < nb; i++) {
				System.out.print(texte);
				Thread.sleep(attente);
			}
		} 
		catch (InterruptedException e) {
		
		} // imposé par sleep
	}
}
