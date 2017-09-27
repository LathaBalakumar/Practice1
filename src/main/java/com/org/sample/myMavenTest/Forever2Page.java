package com.org.sample.myMavenTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Forever2Page {
	
	WebDriver driver;
	
	public Forever2Page( WebDriver driver) {
		this.driver = driver;
	}
	
		
	
	public void provideEmail(String email)
	{	WebDriverWait wait= new WebDriverWait(driver, 15);
	//driver.findElement(By.xpath("//input[@id = 'txt_new_email']")).sendKeys(email);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id = 'txt_new_email']"))).sendKeys(email);

	}
	public void clickOnSignin()
	{
		WebDriverWait wait= new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[8]/main/div/div/form/div/div/div[2]/button"))).click();

		
		//driver.findElement(By.xpath("html/body/div[8]/main/div/div/form/div/div/div[2]/button")).click();
	}
	
	
	
		
	

	public void createFName()
	{
		driver.findElement(By.xpath("//input[@id = 'txt_su_firstname']")).sendKeys("Chris");
	}
//	public String verifyFName()
//	{
//		String vfname= driver.findElement(By.xpath("//input[@id = 'txt_su_firstname']")).getText();
//		return vfname;
//		
//	}
	public void createLname()
	{
		driver.findElement(By.xpath("//input[@id = 'txt_su_lastname']")).sendKeys("Bob");
		
		
	}
//	public String verifyLastName()
//	{
//		String vlname = driver.findElement(By.xpath("//input[@id = 'txt_su_lastname']")).getText();
//		return vlname;
//	}
	public void creatEmail()
	{
		 driver.findElement(By.xpath("//input[@id = 'txt_su_email']")).sendKeys("avan.madh@gmai.com");
	}
//	public String validateEmail(String veracc)
//	{
//		if (veracc.equals(driver.findElement(By.xpath("//input[@id = 'txt_su_email']"))))
//				{
//					System.out.println("email is correcct" + veracc);
//				}
//		else
//		{
//			System.out.println("email not valid");
//		}
//		return veracc;
//	}
	public void creatCEmail()
	{
		driver.findElement(By.xpath("//input[@id = 'txt_su_cnfmEmail']")).sendKeys("avan.madh@gmai.com");
	
	}
//	public String validateCEmail()
//	{
//		String cemail = driver.findElement(By.xpath("//input[@id = 'txt_su_cnfmEmail']")).getText();
//		return cemail;
//	}
	public void password()
	{
		driver.findElement(By.xpath("//input[@id = 'txt_su_pwd']")).sendKeys("Star123");
	}
//	public void cPassword()
//	{
//		driver.findElement(By.xpath("//input[@id = 'txt_su_cnfmPwd']")).sendKeys("Star123");
//	}
//	public void clickSubmit()
//	{
//		driver.findElement(By.xpath("html/body/div[8]/main/div/div/form/div/div/div[2]/button")).click();
//	}
///*	public void gender()
//	{
//		if (driver.findElement(By.xpath("(//input[@id = 'female'])[1]")).isSelected())
//		{
//			System.out.println("Female Selected");
//		}
//		else
//		{
//			driver.findElement(By.xpath("(//input[@id = 'male'])[1]")).isSelected();
//		}
//	}
//	public String month(String mon)
//	{
//		Select mn = new Select(driver.findElement(By.xpath("html/body/div[8]/main/div/div/form/div/div/div/fieldset/div[3]/div/div[1]/div[2]/span/span/p")));
//		mn.selectByValue("01");
//		return mon;
//	}
//	public String date(String dat )
//	{
//		Select dt = new Select(driver.findElement(By.xpath("html/body/div[8]/main/div/div/form/div/div/div/fieldset/div[3]/div/div[2]/div[2]/span/span/p")));
//		dt.selectByValue("01");
//		return dat;
//	}
//	*/
//	
}

