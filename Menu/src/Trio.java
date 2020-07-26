
public class Trio implements MenuItem{
	String name;
	double price;
	Sandwich sandwich;
	Drink drink;
	Salad salad;
	
	
	public Trio (Sandwich sandwich, Salad salad, Drink drink){
		this.sandwich = sandwich;
		this.salad = salad;
		this.drink = drink;
		
		name  = sandwich.name + salad.name + drink.name;
		price += Math.max(sandwich.price, salad.price);
		price += Math.max(Math.min(sandwich.price, salad.price), drink.price);
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

}
