package postgreSQL;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import models.*;
public class QueryTool {
	
	private static final String create = "CREATE TABLE IF NOT EXISTS %s(id serial, %s, PRIMARY KEY(id));";
	private static final String drop = "DROP TABLE IF EXISTS %s";
	
	private static final String animal = "animal";
	private static final String cat = "cat";
	private static final String tiger = "tiger";
	
	private static final String animal_create_attribute = "name varchar(20), age int4, weight real"; 
	private static final String cat_create_attribute = animal_create_attribute + ", color varchar(20), category varchar(20)";
	private static final String tiger_create_attribute = cat_create_attribute + ", numOfEmployee int4";
	
	private static void Execute(String query) throws SQLException {
		Connection connection = Connector.Connect();
		if (connection != null) {
		Statement statement = connection.createStatement();
		statement.executeUpdate(query);
		Connector.Disconnect(connection);
		}
	}
	
	public static void createAnimal() throws SQLException {
		Execute(String.format(create, animal, animal_create_attribute));		
	}
	public static void createCat() throws SQLException {
		Execute(String.format(create , cat, cat_create_attribute));
	}
	public static void createTiger() throws SQLException {
		Execute(String.format(create, tiger, tiger_create_attribute));
	}
	
	public static void dropAnimal() throws SQLException {
		Execute(String.format(drop, animal));		
	}
	public static void dropCat() throws SQLException {
		Execute(String.format(drop, cat));
	}
	public static void dropTiger() throws SQLException {
		Execute(String.format(drop, tiger));
	}	

}
