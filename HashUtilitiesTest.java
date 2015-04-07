package day12;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import Day8.HashUtilities;

public class HashUtilitiesTest {

	@Test
	public void hashUtilitiesTest() {
		
		Random r = new Random ();
		int rand = r.nextInt(1000000);
		rand= HashUtilities.shortHash(rand);
		
		assertTrue(rand <1000);
	}

}
