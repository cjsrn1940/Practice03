package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int deposit, withdrawal, bank_balance = 0;
		
		while(flag) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			
			System.out.print("선택> ");
			int select = sc.nextInt();
			
			switch(select) {
				case 1 :
					System.out.print("예금액 > ");
					deposit = sc.nextInt();
					bank_balance = bank_balance + deposit;
					break;
				case 2 :
					System.out.print("출금액 > ");
					withdrawal = sc.nextInt();
					bank_balance = bank_balance - withdrawal;
					break;
				case 3 :
					System.out.println("잔고액 > " + bank_balance);
					break;
				case 4:
					System.out.println("프로그램 종료");
					flag = false;
					break;
				default :
					System.out.println("다시 입력해주세요");
					break;
			}
		}
		
		sc.close();

	}

}
