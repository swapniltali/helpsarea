package test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");             //wbelmnt
		driver.manage().window().maximize();
	    WebElement btnsbmt =driver.findElement(By.xpath("//input[@name='cusid']"));
	    btnsbmt.sendKeys("22154533");                                               //send value
	    WebElement btnsbmt1 =driver.findElement(By.xpath("//input[@name='submit']"));
	    btnsbmt1.click();                                                          //click on wbelmnt
	    Alert alt=driver.switchTo().alert();                                       // alert window (popup)                                   
	    String text=alt.getText();                                                 // get txt frm alert window
	    System.out.println(text);                                                  // print
	    Thread.sleep(4000);
	    //alt.dismiss();                                                           //cancel
	    alt.accept();                                                              //accept alert popup            
	    Thread.sleep(4000);
	    String text1=alt.getText();                                                //print txt of 2nd alert window
	    System.out.println(text1);
	    Thread.sleep(4000);
	    alt.accept();
	    
	
	}

}
