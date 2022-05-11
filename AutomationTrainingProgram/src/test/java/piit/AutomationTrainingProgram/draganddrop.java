package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver;
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		driver.manage().window().maximize();
		Actions object=new Actions(driver);
		Thread.sleep(2000);
		WebElement dragable= driver.findElement(By.linkText("Droppable"));
		dragable.click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement Elementtodrop= driver.findElement(By.id("draggable"));
		WebElement drophere= driver.findElement(By.id("droppable"));
		Actions ob= new Actions(driver);
		Thread.sleep(2000);
		ob.dragAndDrop(Elementtodrop, drophere).build().perform();
		driver.switchTo().parentFrame();
		WebElement Sorting=driver.findElement(By.linkText("Sortable"));
		Sorting.click();
}
}
