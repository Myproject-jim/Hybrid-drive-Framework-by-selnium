package cn.AutoFrame.pageAction;

import cn.AutoFrame.pageby.Element_page;

/*
 * 基于页面元素事件的封装
 */
public class intro_action extends Element_page {

	public static void  loginpage(String User,String psssword) throws InterruptedException {
	
		username.sendKeys(User);
		password.sendKeys(psssword);
		loginbtu.click();
		Thread.sleep(3000);
		
	  
  }
	
    public static void serversion(String build,String server) {
    	
    	selectServer.sendKeys(server);
    	setbuild.sendKeys(build);
    	setbuildbtu.click();
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }

}
