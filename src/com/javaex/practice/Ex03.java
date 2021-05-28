package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		/* 예상
		
		***
		***
		***
		***

		y for문 3번 반복하며 * 출력, x for 문은 이를 4번 반복
		*/
		int x, y; //x, y 선언
		for(x = 0; x < 4; x++) {
			for(y = 2; y >= 0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
