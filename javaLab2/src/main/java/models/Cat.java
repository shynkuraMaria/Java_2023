package models;


public class Cat extends Animal{
		
		protected String color;
		protected Categories CATegory;
		
		public Cat() {
			super();
		};
		public Cat(int age, double weight, String name, String color, Categories CATegory) {
			super(age, weight, name);
			this.CATegory = CATegory;
			this.color = color;
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