package next;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test12 extends Test11 {
	SoftAssert soft=new SoftAssert();
	@Test
	public void l1() {
		System.out.println("1st");
		System.out.println("2nd");
		String actu="method";
		String expected="METHOD";
		soft.assertEquals(actu, expected);
		System.out.println("lastmethod");
		soft.assertAll();
		
	}
	
	}


