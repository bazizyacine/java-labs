
public class lab13 {
	public static void main(String[] args) {
	
		B b = new B();
		float n = 3;
		
		b.f(n);
		b.g(n);
		
	}
}

abstract class A {
	public A() {}
	public void f(float x) { System.out.println("1"); }
	public abstract void g(int n);
}

class B extends A {
	public B() {}
	public void g(int n) { System.out.println("2"); }
	public void g(float x) { System.out.println("3"); }
}
