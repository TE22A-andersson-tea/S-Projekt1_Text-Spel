import java.util.Scanner;

public class User extends WorldObject{
    private Inventory backpack;

    public User(String name, String description, int id){
        super(name, description, id);
        backpack = new Inventory();
    }

    public String setName(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        return "Hello " + name + "!";
    }

    public void setInventory(Inventory backpack) {
        this.backpack = backpack;
    }

    public void addToBackpack(InteractibleItem item){
        backpack.addItem(item);
    }

    public Inventory getBackpack() {
        return backpack;
    }
}
