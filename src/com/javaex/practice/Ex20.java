package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int answer = 36; // 임의로 정한 숫자게임 정답
		
		System.out.println("=====================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("=====================");
		
		while(flag) {
			System.out.print(">>");
			int num = sc.nextInt();
			
			if(num < answer) {
				
				System.out.println("더 높게");
				
			} else if(num > answer) {
				
				System.out.println("더 낮게");
				
			} else if(num == answer) {
				
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				String yes_or_no = sc.nextLine();
				
				switch(yes_or_no) {
					case "y" :
						System.out.println("=====================");
						System.out.println("   [숫자맞추기게임 종료]   ");
						System.out.println("=====================");
						flag = false;
						break;
					case "n" :
						break;
					default :
						System.out.println("잘 못 입력하셨습니다.");
						break;
				}
			}
		}
		
		sc.close();
		
	}

}
