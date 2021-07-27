package com.vfislk.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ValidCredentialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://magento.com/"); // wait until the page load happen

		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign in']")); // findelement --> tries to find
																					// element in 500ms - present and
																					// visible
		ele.click();

		driver.findElement(By.id("email")).sendKeys("balaji0017@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("balaji@12345");

		// continue
		driver.findElement(By.name("send")).click();

		// wait for dashboard page load
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Log Out")));

		// get title
		System.out.println(driver.getTitle());
		// log out
		driver.findElement(By.linkText("Log Out")).click();

	}

}
