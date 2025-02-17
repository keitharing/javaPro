package days08;

import java.util.Scanner;

import com.util.MyCalender;

public class Ex09_02 {

	public static void main(String[] args) {

		// [문제] 1년 ~ 2025년까지 총 몇번의 윤년이 있는지?

		int leapYearCount = 0;
		
//		com.util.MyCalender.java
		
		for (int i = 1; i <= 2025; i++) {
			if(MyCalender.isLeapYear(i)) leapYearCount++;
		} //for i
			System.out.println(leapYearCount);
		
//			----------------------------------------
			
		leapYearCount = 2025/4 - 2025/100 + 2025/400;
		System.out.println(leapYearCount);
		
		
	}//main

} // class
