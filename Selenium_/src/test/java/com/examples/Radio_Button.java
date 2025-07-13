package com.examples;

import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.BaseTest;

public class Radio_Button extends BaseTest {

	public Radio_Button() throws FileNotFoundException {
		super();
	}

	@Test
	public void select_Radio_Button()

	{
		initilization();
		driver.get("https://testautomationcentral.com/demo/radiobuttons.html");

		List<WebElement> spantext = driver.findElements(By.xpath("//label/span"));

		for (WebElement span : spantext) {
			String labal = span.getText().trim();

			if (labal.equalsIgnoreCase("Option C")) {

				span.click();
				break;
			}
		}

	}
}