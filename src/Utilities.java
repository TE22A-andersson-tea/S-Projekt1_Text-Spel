import java.util.List;
import java.util.ArrayList;
import java.util.Scanner; 

public class Utilities {
    
    public Utilities(){

    }

    // varför är den static ==> då behöver man inget objekt utan kan användas direkt på klassen
    //A method to choose a (int) alternative from a list, then checks if its an okey answer
    public static int chooseAlternative(String prompt, List<InteractibleItem> alternatives, boolean decrement){
        int altNumber;
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println(prompt);
            int i = 1;
            for (Item alt : alternatives) {
                System.out.println(i + ". " + alt.getName());
                i++;
            }
            String numString = myScanner.nextLine();
            try {
                altNumber = Integer.parseInt(numString);
                if(decrement) altNumber -= 1;
                if (altNumber < alternatives.size() & altNumber >= 0) {
                    break;
                }
                else{
                    System.out.println("You have to pick a number between 1-" + alternatives.size());
                }

            } catch (Exception e) {
                System.out.println("You have to write a number");
            }
        }
        return altNumber;
    }

    //Samma fast istället för att välja mellan items väljer man mellan sträng alternativ
    public static int chooseStringAlternative(String prompt, List<String> alternatives, boolean decrement){
        int altNumber;
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            int altIdx = 1;
            System.out.println(prompt);
            for (String alt : alternatives) {
                System.out.println(altIdx + ": " + alt);
                altIdx++;
            }
            String numString = myScanner.nextLine();
            try {
                altNumber = Integer.parseInt(numString);
                if(decrement) altNumber -= 1;
                if (altNumber < alternatives.size() & altNumber >= 0) {
                    break;
                }
                else{
                    System.out.println("You have to pick a number between 1-" + alternatives.size());
                }

            } catch (Exception e) {
                System.out.println("You have to write a number");
            }
        }
        return altNumber;
    }

    
}
