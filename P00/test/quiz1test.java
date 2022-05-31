import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class quiz1test {

@Test
public final void findMaxTest1() {
	int[] arrA = {1,2,3,4};
	assertEquals("test if the biggest integer is 4",4,quiz1.findMax(arrA));
	}

@Test
public final void findMaxTest2() {
	int[] arrB = {-11,-3,-1,-2,-4};
	assertEquals("test if the biggest integer is -1",4,quiz1.findMax(arrB));
	}
}
