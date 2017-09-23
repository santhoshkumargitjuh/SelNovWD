package week2.day1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesofSwitchingToWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://legacy.crystalcruises.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Set<String> allWindows = driver.getWindowHandles();

		//For Last Window
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
		}
		
		//For First Window
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			break;
		}
		
		//For Specific Window
		int i =1;
		for (String eachWindow : allWindows) {
			driver.switchTo().window(eachWindow);
			if(i==2){
				break;				
			}
		}

	}













}
