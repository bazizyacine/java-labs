import java.util.Scanner;

public class lab23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Entier Naturel = ");
		
		try {
			EntierNaturel entierNaturel = new EntierNaturel(sc.nextInt());
			entierNaturel.decremente();
			EntierNaturel.decremente(entierNaturel);
			entierNaturel.setEntier(3);
			System.out.println("Entier = " + entierNaturel.getEntier());
		}
		catch (ErrConstException e) {
			System.out.println("Dans catch ErrConstException de main");
			System.out.println("Entier erronees: " + e.getEntier());
		}
		catch (ErrModifException e) {
			System.out.println("Dans catch ErrModifException de main");
			System.out.println("Entier. erronees: " + e.getEntier());
		}
		
		System.out.println("Apres catch de main");
		
		sc.close();
	}
}

class EntierNaturel {
	private int entier;
	
	public int getEntier() {
		return entier;
	}
	
	public void setEntier(int entier) throws ErrModifException {
		if (entier < 0 )
			throw new ErrModifException(entier);
		this.entier = entier;
	}

	public EntierNaturel(int n) throws ErrConstException {
		if (n < 0 )
			throw new ErrConstException(n);
		this.entier = n;
	}
	
	public void decremente() throws ErrModifException {
		if (this.entier - 1 < 0 )
			throw new ErrModifException(this.entier);
		this.entier--;
	}
	
	public static void decremente(EntierNaturel e) throws ErrModifException {
		if (e.entier - 1 < 0 )
			throw new ErrModifException(e.entier);
		e.entier--;
	}
}

class ErrConstException extends Exception { 
	private static final long serialVersionUID = 1L;
	private int entier;
	
	public int getEntier() {
		return entier;
	}

	public void setEntier(int entier) {
		this.entier = entier;
	}
	
	public ErrConstException(int n) {
		System.out.println("ErrConstException !");
		this.entier = n; 
	}
}

class ErrModifException extends Exception { 
	private static final long serialVersionUID = 1L;
	private int entier;
	
	public int getEntier() {
		return entier;
	}

	public void setEntier(int entier) {
		this.entier = entier;
	}
	
	public ErrModifException(int n) {
		System.out.println("ErrModifException !");
		this.entier = n; 
	}
}