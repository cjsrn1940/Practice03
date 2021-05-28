package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		/*
		 if문 활용
		 */
	
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int answer = (int)(Math.random()*100) + 1;
		//int answer = 36; // 임의로 정한 숫자게임 정답
		String yes = new String("y");
		String no = new String("n");
		String yes_or_no;
		
		System.out.println("=====================");
		System.out.println("   [숫자맞추기게임 시작]   ");
		System.out.println("=====================");
		
		while(flag) {
			System.out.print(">>");
			int num = sc.nextInt();

			sc.nextLine();
			
			if(num < answer) {
				
				System.out.println("더 높게");
				
			} else if(num > answer) {
				
				System.out.println("더 낮게");
				
			} else if(num == answer) {
				
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까? (y/n) >>");
				yes_or_no = sc.nextLine();
				
				
				if(yes_or_no.equals(yes)) {
					System.out.println("=====================");
					System.out.println("   [숫자맞추기게임 종료]   ");
					System.out.println("=====================");
					flag = false;
				} else if(yes_or_no.equals(no)) {
					System.out.println("재시작 합니다.");
				}
				
				
			}
		}
		
		sc.close();
	}
	

}
