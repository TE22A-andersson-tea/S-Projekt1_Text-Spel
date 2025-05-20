import java.util.List;

public class OpenDoorAction implements Action{
    String name = "Open Door";

    public OpenDoorAction() {
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
        List<InteractibleFurniture> intFurniture = currentRoom.getInteractibleFurniture();
        Room leadsTo = null;
        for(Furniture furniture : intFurniture) {
            if(furniture instanceof Door door) {
                leadsTo = door.getLeadsTo();
            }
        }
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

}
