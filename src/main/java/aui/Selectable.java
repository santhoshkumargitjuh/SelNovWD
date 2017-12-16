package aui;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://jqueryui.com/selectable/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement demo = driver.findElementByClassName("demo-frame");
		
		driver.switchTo().frame(demo);
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement item4 = driver.findElementByXPath("//li[text()='Item 4']");
		Actions builder = new Actions(driver);
		builder.clickAndHold(item1).release(item4).build().perform();
		
		
		
		
		
		
		
		
		
		

	}

}
