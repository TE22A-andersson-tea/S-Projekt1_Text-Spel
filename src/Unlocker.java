public class Unlocker extends InteractibleItem{
    
    public Unlocker (String name, String description, int usesCurrent, int usesMax, int id){
        super(name, description, usesCurrent, usesMax, id);

    }

    //Frågar vilken item användaren vill använda och tar bort den om den använts max gånger
    @Override
    public void useItem(Inventory backpack){
       int index = Utilities.chooseAlternative("Which item do you wish to use?", backpack.items, true);
        InteractibleItem itemToUse = backpack.items.get(index);

        if (itemToUse.getUsesCurrent() == itemToUse.getUsesMax()) {
            backpack.items.remove(index);
            System.out.println("You use your " + itemToUse.getName() + " one last time as it's now stuck to the lock...");
        }
        
    }
}
