package test1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String parentwindowadd=driver.getWindowHandle();      //parent window popup address
		System.out.println(parentwindowadd);                  //print above
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();  //web element frm parent window
		
		Set<String> alladdress=driver.getWindowHandles();     //all window's popup add. as parent & child
		System.out.println(alladdress);                       //print above
		Iterator<String> its=alladdress.iterator();           // for target specific popup address
		while(its.hasNext()) {
			String childwindowaddress=its.next();
			if(!parentwindowadd.equals(childwindowaddress)) {
			driver.switchTo().window(childwindowaddress);
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("swapnil@gmail.com");// child wndow's wbelm                    
			driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
			//driver.switchTo().window(parentwindowadd);
			driver.close();
				
			}
		}
		
		
		
		

	}

}
