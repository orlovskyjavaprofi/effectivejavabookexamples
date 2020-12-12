package chp1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import chap1.Chap1;
import chap1.Chap1;

class Chapter1Test {
	private Chap1 chap1AtTest;

	@BeforeEach
	void setUp() {
		chap1AtTest = new Chap1();
	}

	@Test
	void checkthatBoolReturnedTrue() {
		assertEquals(true, Chap1.valueOf(true), "expected boolean true but got false");
	}

	@Test
	void checkthatBoolReturnedFalse() {
		assertEquals(false, Chap1.valueOf(false), "expected boolean false but got true");
	}

}
