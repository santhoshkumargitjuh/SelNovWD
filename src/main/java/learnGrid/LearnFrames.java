package learnGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnFrames {
@Test
	public  void learnFrames() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.1.158:4444/wd/hub"), dc);
	/*	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();		
		WebElement element = driver.findElementByClassName("demo-frame");		
		driver.switchTo().frame(element);
		driver.findElementByXPath("//li[text()='Item 3']").click();	
		driver.switchTo().defaultContent();
		driver.findElementByLinkText("Download").click();	
	}
}
