public class App {
    public static void app(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //new Main().main();
        GameEngine myGE = new GameEngine();
        myGE.buildWorld();
        myGE.runGame();
    }
}
