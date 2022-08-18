package next;

import org.testng.annotations.Test;

public class Test7 {
	@Test(groups="Sanity")
	public void m1(){
		System.out.println("test1");
	}
	@Test(groups="shadow")
	public void m2() {
		System.out.println("test2");
	}
	@Test (groups="Critical regression")
	public void m3() {
		System.out.println("test3");
		
	}
	@Test(groups="sanity")
	public void m4() {
		System.out.println("test4");
	}

}
