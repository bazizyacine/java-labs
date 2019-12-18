
public class lab14 {
	public static void main(String[] args) {
		new TestInterfaceJava8();
	}
}

interface I1 {
	static void direBonjour() {
		System.out.println("Bonjour !");
	}
	
	default void direBonsoir() {
		System.out.println("Bonsoir !");
	}
	
	default void direSalut() {
		System.out.println("Salut !");
	}
}

interface I2 {
	default void direSalut() {
		System.out.println("Salut !!");
	}
}

class MaClasse {
	public void direBonsoir() {
		System.out.println("Bonsoir !!!");
	}
}

class TestInterfaceJava8 extends MaClasse implements I1, I2 {
	
	public TestInterfaceJava8() { 
		direSalut(); 
	}

	public void direSalut() {
		I1.direBonjour();
		I1.super.direBonsoir();
		I1.super.direSalut();
		I2.super.direSalut();
		this.direBonsoir();
	}
}
