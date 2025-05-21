public class Door extends InteractibleFurniture{
    private Room leadsTo;
    private Lock lock;

    //Construktor nr 1, denna används för en vanlig dörr (utan lås)
    public Door(String name, String description, int id, Room room, Room leadsTo){
        super(name, description, id, room);
       this.leadsTo = leadsTo;
    }

    //Construktor nr 2, denna har ett lås för att kunna låsa dörrar
    public Door(String name, String description, int id, Room room, Room leadsTo, Lock lock){
        this(name, description, id, room, leadsTo);
       this.lock = lock;
    }

    //Returnerar det rum dörren "tillhör"
    public Room getRoom() {
        return room;
    }

    //Returnerar det rum dörren leder till
    public Room getLeadsTo(){
        return leadsTo;
    }

    //Returnerar de lås som tillhör dörren
    public Lock getLock() {
        return lock;
    }

}
