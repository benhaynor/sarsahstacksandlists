package stacksandQueuesLab;

public class MNode<E>{

	private E data;
	private MNode<E> next;
	
	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public MNode(E data){
		this.data = data;
		next = null;
	}
	
	public void setNext(MNode<E> next){
		this.next = next;
	}
	
	public MNode<E> getNext(){
		return next;
	}
	
	public void print(){
		System.out.println(data);
		if (next != null){
			next.print();
		}
	}
	
	public static void main(String[] args){
		MNode<String> first
			= new MNode<String>("susannah");
		first.setNext(new MNode<String>("Osborn"));
		first.getNext().setNext(new MNode<String>("Linda"));
		first.getNext().getNext()
			.setNext(new MNode<String>("Adelaide"));
		first.print();
	}
	//Suppose	Suzaanah is an MNode
	//How do I get access to Osborn?
	//public static 
}
