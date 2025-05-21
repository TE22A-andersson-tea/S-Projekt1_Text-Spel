import java.util.ArrayList;

public class Inventory {
    private int maxItems = 7;
    public ArrayList<InteractibleItem> items = new ArrayList<>(maxItems); //ändra Item till InteractibleItems
    private int numItems = items.size();
    
    //Construktor
    public Inventory(){

    }

    //Skriver ut hur många items som finns i inventoryt
    public int getNumItems(){
        return numItems;
    }

    //Skriver ut allt som finns i användarens backpack, om den i tom så skrivs det ut
    public void displayInventory(){
        System.out.println("Displaying Backpack: ");
        if (!items.isEmpty()) { //if (items.size()>0)

            for (int i = 0; i == numItems; i++) {
                Item item = items.get(i); 
                System.out.println((i+1) + " " + item.getName());
            }
        }
        else{
            System.out.println("You have nothing in your backpack");
        }
    }

    //Lägger till en item i backpack (om användarens backpack har plats)
    public void addItem(InteractibleItem item){
        if (numItems < maxItems) {
            items.add(item);
            System.out.println(item.getName() + " has been added to your backpack!");
        }
        else{
            System.out.println("You have too many items in your backpack!\n You have to leave one item too pick up a new one");
        }
       
    }

    //Tar bort en item från inventory
    public void leaveItem(){
        int index = Utilities.chooseAlternative("Which item would you like to leave? ",items , true);
        
        items.remove(index);
       
    } 

    public void getItemIndex(){
        
        //ta reda på item:s index i listan??
        /*while (i != itemIndex) {
            for (int i = 0; i < numItems; i++) {
                
            }
        }*/
    }
        
}
