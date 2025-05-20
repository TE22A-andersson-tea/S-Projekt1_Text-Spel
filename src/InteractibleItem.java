import java.util.Scanner;

public class InteractibleItem extends Item{
    public int usesCurrent;
    public int usesMax;
    Scanner myScanner = new Scanner(System.in);
    
    public InteractibleItem(String name, String description, int id, int usesCurrent, int usesMax){
        super(name, description, usesCurrent, usesMax, id);
    
    }

    public int getUsesCurrent(){
        return usesCurrent;
    }

    public int getUsesMax(){
        return usesMax;
    }

    public boolean pickUpItem(InteractibleItem interactibleItem, int usesMax, int usesCurrent, Inventory backpack){
        System.out.println("You have found an item!");
        System.out.println("Do you wish to pick up this " + interactibleItem.getName() + "? yes or no");
        String pickUp = myScanner.nextLine();
    
        if (pickUp.equalsIgnoreCase("yes")) {
            new Inventory().addItem(interactibleItem);
            //backpack.addItem(interactibleItem);
            return true;
        }
        else{
            System.out.println("Okey, moving on...");
            return false;
        }
    }

    public void useItem(Inventory backpack){
         

    }
}
