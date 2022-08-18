package next;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tset14 {
	@Test
	public void k1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor gr=(JavascriptExecutor) driver; 
	    WebElement lite=driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
	    gr.executeScript("arguments[0].scrollIntoView()",lite);
		
		
	}

}
