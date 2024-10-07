package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_3_login_facebook {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement e1 = driver.findElement(By.id("email"));
		e1.sendKeys("nazrin@gmail.com");
		WebElement e2 = driver.findElement(By.name("pass"));
		e2.sendKeys("aaaaaaaaa");
		WebElement e3 = driver.findElement(By.name("login"));
		e3.click();

		//email and password is wrong here, so it won't login

	}

}
