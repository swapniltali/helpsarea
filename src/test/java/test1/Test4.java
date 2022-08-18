package test1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Test4 {

	public static void main(String[] args) throws Exception {
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
