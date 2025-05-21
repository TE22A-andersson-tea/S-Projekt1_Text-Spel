public class DisplayBackpackAction implements Action{

    //Namnet som skrivs ut i terminalen
    @Override
    public String getName() {
        return "Show Backpack";
    }

    //Skriver ut allt som finns i den nuvarande använarens backpack
    @Override
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine) {
       currentUser.getBackpack().displayInventory();
       return true;
    }

}
