package x;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	void normal() throws Exception {
		
		Triangle t = new Triangle (10, 1, 1);
		assertNotNull(t);
	}

	@Test
	void testZero() {
		
		Assertions.assertThrows(Exception.class, () -> {
			new Triangle (0, 0, 0);
		  });
		
	}

	@Test
	void sides() throws Exception {
		
		Triangle t = new Triangle(1, 1, 1);
		Assertions.assertEquals(3, t.sides());
		
	}
	
	@Test
	void testSingleNegative() throws Exception {

		Assertions.assertThrows(Exception.class, () -> {
			new Triangle(1, 1, -1);
		  });
		
	}
	
	@Test
	void testDoubleNegative() throws Exception {

		Assertions.assertThrows(Exception.class, () -> {
			new Triangle(1, -1, -1);
		  });
		
	}
	
	@Test
	void testTripleNegative() throws Exception {

		Assertions.assertThrows(Exception.class, () -> {
			new Triangle(-1, -1, -1);
		  });
		
	}
	
	@Test
	void circumferance() throws Exception {
		
		Triangle t = new Triangle(2, 2, 2);
		Assertions.assertEquals(6, t.circumference());
	}

}
