public class ClinicTestApp {
    public static void main(String[] args) {
        //Object Declaration
        Clinic clinic = new Clinic();
        //Displaying basic Information
        System.out.println(clinic);
        //Below Defining Different Statuses Step by Step.
        //Object and passing it to setState for a new State.
        clinic.setState(new Opened_Closed(clinic));
        //Start of Process
        clinic.startProcess();

        //Object and passing it to setState for a new State.
        clinic.setState(new Holiday(clinic));
        clinic.startProcess();
        clinic.stopProcess();

        //Object and passing it to setState for a new State.
        clinic.setState(new Doctor(clinic));
        clinic.startProcess();
        clinic.stopProcess();
        clinic.setState(new Opened_Closed(clinic));
        clinic.stopProcess();
    }
}
