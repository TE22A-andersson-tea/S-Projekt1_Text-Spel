public class Consumable extends InteractibleItem{
    
    //Construktor
    public Consumable (String name, String description, int usesCurrent, int usesMax, int id){
        super(name, description, usesCurrent, usesMax, id);   

    }

    //Använder InteractibleItem metoden för att specialanpassa för consumableitems
    @Override
    public void useItem(Inventory backpack){
        //Inventory.backpack.remove(interactibleItem.getId());
        
    }
}
