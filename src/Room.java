import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room extends WorldObject{
    //private String whichRoom; till exempel "tredje dörren till höger"  ???
    private List<InteractibleFurniture> contains = new ArrayList<>();
    private List<Furniture> furnitures = new ArrayList<>();
    private List<Room> conectingRooms = new ArrayList<>();
    private List<InteractibleItem> items = new ArrayList<>();
    private int numFurniture = furnitures.size();
    Scanner myScanner = new Scanner(System.in);
    
    
    public Room(String name, String description, int id){
        super(name, description, id);
    }

    public List<InteractibleItem> getItems() {
        return items;
    }

    public void setItems(List<InteractibleItem> items) {
        this.items = items;
    }

    public Door findDoor() {
        List<InteractibleFurniture> intFurniture = getInteractibleFurniture();
        for(Furniture furniture : intFurniture) {
            if(furniture instanceof Door door) {
                return door;
            }
        }
        return null;
    }

    // Return boolen if enter succeeds, use this returned boolean in game engine to set to active room if success
    public boolean enterRoom(){ 
        System.out.println("You have now entered " + getName());
        System.out.println(getDescription());
        displayInventory();
        return true;
        
    }

    public void addFurniture(Furniture furniture){ 
        furnitures.add(furniture);
    }

    public List<Furniture> getFurniture() {
        return furnitures;
    }

    public List<InteractibleFurniture> getInteractibleFurniture() {
        return contains;
    }
    
    public void addInteractibleFurniture(InteractibleFurniture furniture) {
        contains.add(furniture);
    }

    public void displayInventory(){
        //Om rummet inte innehåller några furniture eller items säg det
        System.out.println("This room contains these furnitures: ");
        for (int i = 0; i < furnitures.size(); i++) {
            Furniture furniture = furnitures.get(i);
            System.out.println((i+1) + " " + furniture.getName());
        }
         for (int i = 0; i < contains.size(); i++) {
            InteractibleFurniture furniture = contains.get(i);
            System.out.println((i+1) + " " + furniture.getName());
        }
        System.out.println("And contains these items: ");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
             System.out.println((i+1) + " " + item.getName());
        }
       
    }

    public List<InteractibleItem> getInteractibleItem() {
        return items;
    }

    public void addInteractibleItem(InteractibleItem item){
        items.add(item);
    }

}
