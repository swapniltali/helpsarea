package test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test8 {

	public static void main(String[] args) {
		      WebDriverManager.chromedriver().setup();
			  WebDriver driver =new ChromeDriver();
			  driver.get("https://www.facebook.com/");
			  driver.manage().window().maximize();
			  WebElement emailid =driver.findElement(By.xpath("//input[@id='email']"));                     //wbelmnt 
			  Actions act=new Actions(driver);                                                              //object
			  act.keyDown(emailid,Keys.SHIFT).sendKeys("swappnil@").keyUp(Keys.SHIFT).build().perform();    //shift actn                     
			  act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();                //cntrl actn
			  act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();                
			  
			  WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));                         
			  pass.click();                                                                                 //clk actn
			  act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();          
			  
			  WebElement lgnbtn =driver.findElement(By.xpath("//button[@name='login']"));
			  lgnbtn.sendKeys(Keys.ENTER);                                                                  //enter actn                                                     
             			  
			  
			  
	}

}
