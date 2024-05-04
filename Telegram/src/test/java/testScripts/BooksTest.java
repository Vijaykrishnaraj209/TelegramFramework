
package testScripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.bookspage;
import objectRepository.welcomepge;

public class BooksTest {
	@Test
	public void BookTest_001() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		welcomepge welcome=new welcomepge(driver);
		bookspage books=new bookspage(driver);
		
		welcome.getBookslink().click();
		if(books.getBooktitle().getText().equals("Books"))
			System.out.println("TEST CASE PASS");
		else
			System.out.println("TEST CASE FAIL");
		
		driver.quit();
	}

}



