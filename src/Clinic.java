public class Clinic {
    Opened_Closed Opened_Closed;
    Holiday Holiday;
    Doctor Doctor;
    State state;

    //Variable for counter use and initializing by 0.
    int count=0;

    //Constructor of Clinic Class.
    public Clinic() {
        Opened_Closed = new Opened_Closed(this);
        Holiday = new Holiday(this);
        Doctor = new Doctor(this);
        state = Opened_Closed;
    }

    //For Starting of Process from knowing whether clinic is open or not.
    public void startProcess() {
        state.close();
    }

    //Stopping of above Process
    public void stopProcess() {
        state.open();
    }

    //Getters and Setters for Process performed by different class between starting and stop of program.
    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getOpened_Closed() {
        return Opened_Closed;
    }

    public State getHoliday() {
        return Holiday;
    }

    public State getDoctor() {
        return Doctor;
    }

    public int getCount() {
        return count;
    }

    //To String For Overview of The Program
    public String toString() {
        //String Buffer Class Object
        StringBuffer result = new StringBuffer();
        result.append("Welcome to Eye Clinic Website");
        //Working on Counter Variable.
        if (count != 1) {
            result.append("");
        }
        result.append("\n");
        return result.toString();
    }
}
