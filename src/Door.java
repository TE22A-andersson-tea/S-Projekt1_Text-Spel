public class Door extends InteractibleFurniture{
    public Room room;
    public boolean locked;

    public Door(String name, String description, int id, Room room, boolean locked){
        super(name, description, id, room, locked);
        this.locked = locked;
        
    }
}
