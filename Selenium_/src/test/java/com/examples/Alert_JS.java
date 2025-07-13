package com.examples;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.base.BaseTest;

public class Alert_JS extends BaseTest {

	public Alert_JS() throws FileNotFoundException {
		super();
	}

	@Test
	public void handle_Alert() throws IOException {
		initilization();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		logger.info("CLicked alert element....");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		logger.info("Alert get handled....");
	}

}
