package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_7_PartialLinkText_Amazon
{
    public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.partialLinkText("Best"));
		e1.click();
		
/*      WebElement e1 = driver.findElement(By.partialLinkText("Sellers"));
		e1.click();
*/		
		//can be done with any of the way
		//did with Best Sellers as I don't have the Customer Service option

	}

}
