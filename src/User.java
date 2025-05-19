import java.util.Scanner;

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

    public void setName(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        System.out.println("Hello " + name + "!");
        
    }

    public String getName(){
        return name;
    }
}
