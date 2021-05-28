package com.javaex.practice;

import java.util.Scanner;

public class Ex20_1 {

	public static void main(String[] args) {
		/*
		 switch문 활용
		 */
		
		Scanner sc = new Scanner(System.in);
		boolean flag1 = true;
		boolean flag2 = true;
		int answer = 36; // 임의로 정한 숫자게임 정답
		String yes_or_no;
		
		System.out.println("=====================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("=====================");
		
		while(flag1) {
			System.out.print(">>");
			int num = sc.nextInt();
			sc.nextLine();
			
			if(num < answer) {
				
				System.out.println("더 높게");
				
			} else if(num > answer) {
				
				System.out.println("더 낮게");
				
			} else if(num == answer) {
				
				System.out.println("맞았습니다.");
				
				while(flag2) {
					
					System.out.print("게임을 종료하시겠습니까? (y/n) >>");
					yes_or_no = sc.nextLine();
					
					switch(yes_or_no) {
						case "y" :
							System.out.println("=====================");
							System.out.println("   [숫자맞추기게임 종료]   ");
							System.out.println("=====================");
							flag1 = false;
							flag2 = false;
							break;
						case "n" :
							System.out.println("재시작 합니다.");
							flag2 = false;
							break;
						default :
							System.out.println("잘못된 입력입니다.");	
							break;
					}
				}
				flag2 = true;
				
			}
		}
		
		sc.close();

	}

}
