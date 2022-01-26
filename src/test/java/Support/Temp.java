package Support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Temp 
{

public static void main(String[]args) 
{
	
	System.setProperty("Webdriver.chrome.driver", "D:\\Automation Support\\eclipse\\chromedriver.exe");
	
	
	ChromeDriver obj = new ChromeDriver();
	
	obj.manage().window().maximize();
	obj.navigate().to("https://www.flipkart.com/"); //url
	obj.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit wait
	obj.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();//click on cancel
	
	Actions obj2 = new Actions (obj);  //for move to element actions class
	
    WebElement obj3 =obj.findElementByXPath("//*[@class='_1_3w1N']");
	
	obj2.moveToElement(obj3).build().perform(); // mouse move on login


	WebElement obj4= obj.findElementByXPath("(//*[@class='_3vhnxf'])[1]");
	 obj2.moveToElement(obj4).build().perform(); //mouse move on my profile
              obj4.click();

              
   obj.findElementByXPath("(//*[@type='text'])[2]").sendKeys("9359363302");//login activity
   obj.findElementByXPath("//*[@type='password']").sendKeys("999999999");//login activity
   obj.findElementByXPath("(//*[@type='submit'])[2]").click();//login activity





}
	
	
}
