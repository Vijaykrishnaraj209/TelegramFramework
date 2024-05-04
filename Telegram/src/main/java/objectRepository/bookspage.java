package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookspage {
	public bookspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(partialLinkText = "Books")
	private WebElement bookslink;
	
	@FindBy(xpath = "//div[@class='page-title']//h1['Books']")
	private WebElement booktitle;

	public WebElement getBooktitle() {
		return booktitle;
	}

	public WebElement getBookslink() {
		return bookslink;
		

	}
	

}
