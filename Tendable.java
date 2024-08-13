


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Tendable {
	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.tendable.com");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
    
    //Confirm accessibility of the top-level menus
    
   WebElement home = driver.findElement(By.xpath("//a[@class='logo']"));
   home.click();
   
   WebElement ourStory = driver.findElement(By.xpath("//a[text()='Our Story ']"));
   ourStory.click();
    
   WebElement ourSolution = driver.findElement(By.xpath("//a[text()='Our Solution ']"));
   Actions act = new Actions(driver);
   act.moveToElement(ourSolution).perform();
   
   WebElement webPortal = driver.findElement(By.xpath("//a[text()='Web Portal ']"));
   webPortal.click();
   
   WebElement whyTendable = driver.findElement(By.xpath("//a[text()='Why Tendable? ']"));
   whyTendable.click();
   
   
  // verify request demo is present or not 
   
   
   WebElement home1 = driver.findElement(By.xpath("//a[@class='logo']"));
   home1.click();
 
   WebElement requestDemoPage = driver.findElement(By.xpath("//a[text()='Request A Demo']"));
   boolean result = requestDemoPage.isDisplayed();
    
    if(result)
    {
    	System.out.println("Request Demo Page Present");
    }
    
    WebElement ourStory2 = driver.findElement(By.xpath("//a[text()='Our Story ']"));
    ourStory2.click();
    
    WebElement requestDemoPage2 = driver.findElement(By.xpath("//a[text()='Request A Demo']"));
    boolean result2 = requestDemoPage2.isDisplayed();
     
     if(result2)
     {
     	System.out.println("Request Demo Page Present");
     }
     
     WebElement ourSolution3 = driver.findElement(By.xpath("//a[text()='Our Solution ']"));
     Actions act3 = new Actions(driver);
     act3.moveToElement(ourSolution3).perform();
     
     WebElement webPortal3 = driver.findElement(By.xpath("//a[text()='Web Portal ']"));
     webPortal3.click();
    
     WebElement requestDemoPage3 = driver.findElement(By.xpath("//a[text()='Request A Demo']"));
     boolean result3 = requestDemoPage3.isDisplayed();
      
      if(result3)
      {
      	System.out.println("Request Demo Page Present");
      }
      
      WebElement whyTendable4 = driver.findElement(By.xpath("//a[text()='Why Tendable? ']"));
      whyTendable4.click();
      
      WebElement requestDemoPage4 = driver.findElement(By.xpath("//a[text()='Request A Demo']"));
      boolean result4 = requestDemoPage4.isDisplayed();
       
       if(result4)
       {
       	System.out.println("Request Demo Page Present");
       }
    
   //Navigate to the "Contact Us" section, choose "Marketing",
       
     
       WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
       contactUs.click();
       
       JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,400)");
	   
	   Thread.sleep(2000);
       WebElement marketing = driver.findElement(By.xpath("(//button[text()='Contact'])[1]"));
       marketing.click();
       
       
       WebElement fullName = driver.findElement(By.xpath("(//input[@id='form-input-fullName'])[1]"));
       fullName.sendKeys("Komal");
       
       WebElement orgnizationName = driver.findElement(By.xpath("(//input[@id='form-input-organisationName'])[1]"));
       orgnizationName.sendKeys("XYZ");
       
       WebElement phoneNumber = driver.findElement(By.xpath("(//input[@name='cellPhone'])[1]"));
       phoneNumber.sendKeys("1122334455");
       
       WebElement emailID = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
       emailID.sendKeys("komal@gmail.com");
       
       WebElement jobRole = driver.findElement(By.xpath("(//select[@id='form-input-jobRole'])[1]"));
       Select s = new Select(jobRole);
       s.selectByIndex(1);
        
       JavascriptExecutor js1 = (JavascriptExecutor)driver;
       js1.executeScript("window.scrollBy(0,200)");
       
       Thread.sleep(3000);
       WebElement iAgree = driver.findElement(By.xpath("(//input[@id='form-input-consentAgreed-0'])[1]"));
       iAgree.click();
       
       Thread.sleep(3000);
       WebElement submitt = driver.findElement(By.xpath("(//button[@name='form_page_submit'])[1]"));
       submitt.click();
       
       WebElement errorMsgVerify = driver.findElement(By.xpath("//div[@class='ff-form-errors']"));
       
       if(errorMsgVerify.getText().contains("Sorry, there was an error submitting the form. Please try again."))
       {
    	   System.out.println("Verification is Pass");
       }
       else
       {
    	   System.out.println("Verification is Fail");
       }
       
       
       
       
       
       
       
       
       
       

}
}
