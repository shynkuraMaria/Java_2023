package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import models.*; 
import comparators.*;

public class Program {
	
	static List<Animal> sortByCompareTo(List<Animal> animals){
		animals.sort(Animal::compareTo);
		return animals;
	}
	
	static List<Animal> sortByAge(List<Animal> animals){
		animals.sort(new AnimalAgeComparator());
		return animals;
	}
	
	static List<Animal> sortByAgeAndName(List<Animal> animals){
		Comparator<Animal> tcomp = new AnimalAgeComparator().thenComparing(new AnimalNameComparator());
		animals.sort(tcomp);
		return animals;
	}
	
	public static void main(String[] args) {
		
		List<Animal> Zoo = Arrays.asList(
			new Animal(5, 11.2, "Bonny"),
			new Animal(3, 9.8, "Fluffy"),
			new Animal(11, 45.5, "Endy"),
			new Animal(5, 11.2, "Luna"),
			new Animal(1, 5.6, "Jasper")
		);
		System.out.println("Sorted list of animals:");
		sortByCompareTo(Zoo).forEach(a -> System.out.println("\t" + a));
		
		List<Animal> Flock = Arrays.asList(
			new Cat(3, 9.6, "Charlie", "White", Categories.semilongHaired),
			new Cat(2, 12.2, "Loki", "Black", Categories.shortHaired),
			new Cat(2, 7.4, "Shadow", "Brown", Categories.longHaired),
			new Cat(3, 7.2, "Pepper", "Gray", Categories.siamoorientalshortHaired),
			new Cat(1, 5.6, "Boo", "Black", Categories.unknown)
		);
		System.out.println("Sorted list of cats:");
		sortByAge(Flock).forEach(a -> System.out.println("\t" + a));
		
		List<Animal> Enclosure = Arrays.asList(
			new Tiger(10, 179, "Sunny", "Golden", Categories.semilongHaired, 0),
			new Tiger(31, 285, "Baby", "Orange", Categories.longHaired, 6),
			new Tiger(19, 212, "Willow", "White", Categories.semilongHaired, 0),
			new Tiger(8, 184, "Princess", "Blue", Categories.shortHaired, 2),
			new Tiger(19, 240, "Ash", "Black", Categories.longHaired, 1)
		);
		System.out.println("Sorted list of tigers:");
		sortByAgeAndName(Enclosure).forEach(a -> System.out.println("\t" + a));
		
		List<Animal> Animals = new ArrayList<Animal>();
		Animals.addAll(Zoo);
		Animals.addAll(Flock);
		Animals.addAll(Enclosure);
		System.out.println("List of all animals:");
		Animals.forEach(a -> System.out.println("\t" + a));
		
		System.out.println("\n\n1)Sorted list of all animals:");
		Animals.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n\n2)List of animals whose names start with \'B\':");
		Animals.stream().filter((a) -> a.getName().startsWith("B")).forEach(System.out::println);
		
		int countOfTigers = (int)Animals.stream().filter( a -> a instanceof Tiger).count();
		System.out.println("\n\n3)Count of tigers in list : " + countOfTigers);
	}
}
		
