package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selfintroduction {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		
		

	}

}
