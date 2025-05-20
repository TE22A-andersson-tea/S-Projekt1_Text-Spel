import java.util.ArrayList;
import java.util.Scanner; 

public class Utilities {
    
    public Utilities(){

    }

    //A method to choose a (int) alternative from a list, then checks if its an okey answer
    public static int chooseAlternative(String prompt, ArrayList<Item> alternatives, boolean decrement){
        int altNumber;
        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println(prompt);
            for (Item alt : alternatives) {
                System.out.println(alt);
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
