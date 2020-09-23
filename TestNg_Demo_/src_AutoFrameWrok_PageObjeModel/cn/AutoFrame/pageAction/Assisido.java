package cn.AutoFrame.pageAction;

import static org.testng.Assert.assertEquals;

import cn.AutoFrame.pagebyProperties.FormulárioAssistido;
/*
 * 封装case action类  执行具体case中的step
 */
public class Assisido {

	
	public  void transfer(String payacount,String receivalacount,String reacountname,String paynumber) throws InterruptedException {
		
		FormulárioAssistido  Assistido=new FormulárioAssistido();
		
		Assistido.meniuElement().click();
		Thread.sleep(3000);
		Assistido.payacount().sendKeys(payacount);
		Thread.sleep(3000);
		Assistido.receiveacount().sendKeys(receivalacount);
		Thread.sleep(3000);
		Assistido.receiveName().sendKeys(reacountname);
		Thread.sleep(3000);
		Assistido.transfer().sendKeys(paynumber);
		Thread.sleep(3000);
		Assistido.setpbtu().click();
		
		
		
	}
	
	public void Nottansfername(String receivalacount,String reacountname,String paynumber) throws InterruptedException {

		FormulárioAssistido  Assistido=new FormulárioAssistido();
		
		Assistido.meniuElement().click();
		Thread.sleep(3000);
		Assistido.receiveacount().sendKeys(receivalacount);
		Thread.sleep(3000);
		Assistido.receiveName().sendKeys(reacountname);
		Thread.sleep(3000);
		Assistido.transfer().sendKeys(paynumber);
		Thread.sleep(3000);
		Assistido.setpbtu().click();
		
		//断言
		assertEquals(Assistido.actionstep(), "转账失败");
	}
}
