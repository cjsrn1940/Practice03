package com.javaex.practice;

public class Ex01 {
	
	public static void main(String[] args) {
		
		System.out.println("while문"); //while문 문자 출력
		int index = 0; // index에 0 삽입
		
		while(index < 3) { // index가 3 미만일 경우 무한반복
			System.out.println("index = " + index); // 첫번째 출력 index=0, 두번째 출력 index=1, 세번째 출럭 index=2
			index++; // 첫번째 index=1 -> 반복, 두번째 index=2 -> 반복, 세번째 index=3 -> 반복중지
		}
		/*while문 실행 결과
		index = 0
		index = 1
		index = 2
		 */
		
		System.out.println("for문"); // for문 문자 출력
		for(int order = 0; order < 3; order++) { // 선언, 조건, 증감
			System.out.println("order = " + order); 
		} // 첫번째 출력 order=0 -> order=1 증가, 두번째 출력 order=1 -> order=2 증가, 세번째 출력 order=2 -> order=3 증가 -----> 반복중지
		
		/*for문 실행 결과
		order = 0
		order = 1
		order = 2
		 */
	}

}
