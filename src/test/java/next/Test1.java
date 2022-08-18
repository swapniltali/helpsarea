package next;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {         //invocation count keyword
	                  
	@Test(priority=-1,invocationCount=3)
	public void B() {
		System.out.println("this is test 1");
	}
    @Test
    public void A() {
    	System.out.println("this is test 2");
    	Assert.assertTrue(false);  //True=false
    }
    @Test
    public void D() {
    	System.out.println("this is a test 3");
    }
   // @Test
   // public void E() {
    //	System.out.println("this is test 4");
   // }
    //@Test
    //public void C() {
    	//System.out.println("this is test 5");
   // }
}
