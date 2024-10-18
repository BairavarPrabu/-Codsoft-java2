import java.util.Scanner;

public class StudentResults {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] subjects = {"French", "English", "Mathematics", "Physics", "Chemistry", "Biology"};

        int[] marks = new int[6];
        int totalMarks = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Enter marks obtained in " + subjects[i] + " (out of 100): ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        double averagePercentage = totalMarks / 6.0;

        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n--- Results ---");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }
}