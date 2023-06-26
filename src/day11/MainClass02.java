package day11;

class TestClass02{
	int num;
	static int cnt;
	public TestClass02() {
		cnt++;
		System.out.println(cnt+"객체 생성");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t01 = new TestClass02();
		TestClass02 t02=t01; // 얕은 복사 (이렇게 복사하는 방식이 singleton패턴) >> 하나의 객체라는 덩어리를 만들어서 같이 사용하는것
		TestClass02 t03=t02; 
		// t01의 값은 t02에 넣어라 > 동일한 주소를 참조하게됨 > t03에 t02의 정보를 대입해라 > 동일한 주소를 참조
		
		t01.num=100; t02.num=200; t03.num=300;
		// 참조하는 주소가 동일하니까 100,200,300을 같은공간에 넣게되어서 결국 300이 되는것
		System.out.println(t01+":"+t01.num); 
		System.out.println(t02+":"+t02.num); 
		System.out.println(t03+":"+t03.num); 
		
		// new 연산을 만나는 순간 싱글톤은 유지가 안됨
		// 
	}
}
