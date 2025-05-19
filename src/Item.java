
public class Item extends WorldObject{
    public int usesCurrent;
    public int usesMax;
    //Scanner myScanner = new Scanner(System.in);

    public Item(String name, String description, int id, int usesCurrent, int usesMax){
        super(name, description, id);
        this.usesCurrent = usesCurrent;
        this.usesMax = usesMax;
    }

    
}
