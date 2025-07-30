package laura;


import java.util.Scanner;

public class Basics6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your marks (0 - 100): ");
        int marks = scanner.nextInt();

    
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        } else {
            String grade;

            
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 75) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }

           
            System.out.println("Your grade is: " + grade);
        }

        scanner.close();
    }
}
