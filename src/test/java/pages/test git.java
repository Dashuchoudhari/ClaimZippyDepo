package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class PracticeFormPage extends TestBase{
	
	//Page Factory - OR:
	
	@FindBy(xpath="//header/a[1]/img[1]")
	public WebElement logoDisplay;
	
	@FindBy(xpath="//input[@id='firstName']")
	public WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='userEmail']\"")
	public WebElement email;
	
	@FindBy(xpath="//label[contains(text(),'Male')]")
	public WebElement gender;
	
	@FindBy(xpath="//input[@id='userNumber']")
	public WebElement mobileNumber;
	
	@FindBy(xpath="//input[@id='dateOfBirthInput']")
	public WebElement DateOfBirth;
	
	@FindBy(xpath="//label[contains(text(),'Sports')]")
	public WebElement hobie;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]")
	public WebElement subject;
	
	@FindBy(xpath="//input[@id='uploadPicture']")
	public WebElement profilePicture;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	public WebElement address;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[1]")
	public WebElement state;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[1]")
	public WebElement city;
	
	@FindBy(xpath="//button[@id='submit']")
	public WebElement submitBtn;

	public WebElement getLogoDisplay() {
		return logoDisplay;
	}
	
	
	
	
	
	
	
}
