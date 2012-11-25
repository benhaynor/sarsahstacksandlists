package stacksandQueuesLab;
import java.util.*;
import java.io.IOException;
public class TheHtmlChecker {

	
	public static String pullIntoString(String filename)throws IOException{
		ReadAndStoreStrings page = new ReadAndStoreStrings(filename);
		String lines = page.readsdaFileIntoString();
		return lines;
	}
	
	public static boolean validateHTML(Scanner in, boolean debug){
		
		boolean validHTML = true;
		Stack<Tag> tags = new Stack<Tag>();
		while(in.hasNext()){
		if(in.hasNext("<.*?>")){
			Tag inTag = new Tag(in.next("<.*?>"));
			System.out.println("Reading: "+inTag);
			boolean valid = validate(inTag,tags,debug);
			if(!valid){
				validHTML = false;
				break;
			}
		}
		in.skip("[^<>]*");
		}
		if(tags.isEmpty()==false){
		validHTML = false;
		}
		return validHTML;
	}
	
	public static boolean validate(Tag tag, Stack<Tag> tags,boolean debug){
		if(tag.opening == true ){
			tags.push(tag);
			if(debug){
				System.out.println("Stack: "+tags);
			}
			return true;
		}
		else if((tag).opening == false && tags.peek().matches(tag)){
			tags.pop();
			if (debug){
				System.out.println("Stack: "+tags);
			}
			return true;
		}
		else{
			if (debug){
				System.out.println("Invalid html");
			}
			return false;
		}
	}
	
	public static void main(String [] args)throws IOException{
		
		String lines = pullIntoString("src/stacksandQueuesLab/testHtml.html");
		Scanner sc = new Scanner(lines);
		validateHTML(sc,true);
			
	}
}
