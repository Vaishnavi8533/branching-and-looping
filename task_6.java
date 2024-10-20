package tasks;

public class task_6 {

	public static void main(String[] args) {
		int n = 5; // number of rows

        // Outer loop to handle the number of rows
        for (int i = 0; i < n; i++) {
            // First part: decreasing from 5 to 5-i
            for (int j = 5; j > 5 - i; j--) {
                System.out.print(j);
            }
            // Second part: repeating the number 5-i
            for (int k = 5 - i; k > 0; k--) {
                System.out.print(5 - i);
            }
            // Move to the next line after each row
            System.out.println();
        }

	}

}
