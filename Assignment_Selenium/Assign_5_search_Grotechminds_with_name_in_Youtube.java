package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_5_search_Grotechminds_with_name_in_Youtube {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		WebElement e1 = driver.findElement(By.name("search_query"));
		e1.sendKeys("GroTechMinds");
		Thread.sleep(2000);
		e1.sendKeys(Keys.ENTER);
		
	}

}
