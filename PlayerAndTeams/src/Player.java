public class Player {
	private int offenseAbility;
	private int defenseAbility;
	private int speed;
	
	public int getPlayerScore() {
		return offenseAbility + defenseAbility + speed;
	}
}
