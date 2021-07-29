package com.vfislk.alert;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B1")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.alertIsPresent());
		
		String actualAlertText= driver.switchTo().alert().getText();
		System.out.println(actualAlertText);
		
//		driver.switchTo().alert().sendKeys("hello");
		
//		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}

}
