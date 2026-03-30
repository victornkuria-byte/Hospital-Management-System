public abstract class MedicalStaff extends Person implements Treatable {
    public String department;

    public MedicalStaff(String name, int id, String dept) {
        super(name, id);
        this.department = dept;
        System.out.println("Creating a medical staff member..."); // extra print
    }

    @Override
    public void displayRole() {
        System.out.println("ID: " + getId() + " Dept: " + department);
    }
}