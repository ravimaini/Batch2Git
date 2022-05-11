package M.coomon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTest {
  public void beforeClass(String window) {
	  WebDriver driver;
	  if(window.equalsIgnoreCase("Chrome")) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ravin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");}
  
	  else if(window.equalsIgnoreCase("Edge")) {
				 System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				driver = new EdgeDriver();
}
	  
	  else if(window.equalsIgnoreCase("Firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\ravin\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

	  
	  
	  }
}
}
  
  
