package appium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	@Test
	public void testSearch() {
		String text = androidDriver.findElement(By.id("com.android.settings:id/search_action_bar_title")).getText();
		
		Assert.assertEquals(text, "Search settings");
		System.out.println("Search settings >>>>>>>>>>>>"+text);
	}
}
