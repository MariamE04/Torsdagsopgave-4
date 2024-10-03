import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu5{
	private ArrayList<String> actions;

	public GameMenu5(ArrayList<String> actions){
		this.actions = actions;
	}

	public void displayMenu() {
        for (int i = 0; i < actions.size(); i++) {
            System.out.println((i + 1) + ": " + actions.get(i));
        }
    }
        public String getAction(){
        	System.out.println("Type a number to choose an action");
        	 displayMenu(); 

        	Scanner scanner = new Scanner(System.in);
        	String userChoice = scanner.nextLine();

        	return userChoice;

    }
}