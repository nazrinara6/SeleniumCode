package assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_8_getWindowHandle 
{

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());

	}

}
