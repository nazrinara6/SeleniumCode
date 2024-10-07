package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_9_Absolute_Xpath {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ROG/OneDrive/Desktop/Automation%20Testing/Learning.html");
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("nazrin06");
		
		WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("Hello GTM");
		
		WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("password");
		
		WebElement e4 = driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		e4.sendKeys("Nazrin");
		
		WebElement e5 = driver.findElement(By.xpath("((/html/body/form)[1]/input)[2]"));
		//e5.sendKeys("Ara");
		
		WebElement e6 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		e6.click();
		
		WebElement e7 = driver.findElement(By.xpath("(/html/body/input)[5]"));
		e7.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}