package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupsalert {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	driver.manage().window().maximize();
	WebElement Alert=driver.findElement(By.name("prompt"));
	Alert.click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
}
}
