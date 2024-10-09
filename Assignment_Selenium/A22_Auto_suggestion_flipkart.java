package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22_Auto_suggestion_flipkart {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Mobile");
		Thread.sleep(3000);
		
		List<WebElement> e2 =driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count = e2.size();
		System.out.println(count);
		
		e2.get(7).click();  //there is 8 element in the auto suggestion,so 7th index is the last

	}

}
