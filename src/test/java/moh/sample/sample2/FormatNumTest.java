package moh.sample.sample2;

import junit.framework.TestCase;

public class FormatNumTest extends TestCase {

	public void testFormatNum() {
		FormatNum fn = new FormatNum();
		assertEquals("Abcd", 123.78, fn.formatDec(123.777));
	}

}

