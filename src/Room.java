import java.util.ArrayList;

public class Room {
    private String description;
    private String name;
    //private String whichRoom; till exempel "tredje dörren till höger"
    private boolean locked;
    public ArrayList<Furniture> furnitures = new ArrayList<>();

    public Room(String description, String name, boolean locked){

    }

    public String getDescription(){
        return name + description;
    }

    public boolean enterRoom(String whichRoom){
        System.out.println("Do you wish to enter " + whichRoom + "?");

        return true;
    }

    public void addFurniture(){

    }

    public void displayInventory(){
        
    }


}
