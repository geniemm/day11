package inheritance;

class Test04{
	public Test04(String s) {
		System.out.println(s+"부모 생성자 실행");
	}
}
class TestClass04 extends Test04{
	public TestClass04() {
		super ("값 전달\n"); // super 부모생성자에 값 전달하는 키워드 
		System.out.println("자식 생성자 실행");
	}
}
public class MainClass04 {

	public static void main(String[] args) {
		//Test04 t= new Test04("aaa");
		TestClass04 t = new TestClass04();
		
	}
}
