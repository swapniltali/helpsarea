package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test7 {

	public static void main(String[] args) throws Exception {
	          WebDriverManager.chromedriver().setup();
			  WebDriver driver =new ChromeDriver();
			  driver.get("https://demo.guru99.com/test/drag_drop.html");
			  driver.manage().window().maximize();    
			  Actions act=new Actions(driver);
			  WebElement btnsource =driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]")); //identify src web elt
			  WebElement btndestination=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]")); //identify dst web elements
	          act.dragAndDrop(btnsource, btndestination).build().perform();                              //actn cls
	          Thread.sleep(4000);
	          
	          WebElement btnsourc =driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]")); //identify src web elt
			  WebElement btndestinatn=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]")); //identify dst web elements
	          act.dragAndDrop(btnsourc, btndestinatn).build().perform();                               //actn cls
	          Thread.sleep(4000);
	          
	          WebElement btnsurc =driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]")); //identify src web elt
			  WebElement btndestn=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]")); //identify dst web elements
	          act.dragAndDrop(btnsurc, btndestn).build().perform();                                ////actn cls
	          Thread.sleep(4000);
	          WebElement btnsur =driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]")); //identify src web elt
			  WebElement btndest=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]")); //identify dst web elements
	          act.dragAndDrop(btnsur, btndest).build().perform();                                ////actn cls
	          Thread.sleep(4000);
	          
	          
	          
	          }   

}
