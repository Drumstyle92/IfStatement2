/**
 * @author Drumstyle92
 * Class that contains the program.
 */
public class Tester {
    /**
     * @param args main parameter.
     * main method which contains a string and an if.
     */
    public static void main(String[] args) {

    String mySurname = "Petrucci";
    
    System.out.println("---------------------------------Request-------------------------------------------");
    System.out.println("Does the surname name contain the letters \"in\" ?? "
                       + (mySurname.contains("ni") ? "It contains it." : "it does not contain it."));
    }
}
