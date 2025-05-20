
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

    public void buildWorld(){
        Room room1 = new Room("First Room", 
        "This is the entry hall of the mighty castle", 
        currentId++);

        Room room2 = new Room("Dining Room", 
        "This is the dining room of the mighty castle", 
        currentId++);

        Room room3 = new Room("Staircase", "This is the main starcase leading to the top floor", currentId++);

        room1.addFurniture(new Furniture("Bench", 
        "This is a bench to sit on when you put on your boots", currentId++, 
        room1));

        room1.addInteractibleFurniture(new Door("Dining Room Door", "This door leads to the large dining room", currentId++, room1, room2));

        setCurrentRoom(room1);

        

        room2.addFurniture(new Furniture("Dining table", 
        "The dining table is overfull with delicious food and desserts", currentId++, 
        room2));

        room2.addInteractibleFurniture(new Door("Stair Door", "This door leads to the main stairs", currentId++, room2, room3));

        User currentUser = new User("Steve", "Blond", 3);

        // Add possible game actions
        gameActions.add(new LookAction());
        gameActions.add(new OpenDoorAction());

        gameRooms.add(room1);
        gameRooms.add(room2);
    }

    public void runGame(){
        boolean quit = false;
        while(!quit) {
            System.out.println("What do you want to do?");
            Action selectedAction = selectAction(gameActions);
            selectedAction.execute(currentUser,getCurrentRoom(),this);
        }
    }
    /*
     * Item{
     * unock(Key test)
     * if id==tes.id{
     *  unlock --> true
     * }else{
     * no can do  -- false
     * }
     * 
     * 
     * action?  --> unlock chest
     * currentItem= chest
     * what key? -->2
     * usedKey= items.get(??)
     * success= currentItem.unlock(usedKey)
     * currentItem.setStatus(success)
     * }
     */

    Action selectAction(List<Action> gameActions) {
        List<String> alts = gameActions.stream().map(action -> action.getName()).collect(Collectors.toList());
        int altIdx = Utilities.chooseStringAlternative("Choose action:", alts, true);
        return gameActions.get(altIdx);
    }

}

