# Environment:
1.eclipse+Testng+Selenium+MySQL+POI+Apachelog4J
# 框架设计模式（pageobject模式框架& 数据驱动混合自动化框架）
•	Pageobject模式
1.	页面层（主要封装当前被测页面对象）
2.	页面元素（objectmap.properties）
3.	业务逻辑层（封装当前页面的复用业务逻辑操作）
4.	事件层（封装常规业务逻辑）
5.	基础配置层（读取外部文件连接数据库等基础操作）
6.	功能模块构建Case流（脚本层）

•	数据驱动混合自动化框架（高级）
1.	业务逻辑层（封装当前被测页面事件流）
2.	页面元素层（封装被测页面元素）
3.	数据层（外部数据文件 xls.csv等文件）
4.	基础配置层
5.	基础业务事件层（封装页面常用操作方法）
6.	脚本层
# TeseCase.文件 (支持读取.csv  .xlsx .xml .xls文件 数据库)  
1)Testcase （数据格式）
•	Function
•	TestcaseID（important）
•	Test case description
•	passrate（important）
•	status（important）
2)Teststep （数据格式）
•	TestcaseID（important）
•	TeststepNo	
•	Casedetail	
•	Casestepname	
•	5.Casestepvalue	（important）
•	6.Casestepelement_KEY	（important）
•	passrate	
•	status

------加注important用例参数必填选项底层对应封装可直接对应读取 element parameter  注意testcaseID在 testcase 和 testsuite 中要相同-------
# 脚本编写规则
•	Pageobject模式
1.	在页面元素层编写被测页面定位元素（定位元素表达式）
2.	封装被测页面对象（封装当前功能模块的操作对象）
3.	根据需求编写业务逻辑（根据测试用例编写casestep）
4.	根据框架规则编写脚本（参数化脚本）
5.	ant构建执行测脚本

•	数据驱动混合自动化框架（高级）
1.	根据项目要求编写测试用例在excel中（编写规范根据框架给出规则做）
2.	在congfiguartion编写被测页面成员方法
3.	根据java中的映射机制编写自动化脚本
---具体详见自动化框架----
# 框架的优势
1.	高效稳定
2.	脚本维护简单
3. 框架可维护性高
4. 可以应用本框架思想编写接口自动化框架
# 框架的劣势
1.数据库读取
2.不能多线程进行自动化
3.通过ant构建测试
4.--------.
# 后续待优化
•	Ant+jekins+Testng—集成自动化
•	测试报告
• 自动发送邮件
• log日志
