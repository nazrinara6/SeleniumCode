package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_15_Dropdown_amazon_AllCategory {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(e1);
		s1.selectByVisibleText("Books");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
		
		WebElement e2=driver.findElement(By.id("twotabsearchtextbox"));
		e2.sendKeys("Power of Mind");
		e2.sendKeys(Keys.ENTER);

	}

}
