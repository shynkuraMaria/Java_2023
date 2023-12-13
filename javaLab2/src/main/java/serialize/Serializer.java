package serialize;

import models.*;
import java.io.IOException;
import java.io.File;

public interface Serializer<T extends Animal> {
	void serialize(T obj, File file) throws IOException;
	T deserialize(File file) throws IOException;
}
