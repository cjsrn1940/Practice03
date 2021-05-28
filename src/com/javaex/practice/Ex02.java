package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		/* 예상
		 
		**
		**
		**
		**
		
		y for문에서 '**'출력 후 이를 x for문으로 4번 반복
		 */ 
		int x, y; //x, y 선언
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 2; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}