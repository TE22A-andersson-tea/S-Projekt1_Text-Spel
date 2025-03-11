import java.util.Scanner;

public class Item {
    private String name;
    private String description;
    Scanner myScanner = new Scanner(System.in);

    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){

        return description;
    }

    public boolean pickUpItem(String name){
        System.out.println("You have found an item!");
        System.out.println("Do you wish to pick up this item? yes or no");
        String pickUp = myScanner.nextLine();
        if (pickUp == "yes") {
            return true;
        }
        else{
            return false;
        }
    }
}
