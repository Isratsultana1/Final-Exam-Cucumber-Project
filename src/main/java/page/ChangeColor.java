package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ChangeColor extends TestBase {
	WebDriver driver; 
	public ChangeColor(WebDriver driver) { 
	this.driver = driver; 
	}
	@FindBy(how = How.XPATH, using = "//button[text()='Set SkyBlue Background']") 
	WebElement ClickOnButton; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]") 
	WebElement ClickOnButton2; 

public void clickonbutton() {
	ClickOnButton.click();
	try { 
	Thread.sleep(3000); 
	} catch (InterruptedException e) { 
	e.printStackTrace(); 
	} }
public void clickonbutton2() {
	ClickOnButton2.click();
	try { 
	Thread.sleep(3000); 
	} catch (InterruptedException e) { 
	e.printStackTrace(); 
	} }
}
