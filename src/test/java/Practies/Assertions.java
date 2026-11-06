package Practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	public void test()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("prabhakarsp225@gmai.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("prabha225");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		
		String actTitle=driver.findElement(By.xpath("//span[@class='x193iq5w xeuugli x1fj9vlw x13faqbe x1vvkbs xt0psk2 xnk8lw1 xuarlqh xuemr51 x1ff8u0n x1a1m0xk x1yc453h']")).getText();
		
		
		String expTitle="The password you've entered is incorrect.";
		
		Assert.assertEquals(actTitle, expTitle);
		
	}

}
