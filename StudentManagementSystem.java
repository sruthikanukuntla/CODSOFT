import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        students.add(new Student(name, roll, grade));
        System.out.println("Student added successfully!");
    }

    public void removeStudent() {
        System.out.print("Enter Roll Number to remove: ");
        int roll = sc.nextInt();
        sc.nextLine();

        boolean removed = students.removeIf(s -> s.getRollNumber() == roll);
        if(removed) System.out.println("Student removed successfully!");
        else System.out.println("Student not found.");
    }

    public void searchStudent() {
        System.out.print("Enter Roll Number to search: ");
        int roll = sc.nextInt();
        sc.nextLine();

        Student found = null;
        for(Student s : students) {
            if(s.getRollNumber() == roll) { found = s; break; }
        }

        if(found != null) System.out.println(found);
        else System.out.println("Student not found.");
    }

    public void displayAllStudents() {
        if(students.isEmpty()) { System.out.println("No students available."); return; }
        for(Student s : students) System.out.println(s);
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1: addStudent(); break;
                case 2: removeStudent(); break;
                case 3: searchStudent(); break;
                case 4: displayAllStudents(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid option!"); break;
            }
        } while(choice != 5);
    }

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.start();
    }
}