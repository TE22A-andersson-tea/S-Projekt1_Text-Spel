import java.util.ArrayList;

public class Room {
    private Furniture contains;
    //private String whichRoom; till exempel "tredje dörren till höger"
    private boolean locked;
    private ArrayList<Door> doors = new ArrayList<>();

    public Room(){

    }

    public boolean enterRoom(String whichRoom){
        System.out.println("Do you wish to enter " + whichRoom + "?");

        return true;
    }
}
