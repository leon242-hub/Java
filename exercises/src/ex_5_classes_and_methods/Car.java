package ex_5_classes_and_methods;

public class Car {
	private String model;
	private String year;

	public Car(String model, String year) {
		this.model = model;
		this.year = year;
	}

	public void printData() {
		System.out.println("Model: " + this.model + "\n" + "Year: " + this.year);
	}

	public void printData(String model) {
		System.out.println("New model is: " + model);
	}

	public void printData(int amount){
		System.out.println("New color is " + amount);
	}
}

class Aplication2 {
	public static void main(String[] args) {
		Car car = new Car("Audi", "2015");
		car.printData();
		car.printData("Audi");
		car.printData(5);
	}
}
