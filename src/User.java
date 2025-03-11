public class User {
    private String name;
    private Inventory backpack;

    public User(String name){
        this.name = name;
        backpack = new Inventory();
    }

    public void setInventory(Inventory backpack) {
        this.backpack = backpack;
    }

    public void chooseName(){

    }

    public String getName(){
        return name;
    }
}
