package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A25_print_all_auto_suggestion_of_FlipkartSearch {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Mobile");
		Thread.sleep(3000);
		
		List<WebElement> li =driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		int count = li.size();
		System.out.println(count);
		Thread.sleep(3000);
		
		for(int i=0;i<count;i++)
		{
			WebElement e2 = li.get(i);
			String s1 = e2.getText();
			System.out.println(s1);
		}

	}

}
