package piit.AutomationTrainingProgram;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AccessToPointer {
public static void main(String[] args) {
	 WebDriver driver;
    System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://amazon.com");
	driver.manage().window().maximize();
	Actions object=new Actions(driver);
	WebElement hover= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	object.moveToElement(hover).build().perform();
}
}
