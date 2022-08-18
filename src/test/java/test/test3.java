package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test3 {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.instagram.com/");
		 driver.manage().window().maximize();
		 WebElement dr=driver.findElement(By.name("username"));                 //webelement via 'name' locator
		 dr.sendKeys("swapni@123");                  //pass
		 WebElement tgy=driver.findElement(By.name("password"));                //webelement via 'name' locator
		 tgy.sendKeys("12345212121");                     //login
		 WebElement hji=driver.findElement(By.xpath("//div[text()='Log In']")); //webelement via 'Xpath' locator(Xpath by text)
		 hji.click();                                   
		 
		 
		 

	}

}
