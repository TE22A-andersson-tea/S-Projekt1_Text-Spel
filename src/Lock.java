public class Lock extends WorldObject{
    private boolean locked;

    public Lock(String name, String description, int id, boolean locked){
        super(name, description, id);
        this.locked = locked;
    }

    public boolean getLockedStatus(){
        return locked;
    }

    public void changeLockedStatus(){
        locked = !locked;
    }
}
