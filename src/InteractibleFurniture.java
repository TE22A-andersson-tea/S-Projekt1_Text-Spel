public class InteractibleFurniture extends Furniture{
    public Inventory contains;
    private boolean locked;
    private int id;

    public InteractibleFurniture(String name, String description, boolean locked, int id){
        super(name, description);
        this.name = name;
        this.description = description;
        this.locked = locked;
        this.id = id;
        contains = new Inventory();

    }

    @Override
    public String investigate(boolean locked, String name, String description){
        if (locked = true) {
            return "Sorry " + name + " is locked";
        }
        else if (locked = false){
            contains.displayInventory();
           
        }
        return description; 
    }

   
    public String getDescription(){
        return description;
    }
}
