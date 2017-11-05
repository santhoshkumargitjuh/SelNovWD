package challenges;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertSnap {

	@Test
	public void takeSnap() throws HeadlessException, AWTException, IOException, InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("loginbutton").click();
		Thread.sleep(1000);
		
		//driver.getScreenshotAs(OutputType.FILE);
		
		
		
		
		
		
		
		
		// take snap
		//BufferedImage image = new Robot().createScreenCapture(new Rectangle(new Dimension(w,h)));
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(image, "png", new File("./snaps/Alert.png"));
		
		//

	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	

