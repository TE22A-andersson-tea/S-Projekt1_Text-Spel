
import java.util.HashMap;
import java.util.Map;

public class GameEngine {
    public Map<Integer, Integer> keyMapping = new HashMap<>();
    
    public void GameEngine() {

        
    }

    public void buildWorld(){
        Unlocker key1 = new Unlocker("key", "Fin", 0, 10, 1);
        Lock lock1 = new Lock(101);
        keyMapping.put(key1.getId, lock1.getId);

        User user1 = new User(null);
        user1.setName();
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

