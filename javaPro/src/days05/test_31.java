package days05;

import java.util.Random;
import java.util.Scanner;

public class test_31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int num = 0;
		boolean playerturn;
		
		System.out.println("베스킨라빈스31게임 시작");
		
		playerturn = ran.nextBoolean();
		System.out.println(playerturn ? "플레이어 선공" : "컴퓨터 선공");
		
		while (num < 31) {
			if (playerturn) {
				System.out.print("1~3숫자를 입력하시오");
				int playernum = sc.nextInt();
				while (playernum < 1 || playernum > 3) {
					System.out.println("다시입력하시오");
					playernum = sc.nextInt();
				}//while_playernum < 1 || playernum > 3
			
				System.out.print("플레이어 : ");
				for (int i = 0; i < playernum && num < 31; i++) {
					num ++;
					System.out.print(num + "");
				} //for i
				System.out.println();
				
				if (num >= 31) {
					System.out.println("사용자 31당첨 : 컴퓨터 승리");
				} //if_playernum >= 31
	
			} //if_playerturn
			else {
				int computernum = ran.nextInt(3) + 1;
				System.out.print("컴퓨터: ");
                for (int i = 0; i < computernum && num < 31; i++) {
                    num++;
                    System.out.print(num + " ");
                }
                System.out.println();

                if (num >= 31) {
                    System.out.println("컴퓨터가 31을 외쳤습니다. 사용자 승리");
                }
				
			}
			
			playerturn = !playerturn;
			
		}//while_num<31
		sc.close();
	}//main
}//class
