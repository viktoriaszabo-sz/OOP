
public class CarAssignment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car(); 
		
		car1.printData();
		car1.accelerate(); 
		car1.breaking();
		car1.printData();
		car1.refuel(10);
		
		Car car2 = new Car("Mercedes", "100", 80); //this is the parameterized constructor
		car2.printData();
	}
}
class Car {
	
	public String brand = "Fiat"; 
	public String model = "500"; 
	public int amountOfFuel = 50; 
	

	public void printData()
	{
		System.out.println("\nBrand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Amount of fuel: " + amountOfFuel);
	}
	public void breaking() 
	{
		System.out.println("\nCar is breaking");
	}
	public void accelerate()
	{
		if (amountOfFuel > 0) {
		System.out.println("\nCar is accelerating"); 
		amountOfFuel = amountOfFuel - 1; 
		} else {
			System.out.println("You can't accelerate, there's not enough fuel in the car"); 
		}
	}
	public void refuel (int amount) 
	{
		System.out.println("\nFuel on the tank: " + amountOfFuel); 
		System.out.println("Refuel: " + amount); 
		int ramount = amountOfFuel + amount;
		System.out.println("Fuel on the tank after the refuel: " + ramount);
	}
	public Car () 
	{
		brand = "Fiat"; 
		model = "500"; 
		amountOfFuel = 50; 
	}
	public Car (String brand, String model, int amountOfFuel)
	{
		this.brand = brand; 
		this.model = model; 
		this.amountOfFuel = amountOfFuel; 
	}
}
