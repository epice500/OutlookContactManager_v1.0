import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
	
	public List<String[]> readAll(Reader reader) throws Exception {
	    CSVReader csvReader = new CSVReader(reader);
	    List<String[]> list = new ArrayList<>();
	    list = csvReader.readAll();
	    reader.close();
	    csvReader.close();
	    return list;
	}
	
	public List<String[]> readAll(Reader reader) throws Exception {
	    CSVReader csvReader = new CSVReader(reader);
	    List<String[]> list = new ArrayList<>();
	    list = csvReader.readAll();
	    reader.close();
	    csvReader.close();
	    return list;
	}
	
	public List<String[]> oneByOne(Reader reader) throws Exception {
	    List<String[]> list = new ArrayList<>();
	    CSVReader csvReader = new CSVReader(reader);
	    String[] line;
	    while ((line = csvReader.readNext()) != null) {
	        list.add(line);
	    }
	    reader.close();
	    csvReader.close();
	    return list;
	}
	
	/*
	public static Object readOutlookFile() {
		String csvFile = "src/Outlook_Backup1.CSV"; //You may need to edit this to specify the path to where you stored the dataset on your computer.
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        Object[][] wordSet = new Object[786][4]; //Create an array of Objects (since the wordlist contains strings, integers and doubles)
        int counter = 0;
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                Object[] words = line.split(cvsSplitBy);
                System.out.println(words[0] + " [Activity = " + words[1] + " , Potency =" + words[2] + ", Evaluation =" + words[3] + "]");
                wordSet[counter] = words;
                counter = counter+1;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(wordSet.length); //print out the length of the wordlist (should be 786).
        System.out.println(wordSet[0][1]); //print out the value in row 0, column 1.
        double testVal = Double.parseDouble((String) wordSet[0][1]);
        System.out.println(testVal);
		return testVal; //temp val
	}
	*/
}
