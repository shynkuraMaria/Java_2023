package models;

public class Cat extends Animal{
		
	private static int count = 1;
	
	protected String color;
	protected Categories CATegory;
		
	public Cat() {
		super();
		this.id = count++;
	};
	public Cat(String name, int age, double weight, String color, Categories CATegory) {
		super(name, age, weight);
		this.CATegory = CATegory;
		this.color = color;
		this.id = count++;
	}
		
	public String getColor() {
		return color;
	}
	public Categories getCategory() {
		return CATegory;
	}
		
	public void setCategory(Categories CATegory) {
		this.CATegory = CATegory;
	}
	public void setColor(String color) {
			this.color = color;
	}
		
	@Override
	public String toString() {
		return super.toString() + " Category: " + color + " " + CATegory + ", "; 
	}
}