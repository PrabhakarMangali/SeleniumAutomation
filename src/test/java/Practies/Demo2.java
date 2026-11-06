package Practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys("myemail@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("mypass@123");
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Log in")).click();	
        Thread.sleep(2000);
        
        driver.findElement(By.linkText("Forgotten password?")).click();
        Thread.sleep(2000);
     //   driver.close();
         
	}

}
