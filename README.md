# 框架简单介绍&Environment:
1.Java + Selenium + Maven + TestNG + JDBC + Xml+ Git + +Ant + Jenkins 
1.	使用Java作为项目编程语言
2.	使用Selenium作为Web项目底层服务驱动框架
3.	使用TestNG作为项目运行框架，方便执行测试用例，生成测试报告
4.	使用JDBC作为数据库管理工具，方便连接数据库，执行SQL
6. 使用poi作为用例数据管理工具封装基础读写功能
7.	使用Xml作为案例管理工具，方便编写测试用例，维护测试脚本
8.	使用Git作为仓库管理工具，方便管理项目代码7
9.	使用Ant作为Java的build打包工具，方便项目代码打包
10.	使用Jenkins作为自动化持续集成平台，方便自动编译，自动打包，自动运行测试脚本，邮件发送测试报告（待完成）
# 框架主要实现的功能
1.	二次封装selenium常用操作方法 rebot 鼠标悬停，滚动条，显示等待，隐式等待，assert方法二次封装 方便编写案例脚本增强可维护性
2.	封装底层数据配置工具支持读取 .XLSX .CSV .XLS 文件的读和mysql数据库实现读写功能
1.	实现ui异常报错截图功能，自动创建文件及文件夹
2.	实现用例step效验功能，若step没有执行成功继续执行下一条step
3.	通过.XML文件是调度所需要执行案例类
4.	通过ant 实现了通过windows调用doc命令调度所有案例运行
5.	通过jekins平台+ant工具结合实现可集成的自动化测试
6.	简洁直观展示出自动化报告产出基于testng工具（待优化）

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
• Testcase （数据格式）
1.	Function
2.	TestcaseID（important）
3.	Test case description
4.	passrate（important）
5.	status（important）


• Testsuite（数据格式）
1.	TestcaseID（important）
2.	TeststepNo	
3.	Casedetail	
4.	Casestepname	
5.	Casestepvalue	（important）
6.	Casestepelement_KEY	（important）
7.	Passrate	
8.	Status

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
3.	框架可维护性高
4.	可以应用本框架思想编写接口自动化框架
# 框架的劣势
1.	数据库读取
2.	不能多线程进行自动化
3.	……….
# 后续待优化
•	Ant+jekins+Testng—集成自动化
•	测试报告
•	自动发送邮件
•	log日志
