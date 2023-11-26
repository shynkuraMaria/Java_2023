package main;

import models.*;

public class Program {

	public static void main(String[] args) {
		Animal a1 = new Animal.Builder().addAge(5).addWeight(31.1).addName("Fluffy").Build();
		Animal a2 = new Animal.Builder().addAge(7).addWeight(8.9).addName("Pepper").Build();
		System.out.println("There are animals:");
		System.out.println(a1 + "\n" + a2);
		System.out.println("\tThey are equals:" + a1.equals(a2));
		
		Animal c1 = new Cat.Builder().addAge(3).addWeight(12.2).addName("Nero").
				addColor("White").addCategory(Categories.longHaired).Build();
		Animal c2 = c1;
		System.out.println("\nThere are cats:");
		System.out.println(c1 + "\n" + c2);
		System.out.println("\tThey are equals:" + c1.equals(c2));
		
		Animal t1 = new Tiger.Builder().addAge(8).addWeight(121.2).addName("Princess")
				.addColor("Golden").addCategory(Categories.shortHaired).addEatenEmployees(3).Build();
		Animal t2 = new Tiger.Builder().addAge(8).addWeight(121.2).addName("Princess")
				.addColor("Golden").addCategory(Categories.shortHaired).addEatenEmployees(3).Build();
		System.out.println("\nThere are tigers:");
		System.out.println(t1 + "\n" + t2);
		System.out.println("\tThey are equals:" + t1.equals(t2));
	}

}
