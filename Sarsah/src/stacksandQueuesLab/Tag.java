package stacksandQueuesLab;
//a class for tags
public class Tag {
	
	//instance variables
	public boolean opening;
	public String type;
	
	//Tag Constructor
	public Tag(String type){
		if(type.charAt(1)== '/'){
			this.opening = false;
			this.type = type.substring(2,type.length()-1);
		}else{
			this.opening = true;
			this.type = type.substring(1,type.length()-1);
		}
	}
	
	//checks if two tags match
	public boolean matches(Tag other){
		if(this.type.equalsIgnoreCase(other.type) && this.opening != other.opening){
			return true;
		}
		return false;
	}
	
	public String toString(){
		if(this.opening == true){
			
			return String.format("<%s>", type);
		}
		else
			return String.format("</%s>", type);
	}

}
