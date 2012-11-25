package stacksandQueuesLab;

import static org.junit.Assert.*;

import org.junit.Test;

public class MESTLinkedListTest {

	@Test
	public void testgetFirstOnEmpty() {
		MESTLinkedList mest = new MESTLinkedList();
		assertEquals(null,mest.getFirstData());
	}
	
	@Test
	public void testgetLastOnEmpty() {
		MESTLinkedList mest = new MESTLinkedList();
		assertEquals(null,mest.getLastData());
	}
	
	@Test
	public void testaddFirstOnEmptyList() {
		MESTLinkedList mest = new MESTLinkedList();
		mest.addFirst(new String("Hello World"));
		assertEquals("Hello World",mest.getFirstData());
		
	}
	
	@Test
	public void testAccessedByGetZeroGetFirstGetLast() {
		MESTLinkedList mest = new MESTLinkedList(new String("Hello World"));
		assertEquals("Hello World",mest.getFirstData());
		assertEquals("Hello World",mest.getLastData());
		assertEquals("Hello World",mest.get(0));
	}
	
	@Test
	public void testgetFirst() {
		MESTLinkedList mest = new MESTLinkedList();
		mest.addFirst(new String("Hello World"));
		assertEquals("Hello World",mest.getFirstData());
		mest.addFirst(new String("Hello Mest"));
		assertEquals("Hello Mest",mest.getFirstData());
	}
	
	@Test
	public void testAdd() {
		MESTLinkedList mest = new MESTLinkedList();
		mest.addLast(new String("Hello World"));
		mest.add(0,new String("Hello Mest"));
		assertEquals("Hello Mest",mest.getFirstData());
		assertEquals("Hello World",mest.get(1));
	}
	
	@Test
	public void testgetLast() {
		MESTLinkedList mest = new MESTLinkedList();
		mest.addLast(new String("Hello World"));
		assertEquals("Hello World",mest.getLastData());
		mest.addLast(new String("Hello Mest"));
		assertEquals("Hello Mest",mest.getLastData());
	}
	
	@Test
	public void testRemoveLast() {
		MESTLinkedList mest = new MESTLinkedList();
		mest.addFirst(new String("Hello World"));
		mest.addFirst(new String("Hello Mest"));
		mest.addFirst(new String("Hello Everybody"));
		assertEquals("Hello World",mest.removeLast());
		assertEquals("Hello Mest",mest.removeLast());
		assertEquals("Hello Everybody",mest.removeLast());
	}
	
	@Test
	public void testRemoveFirst() {
		MESTLinkedList mest = new MESTLinkedList();
		mest.addFirst(new String("Hello World"));
		mest.addFirst(new String("Hello Mest"));
		mest.addFirst(new String("Hello Everybody"));
		assertEquals("Hello Everybody",mest.removeFirst());
		assertEquals("Hello Mest",mest.removeFirst());
		assertEquals("Hello World",mest.removeFirst());
	}
	
	@Test
	public void testRemove() {
		MESTLinkedList mest = new MESTLinkedList();
		mest.addFirst(new String("Hello World"));
		mest.addFirst(new String("Hello Mest"));
		mest.addFirst(new String("Hello Everybody"));
		assertEquals("Hello Mest",mest.remove(1));
		assertEquals("Hello World",mest.remove(1));
		assertEquals("Hello Everybody",mest.remove(0));
	}

}
