package example;

public class GrandChild1 extends Child1 {
	public  void m1() {
		System.out.println("GC m1");
	}
	public static void main(String[] args) {
		Parent1 p=new Child1();
		p.m1();
	}
}
