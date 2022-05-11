package piit.AutomationTrainingProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class expedia {
	static WebDriver driver;
	public static void main(String[] args) {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to("https://www.expedia.com");
	}

}
