package inheritance;

class Calc02 {
	public void display() {
		System.out.println("나는 계산기");
	}
}

class Computer02 extends Calc02 {
	Calc02 c;

	public Computer02() {
		c = new Calc02();
	}

	public void print02() {
		System.out.println("print");
		display();
	}

	public void print() {
		System.out.println("나는 컴퓨터!");
		c.display();
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		// Calc02 cal = new Calc02();
		// c.display();

		Computer02 com = new Computer02();
		com.print();
		com.display();
		com.print02();
	}
}
