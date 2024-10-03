import java.util.ArrayList;

public class GameMenuClient{
	public static void main(String[] args) {
		ArrayList<String> actions = new ArrayList<>();
		actions.add("1) Start game");
		actions.add("2) Resume");
		actions.add("3) Pause game");
		actions.add("4) End game");
		GameMenu gameMenu = new GameMenu(actions);
		gameMenu.displayMenu();
	}
}