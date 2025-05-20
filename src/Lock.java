public class Lock extends WorldObject{
    public boolean locked;

    public Lock(String name, String description, int id, boolean locked){
        super(name, description, id);
        this.locked = locked;
    }
}
