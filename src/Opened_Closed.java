public class Opened_Closed implements State{
    Clinic clinic;

    //Constructor;
    public Opened_Closed(Clinic clinic) {
        this.clinic = clinic;
    }

    //Overriding method of status
    @Override
    public void open() {
        System.out.println("Clinic is Closed Now!");
    }

    @Override
    public void close() {
        System.out.println("Clinic is Opened Now!");
    }
}