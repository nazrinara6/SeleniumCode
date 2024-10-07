package assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_10_Amazon_login_with_xpath {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%2Fref%3Dnav_signin%3Furl%3Dsearch-alias%253Daps%26field-keywords%3DShoe&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id='ap_email']"));
		e1.sendKeys("stbymkt@gmail.com");
		
		WebElement e2 = driver.findElement(By.xpath("//input[@id='continue']"));
		e2.click();
        
        WebElement e3 = driver.findElement(By.xpath("//input[@id='ap_password']"));
        e3.sendKeys("stbymkt");
        
        WebElement e4 = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
        e4.click();

	}

}
