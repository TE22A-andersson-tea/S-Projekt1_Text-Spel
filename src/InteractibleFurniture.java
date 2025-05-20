public class InteractibleFurniture extends Furniture{
    public Inventory contains;
    public boolean locked;

    public InteractibleFurniture(String name, String description, int id, Room room, boolean locked){
        super(name, description, id, room);
        this.locked = locked;
        contains = new Inventory();

    }

    @Override
    public void investigate(boolean locked, String name, String description){
        if (locked = true) {
            System.out.println("Sorry " + name + " is locked. You have to find something to unlock it with."); 
            
        }
        else if (locked = false){
            contains.displayInventory();
           
        }
         
    }

   
}
