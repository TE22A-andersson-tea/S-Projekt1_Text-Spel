public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //new Main().main();
        MainGameEngine myGE = new MainGameEngine();
        myGE.buildWorld(); 
        myGE.runGame(); 
        //new GameEngine().buildWorld();
    }
}
