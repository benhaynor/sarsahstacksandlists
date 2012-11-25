package stacksandQueuesLab;

public class MESTLinkedList <E>{
	//Instance variables
	private MNode<E> first;
	private MNode<E> last;
	private int size;
	
	//constructor
	public MESTLinkedList(E e){
		first = new MNode<E>(e);
		size = 1;
	}
	
	//constructor
	public MESTLinkedList(){
		first = null;
		size = 0;
	}
	
	//getter for first
	public MNode<E> getFirst() {
		return first;
	}
	
	//setter for first
	public void setFirst(MNode<E> first) {
		this.first = first;
	}
	
	//getter for last
	public MNode<E> getLast() {
		return last;
	}
	
	//setter for last
	public void setLast(MNode<E> last) {
		this.last = last;
	}
	
	//size of list
	public int getSize() {
		return size;
	}
	
	//setter for size
	public void setSize(int size) {
		this.size = size;
	}
	
	//returns a node at a particular index
	private MNode<E> getNode(int index){
		MNode<E> cur = first;
		for (int i = 0; i < index; i ++){
			cur = cur.getNext();
		}
		return cur;
	}
	
	//returns object at a particular index
	public E get(int index){
		if(this.first == null){
			return null;
		}
		MNode<E> dummy = getNode(index);
		return dummy.getData();
	}
	
	//returns first object in a list
	public E getFirstData(){
		return get(0);
	}
	
	//returns last object in a list
	public E getLastData(){
		return get(size-1);
	}
	
	//adds an object at a particular index
	public void add(int index, E e){
		if(index > this.size){
			System.out.println("Can't add to index greater than size");
		}
		else if(index == 0){
			addFirst(e);
		}
		else{
		MNode<E> pre = getNode(index-1);
		MNode<E> post = getNode(index);
		MNode<E> toInsert = new MNode(e);
		pre.setNext(toInsert);
		toInsert.setNext(post);
		size ++;
		last = getNode(size-1);
		}
	}
	
	//adds an object to the beginning of a list
	public void addFirst(E e){
		if(this.first == null){
			first = new MNode<E>(e);
			size = 1;
		}
		else{
		MNode<E> first = getNode(0);
		MNode<E> newFirst = new MNode<E>(e);
		newFirst.setNext(first);
		this.first = newFirst;
		size++;
		}
	}
	
	//adds an object to the end of a list
	public void addLast(E e){
		if(this.first == null){
			first = new MNode<E>(e);
			size = 1;
		}
		MNode<E> latest = getNode(size -1);
		latest.setNext(new MNode<E>(e));
		size ++;
		this.last = getNode(size-1);
		//Adds an item to the end of the list
	}
	
	//prints the list
	public void print(){
		MNode<E> cur = first;
		for (int i = 0; i < size; i ++){
			System.out.println(cur.getData());
			cur = cur.getNext();
		}
	}
	
	//removes object at an index
	public E remove(int index) {
        MNode<E> previous = getNode(index - 1);
        MNode<E> removed = getNode(index);
        MNode<E> theNext = getNode(index + 1);
        previous.setNext(theNext);
        size--;
        return removed.getData();
	}
	
	//removes the first object
	public E removeFirst(){
		MNode<E> removable = getNode(0);
		first = first.getNext();
		size--;
		return removable.getData();
		
		
	}
	
	//removes the last object
	public E removeLast() {
        MNode<E> theLast = getNode(size - 1);
        remove(size - 1);
        return theLast.getData();
	}
	
	/*
	 * TODO: Implement the add methods 
	 * void add(E e, index i); 
	 * void addFirst(E e);
	 * void addLast(E e); (Do in class)
	 * TODO: Implement the get methods
	 * E get(index i); (Do in class)
	 * E getFirst; (Do in class)
	 * E getLast; (Do in class)
	 * TODO: Implement the remove methods
	 * E remove(index i);
	 * E removeFirst();
	 * E removeLast(); (Do in class)
	 * TODO:
	 * Implement the helper methods
	 * private void addOnly(E); Adds the only
	 * private void removeOnly(E);  Removes the last node
	 * private Node<E> getNode(index i); //Returns the node at index i;
	 * 
	 */
	
}
