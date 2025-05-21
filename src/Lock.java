public class Lock extends WorldObject{
    private boolean locked;

    //Construktor
    public Lock(String name, String description, int id, boolean locked){
        super(name, description, id);
        this.locked = locked;
    }

    //Returnerar om låset är låst eller inte
    public boolean getLockedStatus(){
        return locked;
    }

    //Ändrar så att om låset är låst så öppnas det och tvärtom
    public void changeLockedStatus(){
        locked = !locked;
    }
}
