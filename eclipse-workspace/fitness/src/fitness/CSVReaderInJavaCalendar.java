package fitness;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class CSVReaderInJavaCalendar {
	public static void main(String... args) {
		List<Calendar> calendar = readCalendarFromCSV("C:\\Users\\mussa\\Documents\\calendar.csv");
		// let's print all the person read from CSV file
		for (Calendar b : calendar) {
			System.out.println(b);
		}
	}

	private static List<Calendar> readCalendarFromCSV(String fileName) {
		List<Calendar> calendar = new ArrayList<>();
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
				Calendar Calendar = createCalendar(attributes);
				// adding Calendar into ArrayList
				calendar.add(Calendar);
				// read next line before looping
				// if end of file reached, line would be null
				line = br.readLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		return calendar;
	}

	private static Calendar createCalendar(String[] metadata) {

		String calendarId = metadata[0];
		int memberId = Integer.parseInt(metadata[1]);
		int trainerId = Integer.parseInt(metadata[2]);
		int equipmentId = Integer.parseInt(metadata[3]);
		// create and return Calendar of this metadata
		return new Calendar(calendarId, memberId, trainerId, equipmentId);
	}
}


