package com.vfislk.openhrm;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AssignEmergencyContactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[text()='My Info']")));
		
		String actualUrl= driver.getCurrentUrl();
		System.out.println(actualUrl);
		
		driver.findElement(By.xpath("//b[text()='My Info']")).click();
		
		driver.findElement(By.linkText("Emergency Contacts")).click();
		
		driver.findElement(By.id("btnAddContact")).click();
		
		driver.findElement(By.id("emgcontacts_name")).sendKeys("bala");
		driver.findElement(By.id("emgcontacts_relationship")).sendKeys("brother");
		driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("787");
		
		driver.findElement(By.id("btnSaveEContact")).click();

			
	}

}
