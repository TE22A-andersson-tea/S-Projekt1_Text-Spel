
public class Item {
    private String name;
    private String description;
    //Scanner myScanner = new Scanner(System.in);

    public Item(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String showDescription(){
        return description;
    }

    public String getName(){
        return name;
    }
}
