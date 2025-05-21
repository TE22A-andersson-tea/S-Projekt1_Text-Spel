public class InteractibleFurniture extends Furniture{
    public Inventory contains;

    //Construktor, Interactible furniture har ett inventory för items
    public InteractibleFurniture(String name, String description, int id, Room room){
        super(name, description, id, room);
        contains = new Inventory();

    }

    //Kollar om en interactible furniutre är låst och och beroende på det svaret visas/visas inte inventoryt för den möbeln
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
