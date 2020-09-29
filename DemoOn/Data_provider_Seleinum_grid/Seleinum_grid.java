package Data_provider_Seleinum_grid;

import org.testng.annotations.Test;

import Allbrowser.chrome;
import bsh.Capabilities;

import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;

public class Seleinum_grid {
	WebDriver driver;
	//设置子主机的 节点ip
	String nodeurl="http://10.164.103.196:4444/grid/console";
  @Test
  public void csse1() {
	  
	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() throws MalformedURLException {
	//访问远程节点的操作系统和浏览器，需要设定DesiredCapabilities
	 DesiredCapabilities Capability = DesiredCapabilities.chrome();
	 //设置浏览器名称
	 Capability.setBrowserName("Chrome");
	 //设置系统名称
	 Capability.setPlatform(Platform.WIN10);
	 //连接指定node点        capability 作为环境参数变量	  remotewebdriver 远程连接对象
	 driver=new RemoteWebDriver(new URL(nodeurl),Capability);
	 
	//
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
	  
	  
  }

}
