package fitness;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CSVReaderInJavaEquipments {
	public static void main(String... args) {
		List<Equipments> equipments = readEqupimentsFromCSV("C:\\Users\\mussa\\Documents\\equipments.csv");
		// let's print all the person read from CSV file
		for (Equipments b : equipments) {
			System.out.println(b);
		}
	}

	private static List<Equipments> readEqupimentsFromCSV(String fileName) {
		List<Equipments> equipments = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		// create an instance of BufferedReader
		// using try with resource, Java 7 feature to close resources
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
			// read the first line from the text file
			String line = br.readLine();
			// loop until all lines are read
			while (line != null) {
				// use string.split to load a string array with the values from each line of   the file, using a comma as the delimiter
				String[] attributes = line.split(",");
				Equipments Equipments = createEquipment(attributes);
				// adding Equipments into ArrayList
				equipments.add(Equipments);
				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return equipments;
	}

	private static Equipments createEquipment(String[] metadata) {
		int equipmentId = Integer.parseInt(metadata[0]);
		String equipmentName = metadata[1];
		
		return new Equipments(equipmentId, equipmentName);
	}
}


