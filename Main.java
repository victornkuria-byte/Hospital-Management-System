import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StaffManager manager = new StaffManager();

        try {
            manager.loadFromFile();
        } catch (Exception e) {
            System.out.println("Could not load file.");
        }

        while (true) {
            System.out.println("\n1. Add Doctor\n2. Add Nurse\n3. Add Admin\n4. View All\n5. Reports\n6. Exit");
            System.out.print("Choose: ");
            String input = scanner.nextLine();

            try {
                if (input.equals("1")) {
                    System.out.print("Name: ");
                    String n = scanner.nextLine();
                    System.out.print("ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Dept: ");
                    String d = scanner.nextLine();
                    System.out.print("Spec: ");
                    String s = scanner.nextLine();
                    if (n.equals(""))
                        throw new InvalidInputException("Empty Name!");
                    manager.addStaff(new Doctor(n, id, d, s));
                } else if (input.equals("4")) {
                    for (Person p : manager.myList)
                        p.displayRole();
                } else if (input.equals("6")) {
                    manager.saveToFile();
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}