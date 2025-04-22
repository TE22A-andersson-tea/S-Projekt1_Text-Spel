public class Furniture {
    public String name;
    public String description;
    

    public Furniture(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String investigate(boolean locked, String name, String description){
        locked = false;
        return name + description;
    }

    public String getDescription(){
        return description;
    }
}
