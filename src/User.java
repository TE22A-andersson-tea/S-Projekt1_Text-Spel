import java.util.Scanner;

public class User {
    private String name;
    public Inventory backpack;

    public User(String name){
        this.name = name;
        backpack = new Inventory();
    }

    /*public void setInventory(Inventory backpack) { Vad gör denna?? behöver jag den?
        this.backpack = backpack;
    }*/

    public String setName(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = myScanner.nextLine();
        return "Hello " + name + "!";
        
    }

    public String getName(){
        return name;
    }
}
