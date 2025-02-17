package days06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class practice {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d+%d", i, i);
			sum += i;
			
			
			
		} //for i
		
		System.out.printf("=%d", sum);
		

	} // main

}// class