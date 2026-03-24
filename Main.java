import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("=== HOSPITAL STAFF REGISTRATION ===");
            
            // 1. Handle Name Input
            System.out.print("Enter Doctor's Name: ");
            String name = scanner.nextLine();
            if (name.trim().isEmpty()) {
                throw new InvalidInputException("Name cannot be blank!");
            }

            // 2. Handle ID Input (Potential Exception Point)
            System.out.print("Enter Doctor's ID (Numbers only): ");
            int id = scanner.nextInt();
            if (id <= 0) {
                throw new InvalidInputException("ID must be a positive number!");
            }
            scanner.nextLine(); // Consume leftover newline

            // 3. Handle Department/Specialty
            System.out.print("Enter Department: ");
            String dept = scanner.nextLine();
            System.out.print("Enter Specialty: ");
            String spec = scanner.nextLine();

            // 4. Create Object and Display Output
            Doctor doc = new Doctor(name, id, dept, spec);
            System.out.println("\n--- Registration Success ---");
            doc.displayRole();
            doc.provideTreatment();

        } catch (InputMismatchException e) {
            System.err.println("ERROR: Invalid data type! ID must be a number.");
        } catch (InvalidInputException e) {
            System.err.println("VALIDATION ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("AN UNEXPECTED ERROR OCCURRED: " + e.getMessage());
        } finally {
            System.out.println("\nClosing system resources... Registration attempt finished.");
            scanner.close();
        }
    }
}