package days05;

import java.util.Scanner;
import java.util.Random;
import java.util.Random;

public class test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int currentNumber = 0;
        boolean isPlayerTurn;

        System.out.println("베스킨라빈스 31 게임을 시작합니다!");

        // 선 플레이어 랜덤 결정
        isPlayerTurn = random.nextBoolean();
        System.out.println(isPlayerTurn ? "플레이어가 선공입니다!" : "컴퓨터가 선공입니다!");

        while (currentNumber < 31) {
            if (isPlayerTurn) {
                // 플레이어 턴
                System.out.print("1에서 3 사이의 숫자를 입력하세요: ");
                int playerCount = scanner.nextInt();
                while (playerCount < 1 || playerCount > 3) {
                    System.out.print("잘못된 입력입니다. 1에서 3 사이의 숫자를 입력하세요: ");
                    playerCount = scanner.nextInt();
                }//while

                System.out.print("플레이어: ");
                for (int i = 0; i < playerCount && currentNumber < 31; i++) {
                    currentNumber++;
                    System.out.print(currentNumber + " ");
                }
                System.out.println();

                if (currentNumber >= 31) {
                    System.out.println("당신이 31을 외쳤습니다. 컴퓨터의 승리!");
                }
            } else {
                // 컴퓨터 턴
                int computerCount = random.nextInt(3) + 1;
                System.out.print("컴퓨터: ");
                for (int i = 0; i < computerCount && currentNumber < 31; i++) {
                    currentNumber++;
                    System.out.print(currentNumber + " ");
                }
                System.out.println();

                if (currentNumber >= 31) {
                    System.out.println("컴퓨터가 31을 외쳤습니다. 당신의 승리!");
                }
            }

            // 턴 전환
            isPlayerTurn = !isPlayerTurn;
        }

        scanner.close();
    }
}
