import java.util.ArrayList;
import java.util.Scanner;

public class Room extends WorldObject{
    private String description;
    private String name;
    //private String whichRoom; till exempel "tredje dörren till höger"  ???
    private InteractibleFurniture contains;
    private int numFurniture;
    private boolean locked;
    private ArrayList<Furniture> furnitures = new ArrayList<>();
    private ArrayList<Room> conectingRooms = new ArrayList<>();
    Scanner myScanner = new Scanner(System.in);
    

    public Room(String name, String description, int id, boolean locked){
        super(name, description, id);
        this.locked = locked;
    }

    public boolean getLockedStatus(){
        return locked;
    }

    public void enterRoom(Room chosenRoom){  //Vad vill jag att denna ska göra?
        if (chosenRoom.getLockedStatus() == false) {
            System.out.println(chosenRoom.getDescription());
            chosenRoom.displayInventory();
        }
        else{
            System.out.println("The door to " + chosenRoom.name + " is locked\nYou have to find something to open it with");
        }
        
    }

    public void addFurniture(Furniture furniture){ 
        furnitures.add(furniture);
    }

    public void displayInventory(){
        for (int i = 0; i < furnitures.size(); i++) {
            Furniture furniture = furnitures.get(i);
            System.out.println((i+1) + " " + furniture.getName());
        }
       
    }


}
