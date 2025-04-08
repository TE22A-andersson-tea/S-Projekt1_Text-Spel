public class Key extends InteractibleItem{
    //String description;
    //String name;
    int id;
    
    public Key (String name, String description, int usesCurrent, int usesMax, int id){
        super(name, description, usesCurrent, usesMax);
        this.id = id;

    }

    @Override
    public void useItem(String name){

    }
}
