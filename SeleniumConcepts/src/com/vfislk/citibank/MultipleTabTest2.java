package com.vfislk.citibank;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");

		Set<String> windows = driver.getWindowHandles();

		for (String win : windows) {
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());

			if (driver.getTitle().equals("Sykes")) {
				break;
			}
			System.out.println("----------");
		}

		// point to the tab with Sykes or else last tab
		driver.findElement(By.xpath("//img")).click();
		
		windows = driver.getWindowHandles();

		for (String win : windows) {
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());

			if (driver.getTitle().equals("Sykes Enterprises Jobs - Career Opportunities in Sykes Enterprises - Naukri.com")) {
				break;
			}
			System.out.println("----------");
		}
		
		
		driver.findElement(By.xpath("(//span[text()='SYKES ENTERPRISE'])[2]")).click();
	}

}
