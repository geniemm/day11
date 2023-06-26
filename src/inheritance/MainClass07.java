package inheritance;

class Test07 {
	protected int num; // protected : 상속받은 자식 or 같은 패키지 안에서는 사용을 허용해주겠다
	public void test() {
		System.out.println("부모 test");
	}
}

class TestClass07 extends Test07 {
	public void display() {
		num = 100;
		System.out.println("display 실행");
		super.test();
		// 가독성을 높이기 위해서라도 this나 super키워드를 사용한다.
	}

	public void test() {
		System.out.println("자식 ~ test");
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.display();
		System.out.println("초코우유 240kcal 실화냐");
	}
}
