import java.util.ArrayList;

public class Team {
	private String teamName;
	private int rank;
	private ArrayList<String> teamPlayers;

	public Team(String teamName){
		this.teamName = teamName;
		this.teamPlayers = new ArrayList<String>();
	}

	public void setRank(int rank){
		this.rank = rank;
	}


	public void addPlayer(String playerName) {
        this.teamPlayers.add(playerName);
    }


	public String toString(){
		String result = "Team: " + teamName + ", Rank: " + rank + "\nPlayers:\n";
		for (String player : teamPlayers) {
        result += player + "\n";
	}
		return result;
	}
}