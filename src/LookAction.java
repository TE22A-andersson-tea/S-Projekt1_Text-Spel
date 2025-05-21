public class LookAction implements Action{
    String name = "Look";   

    public LookAction() {
    
    }

    //Returnerar namnet denna action har, och skriver ut det i terminalen
    public String getName() {
        return name;
    }

    //Beskriver rummet som användaren befinner sig i, t.ex vilka möbler som finns i rummet
    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
        System.out.println("You're standing in a room:");
        System.out.println(currentRoom.getDescription());
        currentRoom.displayInventory();
        return true;
    }

}
