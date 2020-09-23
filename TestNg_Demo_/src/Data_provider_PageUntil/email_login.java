package Data_provider_PageUntil;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class email_login extends LoadableComponent<email_login>{
 String	url="https://www.sogou.com";
 @FindBy( id = "query")
 public WebElement username;
 @FindBy(xpath = "//*[id='loginBtn']")
 public WebElement password;

 @FindBy(id = "stb")
 public WebElement button;
 
 public WebDriver driver;
 public email_login(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 driver.manage().window().maximize();
 }

@Override
protected void load() {
	// TODO Auto-generated method stub
	this.driver.get(url);
}
public Home_page login() throws InterruptedException {
	load();
//	WebDriverWait wait = new WebDriverWait(driver,5);
//	wait.until(ExpectedConditions.elementToBeSelected(By.id("idInput")));
	Thread.sleep(5000);
	username.clear();
	username.sendKeys("Jimmie_0109");
	password.sendKeys("jiaming0109");
	button.click();
	
	return new Home_page(driver);
}

public String getscource() {
	return driver.getPageSource();
}

public email_login loginerror() {
	load();
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.elementToBeSelected(By.id("idInput")));
	username.clear();
	username.sendKeys("Jimmie_0109");
	password.sendKeys("ddddd");
	button.click();
	
	return new email_login(driver);
}

@Override
protected void isLoaded() throws Error {
	// TODO Auto-generated method stub
	Assert.assertTrue(driver.getTitle().contains("126"));
}








}