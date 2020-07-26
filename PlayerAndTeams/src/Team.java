import java.util.ArrayList;

public class Team {
	private ArrayList<Player> players;

	public int getTeamScore(){
		int totalTeamScore = 0;
		for(Player p : players){
			totalTeamScore += p.getPlayerScore();
		}
		return totalTeamScore;
	}

	public boolean isBetterThan(Team other){
		return other.getTeamScore() < this.getTeamScore();
	}
}
