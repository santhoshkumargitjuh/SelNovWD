package week2.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ClassName objectName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
	
		//Load URL 
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementById("userRegistrationForm:checkavail").click();
		
		driver.findElementById("userRegistrationForm:userName").sendKeys("gopi");
		
		Alert ald = driver.switchTo().alert();
		
		Thread.sleep(3000);
		System.out.println(ald.getText());
		
		ald.accept();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
