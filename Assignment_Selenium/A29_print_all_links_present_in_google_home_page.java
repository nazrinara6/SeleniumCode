package assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A29_print_all_links_present_in_google_home_page {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> li =driver.findElements(By.tagName("a"));
		int count = li.size();
		System.out.println(count);
		Thread.sleep(2000);
		
		for(int i=0;i<count;i++)
		{
			WebElement e1 = li.get(i);
			String s1 = e1.getText();
			System.out.println(s1);
		}


	}

}
