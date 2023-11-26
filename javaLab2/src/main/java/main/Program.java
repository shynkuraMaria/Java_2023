package main;

import models.*;
import serialize.*;

import java.io.IOException;
import java.io.File;

public class Program {

	public static void main(String[] args) {
		
		String myDir = new File("").getAbsolutePath() + "\\src\\main\\java\\main";
		
		Serializer<Cat> mySerJSON = new JSONSerializer<Cat>(Cat.class);
		Cat CatJSON = new Cat(2, 7.9, "Fluffy", "White", Categories.longHaired);
		try {
			File json = new File(myDir,"Cat.json");
			mySerJSON.Serialize(CatJSON, json);
			CatJSON = mySerJSON.Deserialize(json);
			System.out.println(CatJSON);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Serializer<Tiger> mySerXML = new XMLSerializer<Tiger>(Tiger.class);
		Tiger TigerXML = new Tiger(5, 80.1, "Kitty", "Orange", Categories.shortHaired, 2);
		try {
			File xml = new File(myDir,"Tiger.xml");
			mySerXML.Serialize(TigerXML, xml);
			TigerXML = mySerXML.Deserialize(xml);
			System.out.println(TigerXML);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Serializer<Animal> mySerTxt = new TXTSerializer();
		Animal AnimalTXT = new Animal(5, 14.2, "Yummy");
		try {
			File txt = new File(myDir,"Animal.txt");
			mySerTxt.Serialize(AnimalTXT, txt);
			AnimalTXT = mySerTxt.Deserialize(txt);
			System.out.println(AnimalTXT);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
