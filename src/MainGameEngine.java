
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainGameEngine {
    public Map<Integer, Integer> keyMapping = new HashMap<>();
    Scanner myScanner = new Scanner(System.in);
    List<Room> gameRooms = new ArrayList<>();
    List<Action> gameActions = new ArrayList<>();
    User currentUser;
    Room currentRoom;
    int currentId = 0;
    

    public MainGameEngine() {
        
        
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    //Kollar om en Unlocker kan låsa upp ett Lock
    public boolean canUnlock(Unlocker unlocker, Lock lock){
        //lockId = id:t på låset som passar med givna nyckeln
        Integer lockId = keyMapping.get(unlocker.getId());
        
        //Om lockId inte är null och är lika med givna låsets id ==> return true = rätt lås + nyckel
        return lockId != null && lockId == lock.getId();
    }

    public void buildWorld(){
        //Skapar 3 rum
        Room room1 = new Room("First Room", 
        "This is the entry hall of the mighty castle", 
        currentId++);

        Room room2 = new Room("Dining Room", 
        "This is the dining room of the mighty castle", 
        currentId++);

        Room room3 = new Room("Staircase", "This is the main starcase leading to the top floor", currentId++);

        //Lägger till möbler i rum1
        room1.addFurniture(new Furniture("Bench", 
        "This is a bench to sit on when you put on your boots", currentId++, 
        room1));
        room1.addInteractibleFurniture(new Door("Dining Room Door", "This door leads to the large dining room", currentId++, room1, room2));

        //Sätter rum1 som aktivt rum
        setCurrentRoom(room1);

        //Skapar en nyckel
        Unlocker key1 = new Unlocker("Skeleton Key", "An important locking key", 0, 10, currentId++);
       
        //Skapar motsvarande lås till key1 och mappar dem till varandra
        Lock lock1 = new Lock("lock", "Silver", 101, true);
        keyMapping.put(key1.getId(), lock1.getId());

        //Lägger till möbler i rum2
        room2.addInteractibleItem(key1);
        room2.addFurniture(new Furniture("Dining table", 
        "The dining table is overfull with delicious food and desserts", currentId++, 
        room2));
        room2.addInteractibleFurniture(new Door("Stair Door", "This door leads to the main stairs", currentId++, room2, room3, lock1));

        //Skapar användare
        currentUser = new User("Steve", "Blond", 3);

        //Lägger till game actions i listan
        gameActions.add(new LookAction());
        gameActions.add(new OpenDoorAction());
        gameActions.add(new PickUpAction());
        gameActions.add(new DisplayBackpackAction());
        gameActions.add(new UnlockAction());

        //Lägger till rummen i listan
        gameRooms.add(room1);
        gameRooms.add(room2);
        gameRooms.add(room3);
    }

    public void runGame(){
        boolean quit = false;
        while(!quit) {
            System.out.println(" \nWhat do you want to do?");
            Action selectedAction = selectAction(gameActions);
            if(!selectedAction.execute(currentUser,getCurrentRoom(),this)){
                System.out.println("You over estimated your powers...");
            }
        }
    }

    //Listar upp möjliga actions och låter användaren välja action
    Action selectAction(List<Action> gameActions) {
        //Lista med gameActions, utför .getName på varje element i listan och skapar en ny lista med namn som strängar
        //Alternativt skulle kunna använda en for-loop men det här är coolare.
        List<String> alts = gameActions.stream().map(action -> action.getName()).collect(Collectors.toList());
        int altIdx = Utilities.chooseStringAlternative("Choose action:", alts, true);
        return gameActions.get(altIdx);
    }

}

