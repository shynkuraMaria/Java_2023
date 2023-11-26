package models;

/**
 * class "Cat" with fields: color, eyesColor, CATegory.
 * @author User
 * @version 1.0
 */
public class Cat extends Animal{
	
	/** Wool color field */
	protected String color;
	
	/** Cat category field */
	protected Categories CATegory;
	
	/**
	 * Overridden function of obtaining the hash code
	 * @return returns the numeric value of the hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 33;
		int result = super.hashCode();
		result = prime * result + CATegory.ordinal();
		result = prime * result + color.length();
		return result;
		
	}
	
	/**
	 * Overridden function of comparison an instance of
	 *  the class "Cat" and an instance of the class "Object"
	 * @return returns the boolean value of the comparison
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.hashCode() != obj.hashCode())
				return false;
		if (this.getClass() != obj.getClass())
			return false;
		Cat temp = (Cat)obj;
		if(this.name != temp.name || this.weight != temp.weight || this.age != temp.age ||
		   this.CATegory != temp.CATegory || this.color != temp.color)
			return false;		
 		return true;
	}
	
	/**
	 *  Overriden function of obtaining a string representation of
	 *  an instance of a class "Cat"
	 *  @return returns the string representation
	 */
	@Override
	public String toString() {
		return super.toString() + " Category: " + color + " " + CATegory + ", "; 
	}
	
	/**
	 * Class "Builder" with fields: newCat, Count
	 * @author User
	 * @version 1.0
	 */
	public static class Builder{
		
		/** Cat field */
		private Cat newCat;
		/** Count of cats field */
		private static int Count = 0;
		
		/** 
	     * Constructor - creating a new object
	     * @see Builder#Builder()
	     */
		public Builder(){
			newCat = new Cat();
		}
		
		/**
		 * Function name designition
		 * @param name - name of a cat
		 * @return returns current object
		 */
		public Builder addName(String name){
			newCat.name = name;
			return this;
		}
		
		/**
		 * Function weight designition
		 * @param weight - weight of a cat
		 * @return returns current object
		 */
		public Builder addWeight(double weight){
			newCat.weight = weight;
			return this;
		}
		
		/**
		 * Function age designition
		 * @param age - age of a cat
		 * @return returns current object
		 */
		public Builder addAge(int age){
			newCat.age = age;
			return this;
		}
		
		/**
		 * Function color designition
		 * @param color - wool color of a cat
		 * @return returns current object
		 */
		public Builder addColor(String color){
			newCat.color = color;
			return this;
		}
		
		/**
		 * Function CATegory designition
		 * @param CATegory - category of a cat
		 * @return returns current object
		 */
		public Builder addCategory(Categories CATegory){
			newCat.CATegory = CATegory;
			return this;
		}
		
		/**
		 * Function of creating an object of class "Cat"
		 * @return returns new object of class "Cat"
		 */
		public Cat Build() {
			newCat.id = ++Count;
			return newCat;
		}
	}
	
}
