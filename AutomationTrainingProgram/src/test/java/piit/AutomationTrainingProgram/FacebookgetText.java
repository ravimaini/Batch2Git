package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FacebookgetText {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://facebook.com");
		driver.findElement(By.partialLinkText("Forgot")).click();
		String name=driver.findElement(By.xpath("//*[text()='Please enter your email or mobile number to search for your account.']")).getText();
		Assert.assertEquals("Please enter your email or mobile number to search for your account.",name);
		//Assert.assertEquals(name, name);
	}

}
