package day11;


public class MainClass04 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		//long > int보다 큰 정수를 받아주는 자료형
		//currentTimeMillis > 현재시간을 초단위로 출력
		System.out.println(time);
		
		try {
			Thread.sleep(2000); // 2000> 2초 기다려라 , sleep기능은 예외처리 필요
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end-time); 
		System.out.println((end-time)/1000+"초 사용"); // 1/1000 초 단위로 표현
		
		
	}
}
