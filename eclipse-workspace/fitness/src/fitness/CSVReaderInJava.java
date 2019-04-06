package fitness;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CSVReaderInJava {
	public static void main(String... args) {
		List<Members> members = readMembersFromCSV("C:\\Users\\mussa\\Documents\\members.csv");
		// let's print all the person read from CSV file
		for (Members b : members) {
			System.out.println(b);
		}
	}

	private static List<Members> readMembersFromCSV(String fileName) {
		List<Members> members = new ArrayList<>();
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
				Members Members = createMember(attributes);
				// adding Members into ArrayList
				members.add(Members);
				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return members;
	}

	private static Members createMember(String[] metadata) {
		int membersId = Integer.parseInt(metadata[0]);
		String membersName = metadata[1];
		String membersAddress = metadata[2];
		String membersPhone = metadata[3];
		// create and return Members of this metadata
		return new Members(membersId, membersName, membersAddress, membersPhone);
	}
}


