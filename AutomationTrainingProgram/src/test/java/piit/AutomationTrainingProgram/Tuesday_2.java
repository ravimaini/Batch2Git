package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tuesday_2 {

	public static void main(String[] args) {
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span")).click();
	}

}
