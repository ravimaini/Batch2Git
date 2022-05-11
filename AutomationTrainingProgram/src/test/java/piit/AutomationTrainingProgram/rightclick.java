package piit.AutomationTrainingProgram;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver;
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https:deluxe-menu.com");
			driver.manage().window().maximize();
			driver.navigate().to("https://deluxe-menu.com/popup-mode-sample.html");
			Thread.sleep(6000);
			WebElement picture=driver.findElement(By.xpath("//*[@style='cursor: pointer;']"));
Actions ob= new Actions(driver);
ob.contextClick(picture);
		// TODO Auto-generated method stub

	}

}
