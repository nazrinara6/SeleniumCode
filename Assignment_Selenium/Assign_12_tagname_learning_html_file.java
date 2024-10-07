package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_12_tagname_learning_html_file {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ROG/OneDrive/Desktop/Automation%20Testing/Learning.html");
		WebElement e1 = driver.findElement(By.tagName("a"));
		e1.click();

	}

}
