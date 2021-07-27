package com.vfislk.hdfc;
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
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("login_page");
		
		driver.findElement(By.name("fldLoginUserId")).sendKeys("test123");
		//click on continue
//		driver.findElement(By.xpath("//img[@alt='continue']")).click();
		
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']/following::img")).click();
		
		//come out of frame
		driver.switchTo().defaultContent();
	}

}
