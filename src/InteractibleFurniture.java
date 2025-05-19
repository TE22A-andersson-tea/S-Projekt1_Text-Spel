public class InteractibleFurniture extends Furniture{
    public Inventory contains;
    private boolean locked;

    public InteractibleFurniture(String name, String description, Room room, boolean locked, int id){
        super(name, description,id, room);
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
