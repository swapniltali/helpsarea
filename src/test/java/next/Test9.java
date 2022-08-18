package next;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test9 {
	SoftAssert soft=new SoftAssert();
	@Test
	public void mq1() {
		System.out.println("test1");
		System.out.println("test2");
		String actual="Method";
		String expected="methodd";
		soft.assertEquals(actual, expected);
		System.out.println("test done3");
		soft.assertAll();
	}

}
