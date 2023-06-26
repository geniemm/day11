package inheritance;
class Test06{
	public int num;
	public Test06() {num=100;}
	
}
class TestClass06 extends Test06{
	int num = 7777;
	public void test() {
		System.out.println(num);
		System.out.println(super.num);
	} 
	// 나한테 값ㅇ ㅣ있으면 내꺼가 우선시(자식)
	// 없으면 부모한테가서 찾아본다.
	// 나한테도 있는데 부모꺼로 쓰고싶으면 super.로 가ㅈㅕ와라~
	
}
public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		t.test();
	}
	
}
