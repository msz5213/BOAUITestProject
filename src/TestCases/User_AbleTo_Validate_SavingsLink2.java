package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class User_AbleTo_Validate_SavingsLink2 extends BaseTest {
	
	@Test
	public void user_AbleTo_Validate_SavingsLink2() throws InterruptedException{
			
		WebElement bankingLink = driver.findElement(By.xpath("//*[@id='hp-section-2']/form/ul/li[1]/a"));
		WebElement savingsLink = driver.findElement(By.xpath("//*[@id='pm-submenu-first']/div[1]/a[2]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(bankingLink).build().perform();
		act.moveToElement(savingsLink).click().perform();
		//act.click().perform();
		
		WebElement headerOfZipcode = driver.findElement(By.xpath("//*[@id='zipSelectModal']/h3"));
		System.out.println(headerOfZipcode.isDisplayed());
		
		Thread.sleep(2000);

		
		

	}

}
