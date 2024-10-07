package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assign_17_Hoverover_language {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		WebElement e1=driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		e1.click();
		Thread.sleep(2000);
		
	    WebElement e2=driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[7]"));
	    e2.click();
	    Thread.sleep(2000);
	  
	    WebElement e3=driver.findElement(By.xpath("//span[@class='a-button a-spacing-top-mini a-button-primary']"));
	    e3.click();

	}

}
