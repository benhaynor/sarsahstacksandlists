package stacksandQueuesLab;
import java.util.Stack;
import java.util.LinkedList;
public class HelloStacksAndQueues {
	
	public static void main(String [] args){
		
		Stack<String> plate = new Stack<String>();
		plate.push("tastypancake");
		plate.push("mypancake");
		plate.push("thispancake");
		
		System.out.println(plate);
		plate.pop();
		
		System.out.println(plate.peek());
		System.out.println(plate.pop());
		System.out.println(plate);
		
		plate.pop();
		System.out.println(plate.empty());
		
		LinkedList<String> wakyeq = new LinkedList<String>();
		
		wakyeq.offer("Wakye and shito");
		wakyeq.offer("Wakye and gari");
		wakyeq.offer("Wakye with wele");
		
		System.out.println(wakyeq.remove());
		System.out.println(wakyeq.remove());
		
		System.out.println(wakyeq.isEmpty());
	}

}
