package com.vfislk.redbus;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("i-icon-profile")).click();
		driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']")).click();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='modalIframe']")));
		
		
		driver.findElement(By.id("mobileNoInp")).sendKeys("77585874");
		//other operations
		
		driver.switchTo().defaultContent();
		

	}

}
