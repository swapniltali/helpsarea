package next;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test8 {
	@Test
	public void s1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement srchbox=driver.findElement(By.xpath("//input[@type='text']"));
		srchbox.sendKeys("mobile");
		WebElement srch_btn=driver.findElement(By.xpath("//input[@type='submit']"));
		srch_btn.click();
		WebElement speci=driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[2]"));
		speci.click();
		String Location ="C:\\Users\\lenovo\\eclipse-workspace\\bsmorningbatch\\screenshot";
		String q=RandomString.make(3);
		TakesScreenshot rq=(TakesScreenshot) driver;
		File src =rq.getScreenshotAs(OutputType.FILE);
		File destination =new File(Location+"\\"+q+".png");
		FileUtils.copyFile(src, destination);
		WebElement mod_name=driver.findElement(By.xpath("//span[@id='productTitle']"));
		String nm=mod_name.getText();
		System.out.println(nm);
		WebElement content=driver.findElement(By.xpath("//img[@alt='Happy Independence Day']"));
		String actual=content.getText();               
		System.out.println(actual);
		String expected="Happy Independence Day";
		Assert.assertEquals(actual,expected);
		System.out.println("test completed");
		
		
		
		
		
		
		
	}

}
