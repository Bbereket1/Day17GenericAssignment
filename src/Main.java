import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    /*

    Apply generics to an application for a store that sells instruments.
    Create an abstract class call Instrument with just one field: String name.
    Give it a constructor and a getName() method.

    There are three types of instruments:

    Wind (flute, trumpet, etc)
    String (guitar, violin, sitar, etc)
    and Percussion (drum, tambourine, etc)
    Create classes for each of these and have them inherit from the Instrument class.

    In this store, each department contains instruments of a specific type. Create a Department class.
    Give it the following fields:

    String name
    int numberOfInstruments
    This will contain the total number of instruments in this department. Set this to 0.
    ArrayList<T> of instruments;


    Add a constructor that only sets the name.

    Create an addInstrument() method that adds an instrument to the instruments ArrayList and
    increments numberOfInstruments.

    Add getters for name and numberOfInstruments. Only add a setter for name - because instruments and
    numberOfInstruments should only be set when the addInstrument() method is invoked.

    In your main method, create 3 different objects of the Department class - one should take Wind instruments,
    the other should take String, and the last should take Percussion. Then add instruments to each of the classes.



    Bonus Questions: Must be submitted before 10/21 to receive points

    5 Points: Unique Instruments

    In your Wind, String, and Percussion classes, give the objects a unique ID.
    Then, in your Department class's addInstrument() method, only add an instrument if that ID doesn't already exist
    in the instruments ArrayList.



    5 points: Algorithm

    Create a method that takes an array of chars. Convert it into a string. Return that string.

    Example input: {'f', 'u', 'n'}

    Example output: fun

     */
    public static void main(String [] args) {


    Department <WindInstrument> trumpet = new Department<>("B Trumpet");
    Department <StringInstrument> guitar = new Department<>("Bass Guitar");
    Department<PercussionInstrument> drum = new Department<>("Bass Drum");


    trumpet.addInstrument();
    guitar.addInstrument();
    drum.addInstrument();

        System.out.println(trumpet.getName());
        System.out.println(trumpet.getNumberOfInstruments());
        System.out.println(guitar.getName());
        System.out.println(guitar.getNumberOfInstruments());
        System.out.println(drum.getName());
        System.out.println(drum.getNumberOfInstruments());


    // 5 Points: Unique Instruments


        trumpet.addNewInstrument("ghjk");




    // 5 points: Algorithm

       char [] letters = {'f', 'u', 'n'};
       String word = new String (letters);
        System.out.println(word);


    }
}
