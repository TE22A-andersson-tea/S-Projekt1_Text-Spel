public class LookAction implements Action{
    String name = "Look";   

    public LookAction() {
    
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
        System.out.println("You're standing in a room:");
        System.out.println(currentRoom.getDescription());
        currentRoom.displayInventory();
        return true;
    }

}
