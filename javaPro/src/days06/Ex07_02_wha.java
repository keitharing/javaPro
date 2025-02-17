package days06;

import java.util.Scanner;

/**
 * @author kenik
 * @date 2025. 2. 10. - 오후 2:46:40
 * @subject
 * @content
 */
public class Ex07_02_wha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0, lineNumber = 1; i < 256; i++) {
			if (i % 10 == 0)
				System.out.printf("%d :", lineNumber);
			System.out.printf("[%c]", (char) i);
			if (i % 10 == 9) {
				System.out.println();
				if (lineNumber % 5 == 0) {
					System.out.println("Press enter");
					sc.nextLine();
				}//if_lineNum%5
				lineNumber++;
			}// if_i%10
			
		} // for i
		
	} // main
	
} // class
