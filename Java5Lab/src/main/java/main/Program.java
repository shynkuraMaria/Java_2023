package main;

import java.sql.SQLException;
import postgreSQL.*;
import models.*;

public class Program {
	
	public static String pause() {
		System.out.println("Press Any Key To Continue...");
		return new java.util.Scanner(System.in).nextLine();
	}
	
	public static void main(String[] argv) {
		try {	
			QueryTool.dropAnimal();
			QueryTool.dropCat();
			QueryTool.dropTiger();
			
			pause();
			
			QueryTool.createAnimal();
			QueryTool.createCat();
			QueryTool.createTiger();
		}	
		catch(SQLException e) {
			System.out.println("Error: " + e.getMessage());
			return;
		}

	}
}