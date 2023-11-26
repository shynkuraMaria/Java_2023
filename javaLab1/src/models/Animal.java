package models;

/**
 * class "Animal" with fields: id, name, weight, age.
 * @author User
 * @version 1.0
 */
public class Animal {
	
	/** Unique identifier field */
	protected int id;
	
	/** Name field */
	protected String name;
	
	/** Weight field */
	protected double weight;
	
	/** Age field */
	protected int age;
	
	
	/**
	 * Overridden function of obtaining the hash code
	 * @return returns the numeric value of the hash code
	 */
	@Override
	public int hashCode() {
		final int prime = 27;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (int)weight;
		result = prime * result + name.length();
		return result;
	}
	
	/**
	 * Overridden function of comparison an instance of
	 * the class "Animal" and an instance of the class "Object"
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
		Animal temp = (Animal)obj;
		if(this.name != temp.name || this.weight != temp.weight || this.age != temp.age )
			return false;		
 		return true;
	}
	
	/**
	 *  Overriden function of obtaining a string representation of
	 *  an instance of a class "Animal"
	 *  @return returns the string representation
	 */
	@Override
	public String toString() {
		return name + ", " + age + " years, " + weight + "kg, "; 
	}
	
	/**
	 * Class "Builder" with fields: newAnimal, Count
	 * @author User
	 * @version 1.0
	 */
	public static class Builder{
		
		/** Animal field */
		private Animal newAnimal;
		/** Count of animals field */
		private static int Count = 0;
		
		/** 
	     * Constructor - creating a new object
	     * @see Builder#Builder()
	     */
		public Builder(){
			newAnimal = new Animal();
		}
		
		/**
		 * Function name designition
		 * @param name - name of a animal
		 * @return returns current object
		 */
		public Builder addName(String name){
			newAnimal.name = name;
			return this;
		}
		
		/**
		 * Function weight designition
		 * @param weight - weight of a animal
		 * @return returns current object
		 */
		public Builder addWeight(double weight){
			newAnimal.weight = weight;
			return this;
		}
		
		/**
		 * Function age designition
		 * @param age - age of a animal
		 * @return returns current object
		 */
		public Builder addAge(int age){
			newAnimal.age = age;
			return this;
		}
		
		/**
		 * Function of creating an object of class "Animal"
		 * @return returns new object of class "Animal"
		 */
		public Animal Build() {
			newAnimal.id = ++Count;
			return newAnimal;
		}
	}
}
