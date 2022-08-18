package next;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	@BeforeSuite
	public void b1() {
		System.out.println("s1");
	}
	@BeforeTest
	public void b2(){
		System.out.println("s2");
	}
	@BeforeClass
	public void b3() {
		System.out.println("s3");
	}
	@BeforeMethod
	public void b4() {
		System.out.println("s4");
	}
	@Test
	public void t1() {
		System.out.println("T1");
	}
	@AfterMethod
	public void a1() {
		System.out.println("A1");
	}
	@AfterClass
	public void a2() {
		System.out.println("A2");
	}
	@AfterTest
	public void a3() {
		System.out.println("A3");
	}
	@AfterSuite
	public void a4() {
		System.out.println("A4");
	}
	
}
