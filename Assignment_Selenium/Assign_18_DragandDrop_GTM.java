package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign_18_DragandDrop_GTM {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Thread.sleep(1000);
		
		WebElement e1=driver.findElement(By.xpath("//img[@id='drag11']"));
		WebElement e2=driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(e1,e2).perform();
	}

}
