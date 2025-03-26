public class InteractibleFurniture extends Furniture{
    public Inventory contains;
    private boolean locked;
    private int id;

    public InteractibleFurniture(String name, String description){
        super(name, description);

    }

    @Override
    public String investigate(){
        return description;
    }
}
