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

    //Lägger till 1 på antal användningar
    public void addUsesCurrent(){
        usesCurrent++;
    }

    //Returnerar hur många gånger användaren kan använda en item
    public int getUsesMax(){
        return usesMax;
    }


    public void useItem(Inventory backpack){
         

    }
}
