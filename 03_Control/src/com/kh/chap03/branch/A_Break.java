package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {

	// break; : break문을 만나는 순간 현재 속해있는 반복문을 빠져나감.
	// ->즉, 가장 가까운 반복문만 빠져나감.

	// 주의할점 : switch문 안의 break 와는 다른개념
	// switch문 안의 break는 해당 switch문만 빠져나가는 용도.

	public void method1() {
		// 매번 반복적으로 발생되는 랜덤값(1~100) 출력
		// 그 랜덤값이 3의 배수일경우에만 반복문을 종료.

		while (true) {
			// 랜덤값 추출
			int random = (int) (Math.random() * 100 + 1);
			// 랜덤값을 출력
			System.out.println("random : " + random);
			// 랜덤값이 3의 배수인지 검사
			if (random % 3 == 0) {
				break;
			}
		}
	}

	public void method2() {
		// 매번 사용자에게 문자열을 입력받은 후 해당 문자열의 길이 출력
		// 단, 사용자가 입력한 문자열이 "exit"인 경우 반복문을 종료
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("문자열 입력 : ");
			String str = sc.nextLine();

			if (str.equals("exit")) {
				break;
			}
			System.out.println(str + "의 길이는 : " + str.length());
		}
	}

	public void method3() {
		// 매번 반복적으로 사용자에게 양수를 입력받아 1~ 사용자가 입력한 수까지 출력
		// 단, 정상적으로 양수를 입력했을시 1~사용자가 입력한수까지 출력하고 종료
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("양수를 입력 : ");
			int num = sc.nextInt();

			if (num > 0) {// 양수로 제대로 입력한 경우 -> 1~num 출력후 종료
				for (int i = 1; i <= num; i++) {
					System.out.println(i + " ");
				}
				break;
			} else {// 잘못입력시 -> 다시 입력하라는 출력문
				System.out.println("잘못입력했습니다. 다시입력해주세여.");
			}
		}
	}

	public void method14() {

		Scanner sc = new Scanner(System.in);

		String n = "";
		while (true) {
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();

			if (str.equals("stop")) {
				System.out.print("결과 : " + n);
				break;
			}
			n += str + " ";
			System.out.println("결과 : " + n);
		}
	}

	public void method15() {

		Scanner sc = new Scanner(System.in);

		int q = 0;
		int w = 0;
		int e = 0;

		while (true) {
			System.out.println("======== 메뉴 ========");
			System.out.println("1. 아메리카노    3500원");
			System.out.println("2. 카페라떼     4100원");
			System.out.println("3. 바닐라라떼    4300원");
			System.out.println("====================");

			System.out.println("메뉴 선택 : ");
			int m = sc.nextInt();
			System.out.println("수량 선택 : ");
			int c = sc.nextInt();

			switch (m) {
			case 1:
				q += c;
				break;
			case 2:
				w += c;
				break;
			case 3:
				e += c;
				break;
			default:
				System.out.println("잘못 선택하셨습니다. 다시 선택해주세요.");
				continue;
			}
			System.out.println("추가 주문 하시겠습니까? (Y/N) : ");
			char ch = sc.next().charAt(0);

			if (ch == 'N' || ch == 'n') {
				System.out.println("=================");
				if (q != 0) {
					System.out.println("아메리카노" + q + "잔 : " + 3500 * q + "원");
				}
				if (w != 0) {
					System.out.println("카페라떼" + w + "잔 : " + 4100 * w + "원");
				}
				if (e != 0) {
					System.out.println("바닐라라떼" + e + "잔 : " + 4300 * e + "원");
				}
				System.out.println("=================");
				System.out.println("총액 : " + (3500 * q + 4100 * w + 4300 * e) + "원");
				break;
			}
		}
	}
}
