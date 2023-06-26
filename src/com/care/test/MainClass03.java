package com.care.test;

import com.java.sql.Date;

public class MainClass03 {
	public static void main(String[] args) {
		Date date = new Date();
		date.myDate();
		
		com.java.util.Date date2 = new com.java.util.Date();
		// 동일한 클래스의 이름이라면 하나는 import에 사용할수없고 직접적으로 명시를 해줘야한다.
		// 혹은 sql date도 com.java.sql.Date 이라고 직접명시해서 사용해서 혼동을 줄인다. 아 배고파	
		
	}
}
