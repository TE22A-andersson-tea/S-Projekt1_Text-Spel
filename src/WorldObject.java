public class WorldObject {
    public String name;
    public String description;
    public int id;

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
