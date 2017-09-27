package com.org.sample.myMavenTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class verifyPage {
	

	WebDriver driver;
	
	public verifyPage( WebDriver driver) {
		this.driver = driver;
	}
	
	public void handlePopup() {
		try {
			Thread.sleep(3000);
			Alert a=driver.switchTo().alert();
			a.accept();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
		
	}

	public String verifyAccount()
	{
		String veracc = driver.findElement(By.xpath("//input[@id = 'txt_new_email']")).getText();
		return veracc;

}
}