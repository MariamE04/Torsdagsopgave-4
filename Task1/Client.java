public class Client{
	public static void main(String[] args){
		Team team1 = new Team("Rullers");
        Team team2 = new Team("Bulldogs");
        Team team3 = new Team("Lakers");
        Team team4 = new Team("BlackJet");
        Team team5 = new Team("Wings");

		team1.setRank(2);
        team2.setRank(4);
        team3.setRank(2);
        team4.setRank(1);
        team5.setRank(5);

        team1.addPlayer("Kai");
        team2.addPlayer("Armin");
        team3.addPlayer("Luka");
        team4.addPlayer("Camron");
        team4.addPlayer("Markus");

        System.out.println(team1);
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team4);
        }
}