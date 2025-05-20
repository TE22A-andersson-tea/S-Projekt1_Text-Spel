
import java.util.HashMap;
import java.util.Map;

public class GameEngine {
    public Map<Integer, Integer> keyMapping = new HashMap<>();
    
    public void GameEngine() {

        
    }

    public void buildWorld(){
        Unlocker key1 = new Unlocker("key", "Silver", 0, 10, 1);
        Lock lock1 = new Lock("lock", "Silver", 101, true);
        keyMapping.put(key1.getId(), lock1.getId());

        User user1 = new User("Steve");
        user1.setName();
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

