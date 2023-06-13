package TestNGParametersExample1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ParameterExample {
WebDriver driver;	
@BeforeClass
@Parameters({"browserName", "url"})
public void setup(String bname, String purl) {
	if (bname.equals("Chrome")) {	
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOptions = new ChromeOptions();
	  chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
	driver =new ChromeDriver(chromeOptions);
	}
	else if(bname.equals("edge"))
	{	
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		}
	else
	{
		WebDriverManager.firefoxdriver().setup();
   driver= new FirefoxDriver();
   }
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get(purl);
	driver.manage().window().maximize();
	}

  @Test(priority=1)
  public void Login() throws InterruptedException {
driver.findElement(By.id("email")).sendKeys("narinder.gupta@gmail.com");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Americaisbest23?");
driver.findElement(By.name("login")).click();
Thread.sleep(3000);
String titleExp="(20+) Facebook";
String titleAct=driver.getTitle();
Assert.assertEquals(titleExp, titleAct);

  }
  
  @AfterClass
 public void teardown() {	  
	  driver.quit();
	  System.out.println("test completed");
  }
}
