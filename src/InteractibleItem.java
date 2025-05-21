import java.util.Scanner;

public class InteractibleItem extends Item{
    public int usesCurrent;
    public int usesMax;
    Scanner myScanner = new Scanner(System.in);
    
    //Construktor
    public InteractibleItem(String name, String description, int id, int usesCurrent, int usesMax){
        super(name, description, usesCurrent, usesMax, id);
    
    }

    //Returnerar hur många gånger den item har blivit använd av användaren
    public int getUsesCurrent(){
        return usesCurrent;
    }

    //Returnerar hur många gånger användaren kan använda en item
    public int getUsesMax(){
        return usesMax;
    }

     //Används denna och den som finns i inventory? kan jag ta bort den?
    public boolean pickUpItem(InteractibleItem interactibleItem, int usesMax, int usesCurrent, Inventory backpack){
        System.out.println("You have found an item!");
        System.out.println("Do you wish to pick up this " + interactibleItem.getName() + "? yes or no");
        String pickUp = myScanner.nextLine();
        
         //Lägg till maxgräns
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
