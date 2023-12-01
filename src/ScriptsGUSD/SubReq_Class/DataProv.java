package dataPro;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProv {
	
	
	WebDriver driver;
	WebDriverWait wait;
	 
	@BeforeClass
	public void setup()
	{
	
	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
	    ChromeOptions co =new ChromeOptions();
	    co.setBinary("C:\\Users\\BlueOrbit\\Downloads\\chrome-win64\\chrome.exe");
	    driver= new ChromeDriver(co);	
		driver.manage().window().maximize();
		driver.get("https://main.dz66lonf4fc3g.amplifyapp.com/");
	        
	}
	
	public void signInRequestor()
	       {  
		   Duration waitTime = Duration.ofSeconds(120); // 10 seconds
		   //WebDriverWait wait = new WebDriverWait(driver, waitTime);
		   wait= new WebDriverWait(driver, waitTime);
           WebElement elementEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
           elementEmail.sendKeys("sidhantpise001@gmail.com");
     
           WebElement elementPass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
           elementPass.sendKeys("Gusd@2023");
     
           WebElement elementSubmit =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
           elementSubmit.click();
           System.out.println("Sign in the application");   
           }  
	
	public void  Cls_Lnk(){
		   WebElement ReqClass =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/initiator/substituteRequestClassified']")));
	       ReqClass.click();//Initiate New Report
	       System.out.println("Request classified link is clicked!"); 
		   }

	
	public void Scroll_Down()
	       {
		   WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Submit']")); 
           JavascriptExecutor js = (JavascriptExecutor) driver;
           js.executeScript("arguments[0].scrollIntoView(true);", element);
           System.out.println("Scroll down done!");
	       }
	public void overLay()       
	       {    
	       wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("p-datatable-loading-overlay")));
           WebElement elementOvrl = driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']"));
           elementOvrl.click();/// overlay element to disappear 
           }
	 
	public void log_Out()
	       {
		    driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
			//driver.findElement(By.xpath("(//*[@class='mr-3 gusd-logout']/..")).click();
			WebElement elementPr = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(elementPr).click(elementPr);
	        builder.perform();
	        System.out.println("Requestor logged out!");
	       }
	 
	
	public void Submit_AfterSave(){ 
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//i[@class='gusd-edit text-[18px] text-[#667085] font-meduim'])[1])"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@placeholder,'Enter Total Working Hours')]"))).click();
	        Scroll_Down();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Submit']"))).click();
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='add-family-cancel-btn']"))).click();
	        log_Out();
		    }

	 public void Approve() {
		    WebElement EmailAp=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='required-email']")));
		    EmailAp.sendKeys("spise@hexalytics.com");
	        
	        WebElement EmailPass=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
	        EmailPass.sendKeys("Gusd@2023");
	        
	        WebElement sbmt= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	        sbmt.click();
	        System.out.println("Sign in the application as approver");
	        }
  
     @Test(dataProvider="GUSD")
	 public void login(String LO,String SendK,String Info)
	
	
	 {
		System.out.println(LO + SendK +Info);
		
	 }    
	 	 
	 @DataProvider(name="GUSD")
	 public String[] [] getData() throws IOException, InterruptedException{
				
		String path="E:\\BookGusdInput.xlsx";
		Utility util= new Utility(path);
	    int totalrows=util.getRowCount("Gusd Classified");
	    int totalcolm=util.getCellCount("Gusd Classified", 1);
	    
	    String  Data[][]=new String[totalrows][totalcolm];
	 					  
		   for (int i = 0; i < totalrows; i++) {
			    for (int j = 0; j < totalcolm; j++) {
			        Data[i][j] = util.getCellData("Gusd Classified", i + 1, j);
			    }
			    // Printing statements here... 
			} 
	  
		   
		   signInRequestor();
		   Cls_Lnk();
		   
		   {
	       
		   Thread.sleep(2000);
	       driver.findElement(By.xpath(Data[1][0])).click();
	       System.out.println("Initiate New Report is clicked!");
	        
	       WebElement elementAT =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[2][0])));
	       elementAT.sendKeys(Data[2][1]);
	       WebElement elementdrp =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[3][0])));
	       elementdrp.click();
           WebElement eleEmp =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[4][0])));
	       eleEmp.sendKeys(Data[4][1]);
	       WebElement EmpSelect =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[5][0])));
	       EmpSelect.click();
	       WebElement elClassi =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[6][0])));
	       elClassi.sendKeys(Data[6][1]);
	       
	       WebElement elementFdte =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[7][0])));
	       elementFdte.click();
	       WebElement elemtFdte =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[7][1])));
	       elemtFdte.click();
	       System.out.println("From Date selected");
	        
	       WebElement elObj =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[9][0])));
	       elObj.click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath(Data[10][0])).sendKeys(Data[10][1]);
	      
	       WebElement elementReObj =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[11][0])));
	       elementReObj.click();
	       
	       Thread.sleep(2000);
	       driver.findElement(By.xpath(Data[12][0])).sendKeys(Data[12][1]);
	       
	       Thread.sleep(2000);
	       driver.findElement(By.xpath(Data[13][0])).sendKeys(Data[13][1]);
	       Thread.sleep(2000);
	       driver.findElement(By.xpath(Data[14][0])).sendKeys(Data[14][1]);
	       
	       Scroll_Down(); //Scroll down used!       
	       
	       Thread.sleep(2000);
	       WebElement LocArrow =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[15][0])));
	       LocArrow.click();
	       
	       WebElement Loc =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[16][0])));
	       Loc.sendKeys(Data[16][1]);
	       WebElement elLoc =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[17][0])));
	       elLoc.click();
	       
	       driver.findElement(By.xpath(Data[18][0])).sendKeys(Data[18][1]);
	         
	       WebElement AccNo =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[19][0])));
	       AccNo.sendKeys(Data[19][1]);
	       
	       WebElement Princi =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[20][0])));
	       Princi.click();
	       WebElement PrinC =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[21][0])));
	       PrinC.sendKeys(Data[21][1]);
	       WebElement PrinClk =wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Data[22][0])));
	       PrinClk.click();
	       System.out.println("Department Head/principal Selected");
	       
	       Thread.sleep(2000); 
	       driver.findElement(By.xpath(Data[22][1])).click(); 
	       System.out.println("Request Saved!");
	       
	       Thread.sleep(2000); 
	       driver.findElement(By.xpath(Data[23][0])).click();   //back buttton clicked
	       
     	   //overLay();  ////Overlay used 1st time
	     
     	   log_Out();
	       

	  	   return Data;  
	  	      
			
	}
	
		
	
}
}