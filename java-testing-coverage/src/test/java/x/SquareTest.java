package x;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void normal() throws Exception {
		fail("Not yet implemented");
		//Square s = new Square (10);
		//assertNotNull(s);
	}
	
	@Test
	void zero () throws Exception {
		
		Assertions.assertThrows(Exception.class, () -> {
			Square s = new Square (0);
		  });
				
	}

	@Test
	void sides() throws Exception {
		
		Square s = new Square(1);
		Assertions.assertEquals(4, s.sides());
		
	}
	
	@Test
	void negative() throws Exception {

		Assertions.assertThrows(Exception.class, () -> {
			Square s = new Square (-1);
		  });
		
	}
	
	@Test
	void circumferance() throws Exception {
		
		Square s = new Square(2);
		Assertions.assertEquals(8, s.circumference());
	}
	
}
