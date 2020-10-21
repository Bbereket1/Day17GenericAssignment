import java.util.ArrayList;
import java.util.Arrays;

public class Department <T>{
    private String name;
    private int numberOfInstruments = 0;
    private ArrayList<T> instruments = new ArrayList<>();

    public Department(String name) {
        this.name = name;

    }



    public void addInstrument() {
        this.numberOfInstruments++;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfInstruments() {
        return numberOfInstruments;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Unique Instruments
    public void addNewInstrument(String id) {
        if (instruments.contains(id)) {
            System.out.println(this.getName() + " item already exists");
        } else {
            System.out.println(instruments.toString());



        }
    }
}
