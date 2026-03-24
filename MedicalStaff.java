public abstract class MedicalStaff extends Person implements Treatable {
    private String department;

    public MedicalStaff(String name, int id, String department) {
        super(name, id); 
        this.department = department;
    }

    public String getDepartment() { return department; }

    @Override
    public void displayRole() {
        System.out.println("Medical Staff ID: " + getId() + " | Dept: " + department);
    }
}
