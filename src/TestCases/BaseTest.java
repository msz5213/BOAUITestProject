package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	
 @BeforeClass
 public void beforeClass(){
	    String baseDir = System.getProperty("user.dir");
		String chromePath = baseDir + "\\driverServer\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		
	    driver = new ChromeDriver();

 }
 @BeforeMethod
 public void beforeMethod(){
	    driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
		
		String titleValidation = driver.getTitle();
		System.out.println(titleValidation);
 }
 @AfterMethod
 public void afterMethod(){
	 System.out.println("Method is completed!");
 }
 
 @AfterClass
 public void afterClass(){
	 driver.close();
	 driver.quit();
 }


}
