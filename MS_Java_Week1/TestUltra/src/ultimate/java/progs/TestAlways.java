package ultimate.java.progs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestAlways {

	public static void main(String[] args) throws IOException {

		List<UserCSVData> userDataList = new ArrayList<UserCSVData>();
		UserCSVData csvData = null;
		BufferedReader br = new BufferedReader(new FileReader(new File("D://username.csv")));
		String line;
		int count =0;
		while ((line = br.readLine()) != null) {

		    String[] entries = line.split(";");
		    if( !entries[0].equals("") &&  count !=0) {
		    	csvData = new UserCSVData(entries[0].trim(), Integer.valueOf(entries[1].trim()), entries[2].trim(), entries[3].trim());
		    	userDataList.add(csvData);
		    	System.out.println(count);
		    }
		    count++;
		}
		
		System.out.println(userDataList);
	}

}
