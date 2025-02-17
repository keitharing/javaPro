package days05;

import java.util.Scanner;
import java.util.Random;

public class test_wha {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int userChoice;
		while (true) {
			System.out.println(">user 가위(1),바위(2),보(3) 선택?");
			userChoice = sc.nextInt();

			if (userChoice < 1 || userChoice > 3) {
				System.out.println("잘못된 선택입니다. 다시 선택해 주세요.");
			} else {
				break;
			}
		}

		int computerChoice = (int) (Math.random() * 3) + 1; 

		System.out.printf("사용자 선택: %d\n", userChoice);
		System.out.printf("컴퓨터 선택: %d\n", computerChoice);

		// 결과 출력
		if (userChoice == computerChoice) {
			System.out.println("비겼습니다!");
		} else if	((userChoice == 1 && computerChoice == 3) || 
					(userChoice == 2 && computerChoice == 1)||
					(userChoice == 3 && computerChoice == 2)) {
			System.out.println("사용자 승리!");
		} else {
			System.out.println("컴퓨터 승리!");
		}

		sc.close();
	}//main
}//class