package tasks;

import java.util.Scanner;

public class task_5 {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the purchase amount:");
	        double amount = sc.nextDouble();
	        double discount = 0;

	        if (amount >= 500 && amount <= 1000) {
	            discount = 0.10; // 10% discount
	        } else if (amount > 1000) {
	            discount = 0.20; // 20% discount
	        }

	        double discountAmount = amount * discount;
	        double finalAmount = amount - discountAmount;

	        System.out.println("Final payable amount after discount: " + finalAmount);


	}

}
