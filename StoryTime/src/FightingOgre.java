
public class FightingOgre extends Ogre implements Characters{
	int strength = 10;
	int fightingAbility = 5;
	int weight;
	
	public FightingOgre(int height, String name, int weight) {
		super(height, name);
		this.weight = weight;
	}

	@Override
	public void greeting() {
		System.out.println("Hello, Brother.");
	}

	@Override
	public void deathNoise() {
		System.out.println("Ahh im dead");
	}

	@Override
	int hitPoints() {
		return this.strength + this.fightingAbility;
	} 
	
		
}
