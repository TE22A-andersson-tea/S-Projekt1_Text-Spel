import java.util.ArrayList;

public class Inventory {
    private int numItems;
    public int maxItems = 7;
    public ArrayList<Item> items = new ArrayList<>(maxItems);

    public Inventory(){

    }

    public void displayInventory(){
        for (int i = 0; i < maxItems && i <= numItems; i++) {
            Item item = items.get(i); 
            System.out.println((i+1) + " " + item.getName());
        }
    }

    public void addItem(Item item, int numItems, int maxItems){
        
        if (numItems < maxItems) {
            items.add(item);
            numItems++;
            System.out.println(item + " has been added to your backpack!");
        }
        else{
            System.out.println("You have too many items in your backpack!\n You have to leave one item too pick up a new one");
        }
       
    }

    public void leaveItem(){
        int index = Utilities.chooseAlternative("Which item would you like to leave? ", items, true);
        
        items.remove(index);
       
    } 
        
}
