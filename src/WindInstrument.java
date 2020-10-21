public class WindInstrument extends Instrument{
    private String uniqueID = "0001448WT";
    public WindInstrument(String name) {
        super(name);
    }

    public WindInstrument(String name, String uniqueID) {
        super(name);
        this.uniqueID = uniqueID;
    }

    public String getUniqueID() {
        return uniqueID;
    }
}
