public class DisplayBackpackAction implements Action{

    @Override
    public String getName() {
        return "Show Backpack";
    }

    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
       currentUser.getBackpack().displayInventory();
       return true;
    }

}
