package models;


/**
 * class "Tiger" with fields: numOfEatenEmployees.
 * @author User
 * @version 1.0
 */
public class Tiger extends Cat {
	
		/** Field of the number of eaten employees*/
		private int numOfEatenEmployees;
		
		/**
		 * Overridden function of obtaining the hash code
		 * @return returns the numeric value of the hash code
		 */
		@Override
		public int hashCode() {
			final int prime = 41;
			int result = super.hashCode();
			result = prime * result + this.numOfEatenEmployees;
			return result;	
		}
		
		/**
		 * Overridden function of comparison an instance of 
		 * the class "Tiger" and an instance of the class "Object"
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
			Tiger temp = (Tiger)obj;
			if(this.name != temp.name || this.weight != temp.weight || this.age != temp.age ||
			   this.CATegory != temp.CATegory || this.color != temp.color || 
			   this.numOfEatenEmployees != temp.numOfEatenEmployees)
				return false;		
	 		return true;
		}
		
		/**
		 *  Overriden function of obtaining a string representation of
		 *  an instance of a class "Tiger"
		 *  @return returns the string representation
		 */
		@Override
		public String toString() {
			return super.toString() + " NumOfEatenEmployees: "+ numOfEatenEmployees; 
		}
		
		/**
		 * Class "Builder" with fields: newTiger, Count
		 * @author User
		 * @version 1.0
		 */
		public static class Builder{
			private Tiger newTiger;
			private static int Count = 0;
		
			/** 
		     * Constructor - creating a new object
		     * @see Builder#Builder()
		     */
			public Builder(){
				newTiger = new Tiger();
			}
			
			/**
			 * Function name designition
			 * @param name - name of a tiger
			 * @return returns current object
			 */
			public Builder addName(String name){
				newTiger.name = name;
				return this;
			}
			
			/**
			 * Function weight designition
			 * @param weight - weight of a tiger
			 * @return returns current object
			 */
			public Builder addWeight(double weight){
				newTiger.weight = weight;
				return this;
			}
			
			/**
			 * Function age designition
			 * @param age - age of atiger
			 * @return returns current object
			 */
			public Builder addAge(int age){
				newTiger.age = age;
				return this;
			}
			
			/**
			 * Function color designition
			 * @param color - wool color of a tiger
			 * @return returns current object
			 */
			public Builder addColor(String color){
				newTiger.color = color;
				return this;
			}
			
			/**
			 * Function CATegory designition
			 * @param CATegory - category of a tiger
			 * @return returns current object
			 */
			public Builder addCategory(Categories CATegory){
				newTiger.CATegory = CATegory;
				return this;
			}
			
			/**
			 * Function numOfEatenEmployees designition
			 * @param eatenEmployee - number of eaten employees
			 * @return returns new object of class "Tiger"
			 */
			public Builder addEatenEmployees(int eatenEmployee){
				newTiger.numOfEatenEmployees = eatenEmployee;
				return this;
			}
			
			/**
			 * Function of creating an object of class "Tiger"
			 * @return returns new object of class "Tiger"
			 */
			public Tiger Build() {
				newTiger.id = ++Count;
				return newTiger;
			}
		}
}
