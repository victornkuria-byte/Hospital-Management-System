public class Administrator extends Person implements Accountable {
    public Administrator(String name, int id) {
        super(name, id);
    }

    @Override
    public void displayRole() {
        System.out.println("Administrator: " + getName() + " (ID: " + getId() + ")");
    }

    @Override
    public void generateReport() {
        System.out.println("System: Compiling hospital occupancy and budget reports...");
    }
}