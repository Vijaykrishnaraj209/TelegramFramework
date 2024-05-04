package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class welcomepge {
	
	public welcomepge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement Registerlink;
	
	public WebElement getBookslink() {
		return bookslink;
	}
	

	@FindBy(linkText = "Log in")
	private WebElement Loginlink;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchtextfield;
	
	@FindBy(xpath = "//input[@class='button-1 search-box-button']")
	private WebElement searchbutton;
	
	@FindBy(partialLinkText = "Books")
	private WebElement bookslink;

	public WebElement getSearchbutton() {
		return searchbutton;
	}

	public WebElement getRegisterlink() {
		return Registerlink;
	}

	public WebElement getLoginlink() {
		return Loginlink;
	}

	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

}
