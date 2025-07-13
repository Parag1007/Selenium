package com.examples;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.base.BaseTest;

public class Explicit_wait extends BaseTest {

	public Explicit_wait() throws FileNotFoundException {
		super();
	}

	@Test
	public void explicitWait() throws IOException {

		initilization();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath(("//button[text()='Start']"))).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
		String result = element.getText();

		Assert.assertEquals(result, "Hello World!", "Element not visible...");
	}
	
	
	@Override @AfterClass
	public void teardown() {
		super.teardown();
	}

}
