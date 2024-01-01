package testcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.PracticeFormPage;

public class PracticeFormTest extends TestBase{
	PracticeFormPage a=new PracticeFormPage();
	
	
	@BeforeMethod
	//Initializing the Page Objects:
		@Test
		public void PracticeFormTest1(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		@Test
		public void validatePracticeFprmPage(){
			 driver.getTitle();
		}
		@Test
		public void demoQALogoDisplay(){
			   a.logoDisplay.isDisplayed();
		}
		@Test
		public void ValidFirstName() {
			a.firstname.sendKeys("Dashu");
		}
		@Test
		public void ValidLastName() {
			a.lastName.sendKeys("Choudhari");
		}
		@Test
		public void validEmail() {
			a.email.sendKeys("dashu@gmail.com");
		}
		@Test
		public void selectGender() {
			a.gender.click();
		}
		@Test
		public void enterMobileNumber() {
			a.mobileNumber.sendKeys("9876543211");
		}
		@Test
		public void validDateOfBirth() {
			a.DateOfBirth.sendKeys(Keys.CONTROL,"a");
			a.DateOfBirth.sendKeys("01/01/2001");
		}
		@Test
		public void selectSubject() {
			Select s= new Select(a.subject);
			s.selectByValue("English");
			a.subject.sendKeys(Keys.ENTER);
			
		}
		@Test
		public void selectHobie() {
			a.hobie.click();
		}
		@Test
		public void selectProfilePicture() {
			a.profilePicture.sendKeys("https://www.learningcontainer.com/wp-content/uploads/2020/07/Large-Sample-Image-download-for-Testing.jpg");
					
		}
		@Test
		public void enterAddress() {
			a.address.sendKeys("Kolhapur");
		}
		@Test
		public void selectState() {
			Select s2= new Select(a.state);
			s2.selectByIndex(0);
			a.state.sendKeys(Keys.ENTER);
		}
		@Test
		public void selectCity() {
			Select s3= new Select(a.city);
			s3.selectByIndex(0);
			a.city.sendKeys(Keys.ENTER);
		}
		@Test
		public void clickSubmit() {
			a.submitBtn.click();
		}
		@Test
		public void InvalidSub() {
			if (isPopupPresent(driver)) {

				System.out.println("Test Case Failed: Popup appeared after clicking Submit button");

				//Form submission successful Popup Appeared means Backend is not Validated with valid Credentials 

			}
		}

		private boolean isPopupPresent(WebDriver driver) {
			
			return false;
		}
		
}
