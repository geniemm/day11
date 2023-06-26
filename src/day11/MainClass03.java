package day11;

class TestClass03{
	
	static TestClass03 t; // 인스턴스 변수(객체를 만드는순간 만들어지는 변수) > static으로 만들어서 먼저읽을 수 있도록 한다.

	private TestClass03() {
		System.out.println("생성자 실행"); // 생성자가 private이 되어버리면 생성자호출불가.(외부접근불가)
	}
	public static TestClass03 getInstance() {
		
		System.out.println(t+" : getInstance 실행");
		if(t==null)
			t = new TestClass03();
		return t;
	}
}
/*
 싱글톤 만들기 
 1. 생성자를 private로 만들어라
 2. 내부에 메소드를 만들어서 접근하겠다.
 3. static으로 만들면 외부에서 class이름으로 접근이 가능하다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		TestClass03 t01 = TestClass03.getInstance();
		TestClass03 t02 = TestClass03.getInstance();
		TestClass03 t03 = TestClass03.getInstance();
	
		System.out.println(t01);
		System.out.println(t02);
		System.out.println(t03);
	}
}
