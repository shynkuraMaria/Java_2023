package models;

import javax.validation.constraints.*;

import myValidation.CategoryAttribute;
import myValidation.ColorAttribute;

public class Cat extends Animal{
	
	@ColorAttribute(enumClazz = Color.class, message = "Unknown color")
	protected String color;
	
	@CategoryAttribute(enumClazz = Categories.class, message = "Unknown category")
	protected String CATegory;
	
	@Override
	public String toString() {
		return super.toString() + " Category: " + color + " " + CATegory + ", "; 
	}

	public static class Builder{

		private Cat newCat;
		
		public Builder(){
			newCat = new Cat();
		}
		
		public Builder addName(String name){
			newCat.name = name;
			return this;
		}

		public Builder addWeight(double weight){
			newCat.weight = weight;
			return this;
		}

		public Builder addAge(int age){
			newCat.age = age;
			return this;
		}
		

		public Builder addColor(String color){
			newCat.color = color;
			return this;
		}
		

		public Builder addCategory(String CATegory){
			newCat.CATegory = CATegory;
			return this;
		}
		
		public Cat Build() {
			return newCat;
		}
	}
	
}
