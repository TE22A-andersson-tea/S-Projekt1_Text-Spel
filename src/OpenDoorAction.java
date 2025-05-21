import java.util.List;

public class OpenDoorAction implements Action{
    String name = "Open Door";

    public OpenDoorAction() {
    }

    public String getName() {
        return name;
    }

    //Hittar först vilket rum dörren leder till
    //Ändrar så att det nya rummet användaren går in i blir "currentRoom"
    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
        Door door = currentRoom.findDoor();
        if (door == null) {
            System.out.println("There is no door...");
            return false;
        }
        
        if (door.getLock() == null) {
            Room leadsTo = door.getLeadsTo();
        
            if(leadsTo == null) {
                return false;
            }
            boolean entered = leadsTo.enterRoom();
            
            if(entered) {
                engine.setCurrentRoom(leadsTo);
                return true;
            }
            return false;
        }

        if (door.getLock().getLockedStatus()) {
            System.out.println("The door is locked you have to find something to open it with...");
            return false;
        }

        Room leadsTo = door.getLeadsTo();
        
            if(leadsTo == null) {
                return false;
            }
            boolean entered = leadsTo.enterRoom();
            
            if(entered) {
                engine.setCurrentRoom(leadsTo);
                return true;
            }
            return false;
       
       
    }

    //Denna metod behövs inte längre?
    //Hittar vilket rum en dörr leder till
    private Room findRoom(Room currentRoom) {
        List<InteractibleFurniture> intFurniture = currentRoom.getInteractibleFurniture();
        Room leadsTo = null;
        for(Furniture furniture : intFurniture) {
            if(furniture instanceof Door door) {
                leadsTo = door.getLeadsTo();
            }
        }
        return leadsTo;
    }

}
