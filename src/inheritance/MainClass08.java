package inheritance;
// 자바에서는 다중 상속이 안되고 물려서 물려서 상속을 받아야 여러개를 사용할 수 있다. 
class A{
	public void a() {
		System.out.println("aaa");
	}
}
class B extends A{

	public void b() {
		System.out.println("bbb");
	}
}
class C extends B{

	public void c() {
		System.out.println("c");
	}
}

public class MainClass08 {
	public static void main(String[] args) {
		C c = new C();
		c.b();c.a();c.c();
		
	}
}
