package tasks;

import java.util.Scanner;

public class task_3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number to reverse:");
	        int number = sc.nextInt();
	        int reversedNumber = 0;

	        while (number != 0) {
	            int remainder = number % 10;
	            reversedNumber = reversedNumber * 10 + remainder;
	            number /= 10;
	        }

	        System.out.println("Reversed Number: " + reversedNumber);


	}

}
