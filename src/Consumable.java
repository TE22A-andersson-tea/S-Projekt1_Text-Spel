public class Consumable extends InteractibleItem{
    
    public Consumable (String name, String description, int usesCurrent, int usesMax, int id){
        super(name, description, usesCurrent, usesMax, id);   

    }

    @Override
    public void useItem(InteractibleItem interactibleItem){
        //Inventory.backpack.remove(interactibleItem.getId());
        
    }
}
