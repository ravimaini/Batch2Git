package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement CreateAccount=driver.findElement(By.xpath("//*[text()='Create new account']"));
		CreateAccount.click();
		Thread.sleep(3000);
		// TODO Auto-generated method stub
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select select= new Select(month);
		select.selectByValue("6");
		Thread.sleep(3000);
		WebElement day=driver.findElement(By.name("birthday_day"));
		select=new Select(day);
		
		select.selectByValue("7");
		WebElement year=driver.findElement(By.name("birthday_year"));
		select=new Select(year);
		
		select.selectByValue("1964");
		
	}

}
