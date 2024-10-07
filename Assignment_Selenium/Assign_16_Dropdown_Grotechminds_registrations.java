package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_16_Dropdown_Grotechminds_registrations {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement e1=driver.findElement(By.id("Skills"));
		
	    Select s1 = new Select(e1);
	    s1.selectByValue("select1");
		Thread.sleep(2000);
		
		WebElement e2=driver.findElement(By.id("Country"));
		
		Select s2 = new Select(e2);
		s2.selectByValue("Bangladesh");
		Thread.sleep(2000);
		
        WebElement e3=driver.findElement(By.name("Relegion"));
		
		Select s3 = new Select(e3);
		s3.selectByIndex(2);


	}

}
