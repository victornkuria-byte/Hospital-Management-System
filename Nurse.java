public class Nurse extends MedicalStaff {
    public Nurse(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    public void provideTreatment() {
        System.out.println("Nurse " + getName() + " is checking vitals and administering medication in " + getDepartment() + ".");
    }
}