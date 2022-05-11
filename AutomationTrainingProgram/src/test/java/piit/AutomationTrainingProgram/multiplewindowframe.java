package piit.AutomationTrainingProgram;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class multiplewindowframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		Actions ob = new Actions(driver);
		WebElement newrealese= driver.findElement(By.linkText("New Releases"));
		ob.keyDown(Keys.SHIFT).build().perform();
		newrealese.click();
		ob.keyUp(Keys.SHIFT).build().perform();
		Set<String> windowhandles=driver.getWindowHandles();
		Iterator <String>iterators=windowhandles.iterator();
		String Parent=iterators.next();
		String child=iterators.next();
		System.out.println("This is parent window= "+Parent);
		System.out.println("This is parent window= "+child);
		driver.switchTo().window(child);
		WebElement product=driver.findElement(By.linkText("Camera & Photo Products"));
		Thread.sleep(6000);
		product.click();
		}
}
