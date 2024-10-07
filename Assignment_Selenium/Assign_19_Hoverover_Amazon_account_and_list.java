package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_19_Hoverover_Amazon_account_and_list {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		WebElement e2=driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		e2.click();

	}

}
