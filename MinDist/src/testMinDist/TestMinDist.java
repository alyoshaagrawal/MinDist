package testMinDist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import minDist.MinDist;

class TestMinDist {

	@Test
	void testFindMinDist() {
		assertEquals(3, MinDist.findMinDist(new int[]{7,1,3,4,1,7}));  //pass
		assertEquals(5, MinDist.findMinDist(new int[]{7,1,3,4,1,7}));  //fail
	}

}
