package com.vfislk.citibank;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleTabTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.online.citibank.co.in/");
		
		if(driver.findElements(By.xpath("//img[@class='appClose']")).size()>0)
		{
			driver.findElement(By.xpath("//img[@class='appClose']")).click();
		}
		
		
		
		driver.findElement(By.linkText("APPLY FOR CREDIT CARDS")).click();
		
		System.out.println(driver.getTitle());
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		System.out.println("--------------------------------");
		
		Set<String> windows= driver.getWindowHandles();
		
		for(String win : windows)
		{
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
			System.out.println("----------");
		}
		
		
		
		driver.findElement(By.linkText("Travel")).click();
		
		//enter john@gmail.com
		driver.findElement(By.id("Email_Id")).sendKeys("john@gmail.com");
		
		//enter phone number as 9898898898
		driver.findElement(By.id("mobile_number")).sendKeys("9898898898");
		
		//select Mx
		Select select=new Select(driver.findElement(By.id("Title")));
		select.selectByVisibleText("Mx.");
		
		//name as john d
		driver.findElement(By.id("FirstName")).sendKeys("john d");
		
		//Do you have a Citibank Savings Account?  --> click yes
		
		driver.findElement(By.xpath("//input[@id='existcust' and @value='Yes']")).click();
		driver.close();
	}

}
