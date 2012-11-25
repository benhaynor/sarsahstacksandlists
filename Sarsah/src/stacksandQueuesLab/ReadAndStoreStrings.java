package stacksandQueuesLab;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class ReadAndStoreStrings {
	
	private String path;
	
	//constructor
	public ReadAndStoreStrings(String path){
		this.path = path;
	}
	
	public String[] readsdaFileIntoStringArray()throws IOException{
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		String [] textData = new String[readLines()];
		
		for(int i=0; i<readLines();i++){
			textData[i] = textReader.readLine();
		}
		
		textReader.close();
		return textData;
	}
	
	public String readsdaFileIntoString()throws IOException{
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		String textData = "";
		for(int i=0;i<readLines();i++){
			textData += textReader.readLine();
		}
		textReader.close();
		return textData;
		
	}
	
	private int readLines()throws IOException{
		String aLine;
		int numberOfLines = 0;
		FileReader file_to_read = new FileReader(path);
		BufferedReader bf = new BufferedReader(file_to_read);
		
		while((aLine = bf.readLine()) != null){
			numberOfLines++;
		}
		bf.close();
		return numberOfLines;
		
		
	}
	

}
