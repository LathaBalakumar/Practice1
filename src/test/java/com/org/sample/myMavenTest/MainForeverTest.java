package com.org.sample.myMavenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.org.sample.myMavenTest.Forever2Page;

import com.org.sample.myMavenTest.verifyPage;

public class MainForeverTest {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	// Forever21Test fet;

	Forever2Page forever;
	verifyPage verify;

	//@Parameters({ "url" })
	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.forever21.com/us/shop/Account/Signin");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		forever = new Forever2Page(driver);

		verify = new verifyPage(driver);
	}

	@AfterMethod
	public void Logout() {

		driver.quit();
	}

	//	//@Parameters({ "fname", "lname", "uname", "pwd", "cpwd", "enamil" })
	//	@Test(description = "TC001 : Registration for new user")
	//	public void registerForAdmin(String fname, String lname, String pwd, String cpwd, String email) {
	//		fet.loginforever();
	//		fet.createForeverAccount();
	//		fet.signin();
	//		fet.createFName();
	//		fet.createLname();
	//		fet.creatEmail();
	//		fet.creatCEmail();
	//
	//	}
	//
	//	@Parameters({ "fname", "lname", "exp", "expPwd", "expCpwd", "expEmail" })
	//	@Test(description = "TC002: Verify Profile tab Data", dependsOnMethods = { "loginforever" })
	//	public void verifyDataInProfileTab(String fname, String lname, String pwd, String cpwd, String email, String cEmail)
	//			throws InterruptedException {
	//
	//		sa.assertEquals(fname, fet.createFName());
	//		sa.assertEquals(lname, fet.createLname());
	//		sa.assertEquals(pwd, fet.cPassword());
	//		sa.assertEquals(cpwd, fet.creatCEmail());
	//		sa.assertEquals(email, fet.creatEmail());
	//		sa.assertEquals(cEmail, fet.creatCEmail());
	//		sa.assertAll();
	//	}

	@Test
	public void verifyEmail(){

		String str = "avan.madh@gmail.com";

		forever.provideEmail(str);
		forever.clickOnSignin();
		verify.handlePopup();


		String emailDisplayed = verify.verifyAccount();

		sa.assertEquals(str, emailDisplayed);
	}

}
