package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A21_Atuo_suggestion_amazon_search {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		WebElement e1=driver.findElement(By.name("field-keywords"));
		e1.sendKeys("Shoe");
		Thread.sleep(3000);
		
		List<WebElement> e2 =driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = e2.size();
		System.out.println(count);
		
		e2.get(1).click(); // it will click on the second element

	}

}
