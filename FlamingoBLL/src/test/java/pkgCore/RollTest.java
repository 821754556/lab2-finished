package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void TestRoll() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			assertTrue((int)r.getScore()>=1);
			assertTrue((int)r.getScore()<=12);
			// TODO: Make sure value of roll is between 1 and 12.
		}

	}

}
