package com.biz.inout;

public class Char01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intNum = 0 ; 		// 0이라는 숫자 값을 저장
		char charNum = '0';		
		String strNum = "0";	
		
		for(int i = 0 ; i < 10 ; i ++) {
			System.out.print(i);
			System.out.print("  ");
		}
		System.out.println("\n============================================================================");
		
		// 0~9까지의 범위내에서 ASCII코드 반복문 수행
		for(char c = '0' ; c <= '9' ; c ++) {
			System.out.print(c);
			System.out.print("  ");
		}
		System.out.println("\n============================================================================");
		
		//48부터 57까지의 반복문 수행
		for(int i = '0' ; i <= '9' ; i ++) {
			System.out.print(i);
			System.out.print("  ");
		}
		System.out.println("\n============================================================================");
		
		for(char c = 'A' ; c <= 'Z' ; c ++) {
			System.out.print(c);
			System.out.print("  ");
		}
		System.out.println("\n============================================================================");
		
		String s1 = "";
		for(char c = 'F'; c <='Q'; c++) {
			s1 += String.valueOf(c);
		}
		System.out.println(s1);
	}

}
