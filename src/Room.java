public class Room {
    private Furniture contains;
    private String whichRoom; //till exempel "tredje dörren till höger"

    public Room(){

    }

    public boolean enterRoom(String whichRoom){
        System.out.println("Do you wish to enter " + whichRoom + "?");

        return true;
    }
}
