import java.util.List;

public class PickUpAction implements Action{

    @Override
    public String getName() {
        return "Pick Up Item";
    }

    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
       List<InteractibleItem> alt = currentRoom.getItems();

        int index = Utilities.chooseAlternative("Which item do you wish to pick up?", 
        alt, true);
        currentUser.addToBackpack(alt.get(index));
        System.out.println("You have now picked up " + alt.get(index).getName() + " and put it in your backpack.");
        return true;
    }
    
}
