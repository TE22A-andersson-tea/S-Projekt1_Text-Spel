
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameEngine {
    public Map<Integer, Integer> keyMapping = new HashMap<>();
    Scanner myScanner = new Scanner(System.in);
    
    public GameEngine() {
        
        
    }

    public void buildWorld(){
        Unlocker key1 = new Unlocker("key", "Silver", 0, 10, 1);
        Lock lock1 = new Lock("lock", "Silver", 101, true);
        keyMapping.put(key1.getId(), lock1.getId());

        User user1 = new User("Steve");
        Inventory backpack = new Inventory();
        user1.setName();

        Room hall = new Room("Small", "hall", false);
        
        InteractibleFurniture desk = new InteractibleFurniture("Desk", "made of dark wood", 0, hall, false);
        hall.addFurniture(desk);

        boolean con = true; 
        
        while (con) {
            System.out.println("You have found an item would you like to pick it up? 1 = yes");
            int pickUP = myScanner.nextInt();
            if (pickUP == 1) {
                backpack.addItem(key1, 1, 7);
                user1.setInventory(backpack);
                System.out.println(key1.getName() + " has been added to your backpack!");
            }
            else{
                System.out.println("Okey!");
            }

            System.out.println("Would you like to see whats in your backpack? 1 = yes");
            int seeBackpack = myScanner.nextInt();
            if (seeBackpack == 1) {
                backpack.displayInventory();
            }
            else{
                System.out.println("Okey!");
            }

            System.out.println("Would you like to quit?");
            int quitString = myScanner.nextInt();
            if (quitString == 1) {
                System.out.println("Goodbye!");
                con = false;
            }
            else{
                System.out.println("Okey!");
            }
        }

        System.out.println("You have to continue");
    }

    public void runGame(){
        
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

}

