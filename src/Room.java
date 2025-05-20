import java.util.ArrayList;

public class Room {
    private String description;
    private String name;
    private InteractibleFurniture contains;
    private int numFurniture;
    private boolean locked;
    public ArrayList<Furniture> furnitures = new ArrayList<>();
     //private String whichRoom; till exempel "tredje dörren till höger"  ???

    public Room(String description, String name, boolean locked){
        
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    /*public boolean enterRoom(String whichRoom){ Vad vill jag att denna ska göra?
        
    }*/

    public void addFurniture(Furniture furniture){ 
        furnitures.add(furniture);
    }

    public void displayInventory(){
        for (int i = 0; i < furnitures.size(); i++) {
            Furniture furniture = furnitures.get(i);
            System.out.println((i+1) + " " + furniture.getName());
        }
       
    }


}
