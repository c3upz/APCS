
public class Vehicle {
	String make;
	String model;
	int numWheels;
	double mpg; 
	static String fuelType = "Gas";
	
	//this is our first constructor
	public Vehicle(String make, String model, int numWheels, double mpg){
		this.make = make;
		this.model = model;
		this.numWheels = numWheels;
		this.mpg = mpg;
	}
	
	public Vehicle(String newMake, String newModel){
		make = newMake;
		model = newModel;
	}
	
	public String getMake(){
		return make;
	}
	
	public String getModel(){
		return model;
	}
	
	public int getNumWheels(){
		return numWheels;
	}
	
	public double getMpg(){
		return mpg;
	}
	
	public void setMake(String newMake){
		make = newMake;
	}
	public void setModel(String newModel){
		model = newModel;
	}
	
	public void setNumWheels(int newNumWheels){
		numWheels = newNumWheels;
	}
	
	public void setMpg(double newMpg){
		mpg = newMpg;
	}
	
	public String toString(){
		String str = "";
		str += "Make: " + make + "\n";
		str += "Model: " + model + "\n";
		str += "Number of Wheels: " + numWheels + "\n";
		str += "MPG: " + mpg + "\n";
		 
		return str;
	}
	
	//INSTANCE methods are performed by particular objects
	//for example 'sayYourAge()'
	//there must be an object in order to preform it
	//these do not contain the word static
	
	
	//STATIC methods belong to all objects of that type
	//There is really only 'one' of them. All objects share the same 
	//staic methods. We dont even need an instance of the object to run
	//these methods but they can be run by instances of the object
	
	public static String getFuelType(){
		return fuelType;
	}
	
	
	
}
