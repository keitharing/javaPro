package days05;

import java.util.Random;
import java.util.Scanner;

public class day_remind {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int user;
		while (true) {
			System.out.println("가위(1) 바위(2) 보(3)");
			user = sc.nextInt();

			if (user < 1 && user > 3) {
				System.out.println("다시입력하시오");
			} else {
				break;
			}

		} // while

		int computer = (int) (Math.random() * 3) + 1;

		System.out.printf("사용자 = %d\n", user);
		System.out.printf("컴퓨터 = %d\n", computer);

		if (user == computer) {
			System.out.println("비겼습니다");

		} else if ((user == 1 && computer == 3) || (user == 2 && computer == 1) || (user == 3 && computer == 2)) {
			System.out.println("승리하였습니다");
		} else {
			System.out.println("패배하였습니다");

		}

	}// main

}// class
