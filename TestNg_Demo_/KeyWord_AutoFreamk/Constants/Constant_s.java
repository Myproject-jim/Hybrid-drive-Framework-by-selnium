package Constants;

import cn.AutoFrame.pagebyProperties.intro_Page;

public class Constant_s {
	public static final String PATH_EXCEL="C:\\Users\\JIAMING.YANG\\Desktop";
	public static final String PATH_EXCEL_TYPE="javaUtil.xlsx";
	public static final String PATH_PROPERITES="E:\\eclipse\\TestNg_Demo_\\KeyWord_AutoFreamk\\objectmap.properites";
	public static final String SHEET_TESTSTEP="Teststep";
	public static final String SHEET_TESTSUITE="Testsuite";
//	------------------------------------------↓↓↓↓↓↓↓↓↓↓↓↓针对tessuiebyexcel脚本的封装功能模块编写关键项↓↓↓↓↓↓↓↓↓↓↓↓------------------------------------------------------

	public static final int KEYACTION=3;
	public static final int KEYVALUE=4;
	//Test suite 中的case 是否可以执行
	public static final int casestatus=3;
    // Test id 作为 遍历 对应ste 的唯一条件
	public static final int cases_ID=1;
	//当前case 是否执行通过
	public static final int Casepass_status=4;
	
	public static final int STEPCaseId=0;
	//step 是否通过
	public static final int STEPSTATUS=6;
	
//	------------------------------------------↓↓↓↓↓↓↓↓↓↓↓↓针对assidtido功能模块编写关键项↓↓↓↓↓↓↓↓↓↓↓↓--------------------------------------------------------------------
	
	//固定case step 关键项
	public static final int TestcaseIDbystep=0;
	public static final int pass_ratebystep=6;
	public static final int Casestepname=3;
	public static final int Casestepvalue=4;
	public static final int Casestepelement_KEY=5;

	
	//固定case的关键项
	public static final int TestcaseID=1;
	public static final int pass_rate=3;
	
	//Case 状态是否可执行
	public static final int  Casestatus=4;

	
}
