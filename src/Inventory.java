import java.util.ArrayList;

public class Inventory {
    private int numItems;
    private int maxItems = 7;
    private ArrayList<Item> items = new ArrayList<>(maxItems);

    public Inventory(){

    }

    public void display(){
        for (Item item: items){
            System.out.println(item);
        }
    }

    public void addItem(Item item, int numItems, int maxItems){
        if (numItems < maxItems) {
            items.add(item);
            numItems++;
        }
        else{
            System.out.println("You have too many items in your backpack!\n You have to leave one item too pick up a new one");
        }
       
    }
}
