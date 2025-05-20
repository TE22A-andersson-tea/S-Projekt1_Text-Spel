public class Door extends InteractibleFurniture{
    private Room leadsTo;
    private Lock lock;

    public Door(String name, String description, int id, Room room, Room leadsTo){
        super(name, description, id, room);
       this.leadsTo = leadsTo;
    }

    public Door(String name, String description, int id, Room room, Room leadsTo, Lock lock){
        this(name, description, id, room, leadsTo);
       this.lock = lock;
    }

    public Room getRoom() {
        return room;
    }

    public Room getLeadsTo(){
        return leadsTo;
    }

    public Lock getLock() {
        return lock;
    }

}
