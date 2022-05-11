package piit.AutomationTrainingProgram;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test {
	static WebDriver driver;
	public static void main(String[] args) {
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password");
		driver.findElement(By.id("email")).sendKeys("Ravi@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.className("auth-flash-error")).getText());
		driver.findElement(By.className("bodySmall")).click(); 
}
}
