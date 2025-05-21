public class Consumable extends InteractibleItem{
    
    //Construktor
    public Consumable (String name, String description, int usesCurrent, int usesMax, int id){
        super(name, description, usesCurrent, usesMax, id);   

    }

    //Overrid:ar useItem i InteractibleItem för att specialanpassa för consumableitems
    @Override
    public void useItem(Inventory backpack){
        int index = Utilities.chooseAlternative("Which item do you wish to use?", backpack.items, true);
        InteractibleItem itemToUse = backpack.items.get(index);

        //Om man har använt den usesMax gånger så tas den bort från användarens backpack
        if (itemToUse.getUsesCurrent() == itemToUse.getUsesMax()) {
            //Kan förbättras genom att göra det till en metod för att kunna ha items private
            backpack.items.remove(index); 
            System.out.println("You consumed " + itemToUse.getName());
        }
        else{
            //Annars ökas användningen med 1
            itemToUse.addUsesCurrent();
        }
        
        
    }
}
