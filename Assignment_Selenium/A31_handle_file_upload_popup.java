package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A31_handle_file_upload_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		Thread.sleep(1000);
		WebElement e1 =driver.findElement(By.name("file"));
		e1.sendKeys("C:\\Users\\ROG\\OneDrive\\Desktop\\Automation Testing");

	}

}
