package tdd;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeCheckTest {
	
	PrimeCheck obj = new PrimeCheck();
	
	@Test
	public void isPrimeTest1() {
		
		Assert.assertTrue(obj.isprime(23));
		
	}
	@Test
	public void isPrimeTest2() {
		
		Assert.assertFalse(obj.isprime(1));
		
	}
	@Test
	public void isPrimeTest3() {
		
		Assert.assertFalse(obj.isprime(4));
		
	}

}
