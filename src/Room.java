import java.util.ArrayList;

public class Room {
    private String description;
    private String name;
    //private String whichRoom; till exempel "tredje dörren till höger"  ???
    private boolean locked;
    public ArrayList<Furniture> furnitures = new ArrayList<>();

    public Room(String description, String name, boolean locked){

    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    /*public boolean enterRoom(String whichRoom){ Vad vill jag att denna ska göra?
        
    }*/

    /*public void addFurniture(){ Behöver jag denna??

    }*/

    public void displayInventory(){
        for (Furniture furniture : furnitures) {
            System.out.println(furniture);
        }
    }


}
