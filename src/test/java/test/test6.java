package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test6 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement drpcountry=driver.findElement(By.xpath("//select[@name='country']"));
		Select sel=new Select(drpcountry);
		System.out.println(sel.getFirstSelectedOption().getText());   //1st selected optn
		sel.selectByIndex(6);                                         // select by index
		Thread.sleep(8000);
		
		sel.selectByVisibleText("AMERICAN SAMOA");                    //selectByVisibleText
		Thread.sleep(4000);
		
		sel.selectByValue("ANGUILLA");                                //selectByValue
		Thread.sleep(3000);
		 List<WebElement> list=sel.getOptions();
		 System.out.println(list.size());                             //total count of list
		 for(int i=0;i<list.size();i++)
		 {
			 String txt=list.get(i).getText();
			 System.out.println(txt);                                 //print all options
			 if(txt.equals("DOMINICA"))                               // select if having DOMINICA
			 {
				 sel.selectByVisibleText("DOMINICA");                   
				 break;
			 }
		 }
		 
			 
			 }

}
