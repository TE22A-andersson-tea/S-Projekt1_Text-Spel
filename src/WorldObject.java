public class WorldObject {
    private String name;
    private String description;
    private int id;

    //Superklass till alla objekt som finns i spel världen
    public WorldObject (String name, String description, int id){
       this.name = name;
       this.description = description;
       this.id = id;

    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }
}
