import java.util.List;

public class UnlockAction implements Action{

    @Override
    public String getName() {
        return "Unlock";
    }

    //
    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
        //Kollar om det finns någon Unlocker i användarens backpack
        Unlocker unlocker = currentUser.getBackpack().findUnlocker();
        
        if (unlocker == null) {
            System.out.println("There is nothing in your backpack to unlock it with...");
            return false;
        }
        
        //Hittar dörr och motsvarande lås i nuvarande rum
        Door door = currentRoom.findDoor();
        Lock lock = door.getLock();

        //Kollar om givna nyckeln kan låsa upp låset
        if(engine.canUnlock(unlocker, lock)){
            lock.changeLockedStatus();
            System.out.println("You unlocked " + door.getName() + " using " + unlocker.getName());
            unlocker.useItem(currentUser.getBackpack());
            return true;
        }
        
        else{
            System.out.println("Your key does not match with the lock and it continues to be locked...");
            return false;
        }
        
    }
    
}
