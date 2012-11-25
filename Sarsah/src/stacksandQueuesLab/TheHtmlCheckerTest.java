package stacksandQueuesLab;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class TheHtmlCheckerTest {

	@Test
	public void testMatchingTags() {
		//false says do not print debugging information.
		assertTrue(TheHtmlChecker.validateHTML(new Scanner("<html> </html>"),false));
	}

	@Test
	public void testNonMatchingTags() {
		//false says do not print debugging information.
		assertFalse(TheHtmlChecker.validateHTML(new Scanner("<html> </hml>"),false));
	}
	
	@Test
	public void testNestedMatchingTags() {
		//false says do not print debugging information.
		assertTrue(TheHtmlChecker.validateHTML(new Scanner("<html> <div> <div> </div> </div> </html>"),false));
	}
	
	@Test
	public void testExtraOpeningTags() {
		//false says do not print debugging information.
		assertFalse(TheHtmlChecker.validateHTML(new Scanner("<html> <div> </html>"),false));
	}

	@Test
	public void testNoClosing() {
		//false says do not print debugging information.
		assertFalse(TheHtmlChecker.validateHTML(new Scanner("<html> <div>"),false));
	}
	
	@Test
	public void testExtraClosingTags() {
		//false says do not print debugging information.
		assertFalse(TheHtmlChecker.validateHTML(new Scanner("<html> </div> </html>"),false));
	}
	
	@Test
	public void testContentBetweenTags() {
		//false says do not print debugging information.
		assertTrue(TheHtmlChecker.validateHTML(new Scanner("<html> <div> content </div> </html>"),false));
	}

}
