package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Registerpge {
	
	public Registerpge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement Gendermalebutton;
	
	@FindBy(id = "gender-female")
	private WebElement Genderfemalebutton;
	
	@FindBy(id = "FirstName")
	private WebElement Firstnametextfield;
	
	@FindBy(id = "LastName")
	private WebElement Lastnametextfield;
	
	@FindBy(id = "Email")
	private WebElement Emailtextfield;
	
	@FindBy(id = "Password")
	private WebElement passwordtextfield;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement Confirmpasswordtextfield;
	
	@FindBy (id = "register-button")
	private WebElement Registerbutton;

	public WebElement getGendermalebutton() {
		return Gendermalebutton;
	}

	public WebElement getGenderfemalebutton() {
		return Genderfemalebutton;
	}

	public WebElement getFirstnametextfield() {
		return Firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return Lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return Emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getConfirmpasswordtextfield() {
		return Confirmpasswordtextfield;
	}

	public WebElement getRegisterbutton() {
		return Registerbutton;
	}

	
	
	
}
