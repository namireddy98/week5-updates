public class Doctor implements State{
    Clinic clinic;

    public Doctor(Clinic clinic) {
        this.clinic = clinic;
    }

    //Overriding Methods.
    @Override
    public void open() {
        System.out.println("Patient has checked.");
    }

    @Override
    public void close() {
        System.out.println("Doctor Checked the patient!");
    }
}
