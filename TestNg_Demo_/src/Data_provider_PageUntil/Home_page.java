package Data_provider_PageUntil;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Home_page extends LoadableComponent<Home_page>{
	
	@FindBy(xpath = "//*[@id=\"_mail_component_24_24\"]/span[contians(.,'写信')]")
	public WebElement writemail;
	@FindBy(xpath = "\"//*[@id=\\\"_mail_component_24_24\\\"]/span[contians(.,'发送')]\"")
	public WebElement sendmail;
	
	
	public WebDriver driver;
	

	public Home_page(WebDriver driver) {
//		 System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
//		 driver = new ChromeDriver();
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	//封装编写email 的方法
	public void writenemail() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//*[@id=\"_mail_component_24_24\"]/span[contians(.,'写信')]")));
		writemail.click();
		Thread.sleep(5000);
		this.tab_keybord();
		ctrl_Ckbord("title");
		this.tab_keybord();
		ctrl_Ckbord("content");
		sendmail.click();
		
		
	}
	
	
	
	public void ctrl_Ckbord(String ctrl_C) {
		//复制粘贴内容
		StringSelection emailcontent = new StringSelection(ctrl_C);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(emailcontent, null);
		Robot robot=null;
		try {
			robot=new Robot();
		} catch (Exception e) {
			// TODO: handle exception
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
			
	}
	public void tab_keybord() {
		Actions action = new Actions(driver);
		action.keyDown(Keys.TAB);
		action.keyUp(Keys.TAB);
	}
	
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}
	
}
