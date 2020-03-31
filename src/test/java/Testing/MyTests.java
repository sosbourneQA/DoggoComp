package Testing;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Project.Position;

public class MyTests {
	
	@Test
	public void testFirst() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "1st", pos.getPos(1));
	}
	@Test
	public void testSecond() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "2nd", pos.getPos(2));
	}
	@Test
	public void testThird() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "3rd", pos.getPos(3));
	}
	@Test
	public void testFourth() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "4th", pos.getPos(4));
	}
	@Test
	public void test100th() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "100th", pos.getPos(100));
	}
	@Test
	public void test31st() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "31st", pos.getPos(31));
	}
	@Test
	public void test42() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "42nd", pos.getPos(42));
	}
	@Test
	public void test63rd() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "63rd", pos.getPos(63));
	}
	@Test
	public void test86th() {
		Position pos = new Position();
		pos.createPos();
		assertEquals("", "86th", pos.getPos(86));
	}

}
