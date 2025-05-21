public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Game World!");
        
        MainGameEngine myGE = new MainGameEngine();
        myGE.buildWorld(); 
        myGE.runGame(); 
       
    }
}
