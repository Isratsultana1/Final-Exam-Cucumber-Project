package page;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	public static WebDriver driver; 

	public static void initDriver() { 
	System.setProperty("webdriver.edge.driver", "C:\\Users\\israt\\Sep2023_Selenium\\cucumber\\cucumber2\\driver\\msedgedriver.exe");
	driver = new EdgeDriver(); 
	driver.manage().window().maximize(); 
	driver.manage().deleteAllCookies(); 
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	} 
	public int generateRandomNum(int boundNum) {
		Random rnd = new Random();
		int generatedNum = rnd.nextInt(boundNum);
		return generatedNum;
}
	
	
	public void takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(sourceFile, new File(System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	
		

	}}

	
	
	
	
	
	
	
	

