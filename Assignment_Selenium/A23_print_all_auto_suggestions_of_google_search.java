package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A23_print_all_auto_suggestions_of_google_search {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement e1=driver.findElement(By.id("APjFqb"));
		e1.sendKeys("Bangalore");
		
		Thread.sleep(1000);
		List<WebElement> li =driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
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
