import java.util.List;

public class OpenDoorAction implements Action{
    String name = "Open Door";

    public OpenDoorAction() {
    }

    @Override
    public String getName() {
        return name;
    }

    
    
    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
        //Hittar först dörren i rummet (om det finns någon)
        Door door = currentRoom.findDoor();
        if (door == null) {
            System.out.println("There is no door...");
            return false;
        }
        
        //Om det inte finns ett lås på dörren
        if (door.getLock() == null) {
            Room leadsTo = door.getLeadsTo();
        
            if(leadsTo == null) {
                return false;
            }

            boolean entered = leadsTo.enterRoom();
            
            //Ändrar så att det nya rummet användaren går in i blir "currentRoom"
            if(entered) {
                engine.setCurrentRoom(leadsTo);
                return true;
            }
            return false;
        }

        //Om det finns ett låst lås på dörren
        if (door.getLock().getLockedStatus()) {
            System.out.println("The door is locked, you have to find something to open it with...");
            return false;
        }

        Room leadsTo = door.getLeadsTo();
        
        //Om dörren inte leder till något rum
        if(leadsTo == null) {
            return false;
        }

        //Om det inte finns något låst lås går användaren bara in
        boolean entered = leadsTo.enterRoom();
        
        if(entered) {
            engine.setCurrentRoom(leadsTo);
            return true;
        }
        return false;
       
    }

}
