import java.util.List;

public class PickUpAction implements Action{

    @Override
    public String getName() {
        return "Pick Up Item";
    }

    //Kollar vilka items som finns i rummet och frågar användaren vilken item (om de finns någon) de vill ta upp och lägga i backpacken
    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
       
        List<InteractibleItem> alt = currentRoom.getItems();

       if(alt.size() < 1){
        System.out.println("There is nothing to pick up...");
        return false;
       }
        int index = Utilities.chooseAlternative("Which item do you wish to pick up?", 
        alt, true);
        currentUser.addToBackpack(alt.get(index));
        System.out.println("You carefully pick up " + alt.get(index).getName() + " and put it in your backpack.");
        currentRoom.removeItem(alt.get(index));
        return true;
    }
    
}
