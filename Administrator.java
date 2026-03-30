public class Administrator extends Person implements Accountable {
    public Administrator(String n, int i) {
        super(n, i);
    }

    public void displayRole() {
        System.out.println("Admin: " + name);
    }

    public void generateReport() {
        System.out.println("Admin is making the report now...");
    }
}