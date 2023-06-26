package inheritance;
class  Test05{
	public Test05(String s) {
		System.out.println(s+":부모 생성자");
	}
	public Test05() {
		System.out.println("default 부모 생성자 실행");
	}
}
class TestClass05 extends Test05{
	
	public TestClass05() {
	//	super("값전달하던가말던가");
		System.out.println("자식 생성자이자식아");
	}
	public TestClass05(String s) {
		super(s);// super키워드는 제일 위에있어야 오류가 안난다.
		System.out.println(s+ ":이놈의 자식 생성자");
	}
}	
public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t01 = new TestClass05();
		TestClass05 t02 = new TestClass05("값 전달!");
	}
}
