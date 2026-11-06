package Practies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		//To open the Chrome
		WebDriver driver=new ChromeDriver();
		
		//To open the facebook
		driver.get("https://www.facebook.com/");
		
		//To maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//To refresh the browser
		driver.navigate().refresh();
		Thread.sleep(2000);
		//to go to back
		driver.navigate().back();
		Thread.sleep(2000);
		//To goto forward
		driver.navigate().forward();
		Thread.sleep(2000);
		//close the current tab
		driver.close();
		Thread.sleep(2000);
		//close the all tabs
		driver.quit();
		
	
	}

}
