package tasks;

import java.util.Scanner;

public class task_2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if (num > 0) 
		{
			System.out.println("It is positive value");
		}
		else if(num < 0 )
		{
			System.out.println("It is negative value");
		}
		else
		{
			System.out.println("It is Zero value");
		}
		
	}
}
