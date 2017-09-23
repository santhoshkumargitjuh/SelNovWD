package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ClassName objectName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();

	
		//Load URL 
		driver.get("http://jqueryui.com/selectable/");
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElementByClassName("demo-frame1"));
	
		driver.findElementByXPath("//li[text()='Item 3']").click();
		
//		driver.switchTo().parentFrame();
		
		driver.switchTo().defaultContent();
		
		driver.findElementByLinkText("Download").click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
