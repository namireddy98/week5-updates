public class Holiday implements State{
    Clinic clinic;

    public Holiday(Clinic clinic) {
        this.clinic = clinic;
    }

    //Overriding method of status
    @Override
    public void open() {
        System.out.println("Today is Working Day!");
    }

    @Override
    public void close() {
        System.out.println("Today is National Holiday!");
    }
}
