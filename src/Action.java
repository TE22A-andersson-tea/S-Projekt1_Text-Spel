//interface beskriver vilka metoder som ska finnas men innehåller ingen kod
public interface Action {
    public String getName();
    public boolean execute(User currentUser, Room currentRoom, MainGameEngine engine);
}
