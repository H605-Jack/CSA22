package archive.satSession.MrPotato;

/*
 * Name: Kiet Vuong
 * Date: 12/10/22
 * Description: Mr. Potato will show us how to work
 * with classes and object references
 */
public class MrPotato {
    //attributes are encapsulated
    private int numOfEyes;
    private String colorOfEyes;
    private String colorOfHat;
    private int numOfArms;
    private String facialHair;

    // default constructor (always a public accessor)
    public MrPotato() {
        
    }

    // Overloaded Constructor - same name but different signature (parameters)
    public MrPotato(int numOfEyes, String colorOfEyes, String colorOfHat, int numOfArms, String facialHair) {
        this.numOfEyes = numOfEyes;
        this.colorOfEyes = colorOfEyes;
        this.colorOfHat = colorOfHat;
        this.numOfArms = numOfArms;
        this.facialHair = facialHair;
    }

    public void talk() {
        System.out.println("I have " + numOfEyes + " eyes and a " + colorOfHat + " hat.");
    }

    // mutator method - changes the instance variables
    public void changeEyes (int numOfEyes) {
        this.numOfEyes = numOfEyes;
    }

    // accessor method - return data to the calling method
    public String theBeard(){
        return facialHair;
    }
}
