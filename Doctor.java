public class Doctor extends MedicalStaff {
    public String spec;

    public Doctor(String n, int i, String d, String s) {
        super(n, i, d);
        this.spec = s;
    }

    @Override
    public void provideTreatment() {
        String msg = "Doctor " + getName() + " is doing a " + spec + " job.";
        System.out.println(msg);
    }
}