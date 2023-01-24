package COM.FACE.QA.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import COM.FACE.QA.Base.Base;
import COM.FACE.QA.Pages.RegistrationPage;

public class RegistrationTest extends Base{

	@BeforeClass
	public void setup() {
		Base.initializebrowser("chrome");
	}
	
	@Test
	public void FacebookRegistrationPageTest() {
		
		RegistrationPage rgpage = new RegistrationPage(driver);
		rgpage.ClickFacebookSignupLink();
		rgpage.VerifyFacebookRegistrationPageFblogo();
		rgpage.VerifyFacebookRegistrationPageAllreadyAccount();
		rgpage.SetFacebookRegistrationPageFirstname();
		rgpage.SetFacebookRegistrationPageLastname();
		rgpage.SetFacebookRegistrationPageMobileEmail();
		rgpage.SetFacebookRegistrationPagePassword();
		rgpage.SetFacebookRegistrationPageBirthDate();
		rgpage.SetFacebookRegistrationPageBirthMonth();
		rgpage.SetFacebookRegistrationPageBirthYear();
		rgpage.SetFacebookRegistrationPageGender("MALE");
		rgpage.ClickFacebookRegistrationPageSubmitBtn();
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
