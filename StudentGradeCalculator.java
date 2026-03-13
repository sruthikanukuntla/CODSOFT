import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];
        char[] grades = new char[n];

        // Input names and marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i+1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();

            // Calculate grade
            if (marks[i] >= 90) grades[i] = 'A';
            else if (marks[i] >= 75) grades[i] = 'B';
            else if (marks[i] >= 60) grades[i] = 'C';
            else if (marks[i] >= 50) grades[i] = 'D';
            else grades[i] = 'F';
        }

        // Print results
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + marks[i] + " : " + grades[i]);
        }

        sc.close();
    }
}
