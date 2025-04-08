public class Consumable extends InteractibleItem{
    
    public Consumable (String name, String description, int usesCurrent, int usesMax){
        super(name,description, usesCurrent, usesMax);

    }

    @Override
    public void useItem(String name){

    }
}
