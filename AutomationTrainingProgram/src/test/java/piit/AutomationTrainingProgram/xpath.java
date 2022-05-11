package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		 System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gb']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("computer");
		driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/form/div/div/span")).click();

		
	}

}
