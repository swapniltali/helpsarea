package next;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test13 {
	@Test
	public  void test1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//String location="C:\\Users\\lenovo\\eclipse-workspace\\bsmorningbatch\\screenshot";
	     
	    JavascriptExecutor gr=(JavascriptExecutor) driver; 
	    WebElement lite=driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
	    gr.executeScript("arguments[0].scrollIntoview()",lite);
		
		

	}

}
