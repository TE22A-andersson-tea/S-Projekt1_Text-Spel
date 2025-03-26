public class InteractibleItem extends Item{
    public int usesCurrent;
    public int usesMax;
    
    public InteractibleItem(String name, String description, int usesCurrent, int usesMax){
        super(name,description);
        this.usesCurrent = usesCurrent;
        this.usesMax = usesMax;

    }


    public boolean pickUpItem(String name){
        System.out.println("You have found an item!");
        System.out.println("Do you wish to pick up this item? yes or no");
        String pickUp = myScanner.nextLine();
        if (pickUp == "yes") {
            return true;
        }
        else{
            return false;
        }
    }

    public void useItem(){
        
    }
}
