public class Furniture extends WorldObject{
    public Room room;
    
    //Construktor 
    public Furniture(String name, String description, int id, Room room ){
       super(name, description, id);
        this.room = room;
    }

    //Skriver ut beskrivningen av vad användaren vill "utforska"
    public void investigate(boolean locked, String name, String description){
        System.out.println("This is a " + name);
        System.out.println(description); 
    }
    
}
