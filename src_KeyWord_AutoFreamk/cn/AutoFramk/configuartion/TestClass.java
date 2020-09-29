package cn.AutoFramk.configuartion;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.collections4.Get;

public class TestClass {
   public static Method method[];
   public static action action;
   
	public static void main(String[] args) {
		action=new action();
		method=action.getClass().getMethods();	
		
			getmethod();
	}
	
	public static void getmethod() {
		for (int i = 0; i < method.length; i++) {
			
			System.out.println(method[i].getName());

		}
	}
}
class action{
	public void method1(String parm,String parm1) {
		System.out.println("method1");
	}
	public void method2(String parm,String parm1) {
		System.out.println("method2");
		}
	public void method3(String parm,String parm1) {
		System.out.println("method3");
	}
	
	
}
