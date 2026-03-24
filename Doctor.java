public class Doctor extends MedicalStaff {
    private String specialty;

    public Doctor(String name, int id, String department, String specialty) {
        super(name, id, department);
        this.specialty = specialty;
    }

    @Override
    public void provideTreatment() {
        System.out.println("Doctor " + getName() + " is performing a specialized " + specialty + " procedure.");
    }
}