package com.vfislk.meddibuddy;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.medibuddy.in/");
		
		driver.findElement(By.linkText("Signup")).click();
		
		driver.findElement(By.id("mobile")).sendKeys("123");
		driver.findElement(By.id("name")).sendKeys("john");
		driver.findElement(By.id("email")).sendKeys("john@g.com");
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		
		
//		String actualText= driver.findElement(By.id("signuperr")).getText();
//		System.out.println(actualText);
		
		String actualText=driver.findElement(By.xpath("//div[contains(text(),'INVALID')]")).getText();
		System.out.println(actualText);
	}

}
