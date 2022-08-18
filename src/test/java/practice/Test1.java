package practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

public class Test1 {
	SoftAssert soft=new SoftAssert();
	@Test
	public void k1() {
		System.out.println("this");
		System.out.println("is method");
		System.out.println("sol");
		String actual="swapnil";
		String expected="tali";
		soft.assertEquals(actual, expected);
		System.out.println("js");
		soft.assertAll();
		
	}

}
