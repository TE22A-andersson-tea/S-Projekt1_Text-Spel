
import java.util.Scanner;


public class InteractibleItem extends Item{
    public int usesCurrent;
    public int usesMax;
    Scanner myScanner = new Scanner(System.in);
    
    public InteractibleItem(String name, String description, int usesCurrent, int usesMax){
        super(name,description);
        this.name = name;
        this.description = description;
        this.usesCurrent = usesCurrent;
        this.usesMax = usesMax;
    }


    public boolean pickUpItem(InteractibleItem interactibleItem, int usesMax, int usesCurrent){
        System.out.println("You have found an item!");
        System.out.println("Do you wish to pick up this item? yes or no");
        String pickUp = myScanner.nextLine();
    
        if (pickUp.equalsIgnoreCase("yes")) {
            new Inventory().addItem(interactibleItem, usesMax, usesCurrent);
            return true;
        }
        else{
            return false;
        }
    }

    public void useItem(InteractibleItem interactibleItem){
        
    }
}
