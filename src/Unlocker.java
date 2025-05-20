
import java.awt.ItemSelectable;

public class Unlocker extends InteractibleItem{
    
    public Unlocker (String name, String description, int usesCurrent, int usesMax, int id){
        super(name, description, usesCurrent, usesMax, id);

    }

    @Override
    public void useItem(Inventory backpack){
       int index = Utilities.chooseAlternative("Which item do you wish to use?", backpack.items, true);
        InteractibleItem itemToUse = backpack.items.get(index);

        if (itemToUse.getUsesCurrent() == itemToUse.getUsesMax()) {
            //radera item
        }
    }
}
