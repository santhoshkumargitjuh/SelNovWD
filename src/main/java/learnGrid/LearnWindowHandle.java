package learnGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LearnWindowHandle {
	@Test
	public  void learnWindowHandle() throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver = new RemoteWebDriver(
				new URL("http://192.168.1.158:4444/wd/hub"), dc);
		
		/*System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
		ChromeDriver driver = new ChromeDriver();*/	
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().window().maximize();
		driver.findElementByLinkText("GUEST CHECK-IN").click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		ArrayList<String> allHandles = new ArrayList<String>(); 
		allHandles.addAll(allWindows);
		String secondWindow = allHandles.get(1);
		driver.switchTo().window(secondWindow);
		System.out.println(driver.getCurrentUrl());
		/*driver.close();
		driver.switchTo().window(allHandles.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		*/
		driver.quit();
		
		
		
		

	}

}
