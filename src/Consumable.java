public class Consumable extends InteractibleItem{
    
    public Consumable (String name, String description, int usesCurrent, int usesMax){
        super(name, description, usesCurrent, usesMax);
        this.name = name;
        this.description = description;
        this.usesCurrent = usesCurrent;
        this.usesMax = usesMax;

    }

    @Override
    public void useItem(InteractibleItem interactibleItem){

    }
}
