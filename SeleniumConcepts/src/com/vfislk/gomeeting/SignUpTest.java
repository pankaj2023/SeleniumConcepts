package com.vfislk.gomeeting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.gotomeeting.com/en-in");
		
		driver.findElement(By.id("truste-consent-button")).click();
		
		driver.findElement(By.linkText("Start for Free")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Bala");
		driver.findElement(By.id("last-name")).sendKeys("Dina");
		driver.findElement(By.id("login__email")).sendKeys("bala@gmail.com");
		
		driver.findElement(By.id("contact-number")).sendKeys("88124");
		
		//dropdown
		Select selectJob=new Select(driver.findElement(By.id("JobTitle")));
		selectJob.selectByVisibleText("Help Desk");
		
		driver.findElement(By.xpath("//input[@value='10 - 99']")).click();
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
