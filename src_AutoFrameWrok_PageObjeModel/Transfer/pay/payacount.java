package Transfer.pay;

import org.testng.annotations.Test;

import cn.AutoFrame.Until.Base_webdriver_browser;
import cn.AutoFrame.Until.Constant;
import cn.AutoFrame.Until.Excel_until;
import cn.AutoFrame.pageAction.Assisido;
import cn.AutoFrame.pagebyProperties.FormulárioAssistido;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class payacount extends Base_webdriver_browser {
  @Test(dataProvider = "tranksferdata")
  public void tranksfer(String payacount, String receacount,String name,String paynumber) throws InterruptedException {
	  FormulárioAssistido  checkelemnet=new FormulárioAssistido();
	  Assisido Assisido = new Assisido();
	  Assisido.transfer(payacount, receacount, name, paynumber);
	  
	//断言
	assertEquals(checkelemnet.actionstep(), "转账成功");
	  
  }
  @Test(dataProvider = "tranksferdata")
  public void trankfernot(String payacount, String receacount,String name,String paynumber) throws InterruptedException {
		FormulárioAssistido  checkelemnet=new FormulárioAssistido();
		  Assisido Assisido = new Assisido();
		  Assisido.transfer(payacount, receacount, name, paynumber);
		  
		//断言
		assertEquals(checkelemnet.actionstep(), "转账失败");
		  
  }
  @BeforeMethod
  public void beforeMethod() {
	  super.chrome();
	  driver.get("https://preview.pro.ant.design/form/step-form");
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] tranksferdata() throws IOException {
	  //封装object类型数组的方法   读取数据
	 return Excel_until.auto_Getdata_excel(Constant.TESTDATAEXCELPATH_STRING, Constant.EXCEL_SHEET_STRING);
  }
}
