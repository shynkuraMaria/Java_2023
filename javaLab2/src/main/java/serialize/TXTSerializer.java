package serialize;

import models.Animal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TXTSerializer implements Serializer<Animal> {

	@Override
	public void Serialize(Animal obj, File file) throws IOException {
		try(FileWriter fw = new FileWriter(file)){
			String str = "Name: " + ((models.Animal) obj).getName() + " Age: " + ((models.Animal) obj).getAge() + " Weight: " + ((models.Animal) obj).getWeight();
			fw.write(str);
		}
		catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
	}

	@Override
	public Animal Deserialize(File file) throws IOException {
		try(FileReader fr = new FileReader(file)){
			String str = "";
			int c;
			while((c = fr.read()) != -1)
				str += (char)c;
			String[] values = str.split(" ");
			return  new Animal(Integer.parseInt(values[3]), Double.parseDouble(values[5]), values[1]);
		}
		catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
	}

}
