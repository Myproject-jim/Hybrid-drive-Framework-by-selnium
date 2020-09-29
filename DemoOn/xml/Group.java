package xml;

import org.testng.annotations.Test;

public class Group {
	@Test (groups = {"function"})
	public void case1() {
		System.out.println(" the frist");
	}
	@Test (groups = {"feature"})
	public void case2() {
		System.out.println(" the feature");
	}
	@Test (groups = {"menu"})
	public void case3() {
		System.out.println(" the menu");
	}

}
