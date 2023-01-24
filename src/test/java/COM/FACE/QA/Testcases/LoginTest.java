package COM.FACE.QA.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import COM.FACE.QA.Base.Base;
import COM.FACE.QA.Pages.LoginPage;

public class LoginTest extends Base {

	@BeforeClass
	public void setup() {
		Base.initializebrowser("chrome");
	}
	
	@Test
	public void LoginPageTest() {
		
		LoginPage lp = new LoginPage(driver);
		lp.VerifyFacebookLoginPageFblogo();
		lp.VerifyFacebookLoginPageTagline();
		lp.SetFacebookLoginPageUsername("Sagar");
		lp.SetFacebookLoginPagePassword("12345678");
		lp.VerifyFacebookLoginPageFooterlinks();
		lp.ClickFacebookLoginPageLoginBtn();

	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
}
