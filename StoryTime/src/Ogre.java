
public abstract class Ogre  {
	int height;
	String name;
	
	
	public Ogre(int height, String name){
		this.height = height;
		this.name = name; 
		}
	
	String getName(){
		return this.name;
	}
	
	int getHeight(){
		return this.height;
	}
	
	abstract int hitPoints();
}