package models;

import javax.validation.constraints.*;

public class Animal {
	
	@Size(min = 1, max = 20, message = "Must be between 1 and 20 characters!")
	protected String name;
	
	@Positive(message = "Must be great than 0")
	protected double weight;
	
	@Positive(message = "Must be great than 0")
	protected int age;
	
	public Animal() {};
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + ", " + age + " years, " + weight + "kg, "; 
	}
	
	public static class Builder{
		
		private Animal newAnimal;
		
		private static int Count = 0;

		public Builder(){
			newAnimal = new Animal();
		}

		public Builder addName(String name){
			newAnimal.name = name;
			return this;
		}
		
		public Builder addWeight(double weight){
			newAnimal.weight = weight;
			return this;
		}
		
		public Builder addAge(int age){
			newAnimal.age = age;
			return this;
		}
		
		public Animal Build() {
			return newAnimal;
		}
	}
}
