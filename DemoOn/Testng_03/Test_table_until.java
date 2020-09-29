package Testng_03;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;
import com.google.common.util.concurrent.SettableFuture;

import Testng_01.Base_webdriver;

public class Test_table_until extends Base_webdriver {
	private  WebElement webelemt_table;
	
	public  Test_table_until(WebElement table) {
	 Settable(table);
		
	}
	public WebElement gettable() {
		return webelemt_table;
	}
	
	public void  Settable(WebElement webelemt_table) {
		this.webelemt_table=webelemt_table;
	}
//    rows
	public int getrowcount() {
		List<WebElement> tablerows = webelemt_table.findElements(By.tagName("tr"));
		
		return tablerows.size();
		
	}
	//column 
	public  int getcolumncount() {
		List<WebElement> tablerows = webelemt_table.findElements(By.tagName("tr"));
		
		return tablerows.get(0).findElements(By.tagName("tg")).size();
		
	}
	//获取某列的对象
	public WebElement getcell(int rowNo,int colNo) {
		
		List<WebElement> tablerows = webelemt_table.findElements(By.tagName("tr"));
		System.out.println("rows"+tablerows);
		WebElement currentrows = tablerows.get(rowNo-1);
		List<WebElement> tablecols = webelemt_table.findElements(By.tagName("td"));
		System.out.println("rows"+tablecols);
		WebElement cell = tablerows.get(colNo-1);
		return cell;
	}
	public WebElement getWebElementcell(int rowNo,int colNo ,By elem)throws NoSuchElementException {
		try {
			List<WebElement> tablerows = webelemt_table.findElements(By.tagName("tr"));
			WebElement currentrows = tablerows.get(rowNo-1);
			List<WebElement> tablecols = webelemt_table.findElements(By.tagName("td"));
			WebElement cell = tablerows.get(colNo-1);
			//某行 某列的对象
			return cell.findElement(elem);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			throw new NoSuchElementException("not such elemnt");	
		}
		
		
	}
	
	
	
}
