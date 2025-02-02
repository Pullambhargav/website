import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Attendencemanage {
    public static void main(String[] args) {
        List<Attendence> records = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Attendance\n2. View Records\n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Student Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Date (YYYY-MM-DD): ");
                String date = scanner.nextLine();
                records.add(new Attendence(name, date));
                System.out.println("Attendance added!\n");
            } 
            else if (choice == 2) {
                System.out.println("\nAttendance Records:");
                for (Attendence record : records) {
                    System.out.println(record.getName() + " - " + record.getDate());
                }
                System.out.println();
            } 
            else {
                break;
            }
        }
        scanner.close();
    }
}
