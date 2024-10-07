package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_14_displayed_enable_disable {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.idfcfirstbank.com/login");
		
		//type f12 for inspect
		WebElement e1=driver.findElement(By.name("mobileNumber"));
		e1.sendKeys("912321992920");
		Thread.sleep(2000);
		
		WebElement e2=driver.findElement(By.id("input"));
		e2.sendKeys("nazrinara");
		Thread.sleep(2000);
		
		WebElement e3=driver.findElement(By.xpath("(//span[.='Proceed to login'])[2]"));
		e3.click();
		

	}

}
