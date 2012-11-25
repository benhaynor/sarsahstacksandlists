package stacksandQueuesLab;

import static org.junit.Assert.*;

import org.junit.Test;

public class TagTest {

	@Test
	public void testTagOpeing() {
		Tag tag = new Tag("<html>");
		assertEquals("html", tag.type);
		assertTrue(tag.opening);
		
	}
	
	@Test
	public void testTagClosing() {
		Tag tag = new Tag("</html>");
		assertEquals("html", tag.type);
		assertFalse(tag.opening);
	}

	@Test
	public void testMatches() {
		Tag tag1 = new Tag("<html>");
		Tag tag2 = new Tag("</html>");
		assertTrue(tag1.matches(tag2));
	}
	
	@Test
	public void testMatchesIgnoreCase() {
		Tag tag1 = new Tag("<html>");
		Tag tag2 = new Tag("</HTML>");
		assertTrue(tag1.matches(tag2));
	}
	
	@Test
	public void openingTagsDoNotMatch() {
		Tag tag1 = new Tag("<html>");
		Tag tag2 = new Tag("<html>");
		assertFalse(tag1.matches(tag2));
	}
	
	@Test
	public void closingTagsDoNotMatch() {
		Tag tag1 = new Tag("</html>");
		Tag tag2 = new Tag("</html>");
		assertFalse(tag1.matches(tag2));
	}
	
	@Test
	public void mismatchedTypes() {
		Tag tag1 = new Tag("<html>");
		Tag tag2 = new Tag("</div>");
		assertFalse(tag1.matches(tag2));
	}

}
