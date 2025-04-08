public class Furniture {
    public String name;
    public String description;
    

    public Furniture(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String investigate(){
        return description;
    }

    public String getDescription(){
        return description;
    }
}
