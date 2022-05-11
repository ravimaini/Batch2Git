package piit.AutomationTrainingProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageObjectModel {
	WebDriver driver;
	@FindBy(name="email") WebElement Id;
	@FindBy(name="pass") WebElement Pass;
	@FindBy(linkText="Forgot password") WebElement Forgot;
	
	
	public  pageObjectModel (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void Email() {
		Id.sendKeys("John");
	}
	public void Password() {
		Id.sendKeys("silver");
	}
	public void ForgotLinkClick() {
		Forgot.click();
	}

}
