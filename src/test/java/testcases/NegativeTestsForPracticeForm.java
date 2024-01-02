package testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.PracticeFormPage;

public class NegativeTestsForPracticeForm  extends TestBase{
	
PracticeFormPage a=new PracticeFormPage();
	
	
	@BeforeMethod
	//Initializing the Page Objects:
		@Test
		public void PracticeFormTest1(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		@Test
		public void PracticeFormPage(){
			 driver.getTitle();
		}
		@Test
		public void demoQALogoDisplay(){
			   a.logoDisplay.isDisplayed();
		}
		@Test
		public void InValidFirstName() {
			a.firstname.sendKeys("Da shu");
		}
		@Test
		public void InValidLastName() {
			a.lastName.sendKeys("123");
		}
		@Test
		public void InvalidEmail() {
			a.email.sendKeys("dashu @gmail.com");
		}
		
		public void selectGender() {
			a.gender.click();
		}
		@Test
		public void InvalidmobileNumber() {
			a.mobileNumber.sendKeys("0000000000");
		}
		@Test
		public void InvalidDateOfBirth() {
			a.DateOfBirth.sendKeys(Keys.CONTROL,"a");
			a.DateOfBirth.sendKeys("");
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
		public void emtyAddress() {
			a.address.sendKeys(" ");
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

				//Form submission successful Popup Appeared means Backend is not Validated with Invalid Credentials 


			} else {

				System.out.println("Test Case Passed: No popup appeared after clicking Submit button");
			}

		}
		private static  boolean isPopupPresent(WebDriver driver2) {
			try {
				Alert a=driver.switchTo().alert();
				a.accept();
				return true;
			} catch (Exception e) {

				return false;
			}

		}
		

}
