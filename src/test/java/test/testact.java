package test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testact {

	public static void main(String[] args) throws Exception {
  WebDriverManager.chromedriver().setup();
  WebDriver driver =new ChromeDriver();
  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
  driver.manage().window().maximize();    
  WebElement drp_selenium=driver.findElement(By.xpath("//a[@data-toggle='dropdown']")); //identify web elements
  Actions act=new Actions(driver);                                                      //object of action cls
  act.moveToElement(drp_selenium).build().perform();                                    //mouse move on web element                                  
  act.click(drp_selenium).build().perform();                                            //click on this                              
  Thread.sleep(13000);
 
  WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));//ri8 clk wb elmnt
  act.contextClick(rightclick).build().perform();                                       //click on this
  Thread.sleep(4000);
  
  WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
  act.doubleClick(doubleclick).build().perform();                                       //dbl clk on elmnt & clk on ths
  Thread.sleep(9000);
  driver.close();
                                                                         

	}

}
