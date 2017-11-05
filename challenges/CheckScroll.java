package challenges;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckScroll {

	public synchronized void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		ChromeDriver driver = new ChromeDriver(/*options*/);
		// maximize the browser
		driver.manage().window().maximize();
		// load the browser with url
		driver.get("https://www.naukri.com/");
		int y = driver.findElementByLinkText("Browse All Jobs").getLocation().getY();
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0, "+y+")");
		
		
		
		
		//driver.findElementByLinkText("Browse All Jobs").click();
		System.out.println(driver.getTitle());
	}

}
