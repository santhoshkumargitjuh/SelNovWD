package week2.day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//ClassName objectName = new ClassName();
		ChromeDriver driver = new ChromeDriver();

		//maximize the browser
		driver.manage().window().maximize();


		//Load URL 
		driver.get("http://legacy.crystalcruises.com/");


		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByLinkText("GUEST CHECK-IN").click();

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());

		System.out.println(driver.getSessionId());

		Set<String> allWindow =  driver.getWindowHandles();	

		for (String eachWindow : allWindow) {

			driver.switchTo().window(eachWindow);

			System.out.println(eachWindow);

			System.out.println(driver.getSessionId());		

		}

		System.out.println("*********");		

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		driver.findElementByLinkText("View Offer»").sendKeys(Keys.ENTER);

		allWindow =  driver.getWindowHandles();


		for (String eachWindow : allWindow) {			

			driver.switchTo().window(eachWindow);			

			System.out.println(eachWindow);

			System.out.println(driver.getSessionId());			

		}		

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());	

	}

}
