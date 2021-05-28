package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		
		int i = 1; // i는 1
		boolean flag = true; // flag는 true
		
		while(flag) {
			if(i >= 5) { 
				flag = false;
			}
			System.out.println(i);
			i = i + 1;
		}
		
		// 예상
		/*
		
		1
		2
		3
		4
		
		// while 문의 flag가 true 상태이기 때문에 i 출력과 i 값 증가를 계속한다.
		// 계속 증가하다가 if문의 i가 5보다 크거나 같은 경우 flag의 값이 false로 변하고 while문이 종료된다.
		 */

	}

}
