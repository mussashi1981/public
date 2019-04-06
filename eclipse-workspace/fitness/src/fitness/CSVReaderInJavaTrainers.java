package fitness;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CSVReaderInJavaTrainers {
	public static void main(String... args) {
		List<Trainers> trainers = readTrainersFromCSV("C:\\Users\\mussa\\Documents\\trainers.csv");
		// let's print all the person read from CSV file
		for (Trainers b : trainers) {
			System.out.println(b);
		}
	}

	private static List<Trainers> readTrainersFromCSV(String fileName) {
		List<Trainers> trainers = new ArrayList<>();
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
				Trainers Trainers = createTrainer(attributes);
				// adding Trainers into ArrayList
				trainers.add(Trainers);
				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return trainers;
	}

	private static Trainers createTrainer(String[] metadata) {
		int trainersId = Integer.parseInt(metadata[0]);
		String trainersName = metadata[1];
		
		return new Trainers(trainersId, trainersName);
	}
}


