 package piit.AutomationTrainingProgram;
 import org.testng.annotations.Test;
 import org.testng.annotations.BeforeClass;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
 import org.testng.annotations.AfterClass;
 public class NewTest {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
  WebDriver driver;
 // System.setProperty("webdriver.edge.driver","C:\\Users\\ravin\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\msedgedriver.exe");
  System.setProperty("webdriver.gecko.driver","C:\\Users\\ravin\\eclipse-workspace\\AutomationTrainingProgram\\drivers\\geckodriver.exe");

 // driver = new EdgeDriver();
  driver = new FirefoxDriver();
  driver.navigate().to("https://facebook.com");
  driver.findElement(By.partialLinkText("Forgot")).click();
  String name=driver.findElement(By.xpath("//*[text()='Please enter your email or mobile number to search for your account.']")).getText();
  Assert.assertEquals("Please enter your email or mobile number to search for your account.",name);
  //Assert.assertEquals(name, name);	
  }
  @AfterClass
  public void afterClass() {
  }

}
