package practice;
import java.util.Scanner;

public class Highestmarks {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create an array to store marks of 20 students
        int[] marks = new int[20];

        // Input marks for each student
        System.out.println("Enter the marks of 20 students:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        // Find the highest marks
        int highestMarks = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > highestMarks) {
                highestMarks = marks[i];
            }
        }

        // Output the highest marks
        System.out.println("The highest marks are: " + highestMarks);

        // Close the scanner
        scanner.close();
    }

	
		

	}


