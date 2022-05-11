package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ilocators {
	static WebDriver driver;
	/* *
	 * @param args
	 */
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		
	WebElement SearchIcon= driver.findElement(By.id("nav-search-submit-button"));
WebElement serachElement=driver.findElement(By.name("field-keywords"));
	serachElement.sendKeys("Laptop");
	Actions ob = new Actions(driver);
	ob.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
Thread.sleep(4000);
ob.keyDown(Keys.CONTROL).sendKeys("x").keyUp(Keys.CONTROL).build().perform();
serachElement.clear();
Thread.sleep(4000);
serachElement.click();
ob.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	
	
	
	}

}
