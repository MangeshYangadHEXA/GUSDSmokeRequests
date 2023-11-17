package WAR_Classified;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WARclassSmoke_AppReject {
	public static WebDriver driver;
	public static String UN=".//*[@id='required-email']";
	public static String PSW=".//*[@type='password']";
	public static String Login=".//*[@type='submit']";
	public static	 String Password = "Gusd@2023";
	public static String WAR_Class=".//*[text()='Weekly Absence Report-Classified']";
	
	public static void main(String[] args) throws InterruptedException {

		 String URL = "https://main.dz66lonf4fc3g.amplifyapp.com/";
		  String Profile="(//*[@class='p-image p-component'])[1]";
			String Logout="//*[text()='Log out']";
	String SchoolName="Business & financial services";
		 String EMPName="again last name, AGAIN FIRST NAME (again 001)";
			String Approver_Name="Innive, POOJA (888)"; 
			 String	InitiatorButton="//*[text()=' Initiate New Report']";
			 String	School_dept=".//*[@id='dept']";
			 String	selectDD_Option="(//*[@class='p-dropdown-items']/*)[3]";
			  String	Emp_Name="//*[text()='Name of the Employee ']/..//*[@id='employee']";
			 String	Approver="//*[text()='Name of the Approver']/..//*[@id='employee']";
			  String	searchName=".//*[@class='p-dropdown-filter-container']/*[1]";
			  String		select1Approver="(//*[@class='p-dropdown-items']/*)[1]";
			 String PeriodDropDown="//*[text()='Period ']/../..//*[@class='p-inputtext p-component']";
			  String selectdate="((//*[@class=\"p-datepicker-group\"])[2]//tr[2]/td[2])[1]";
		      String		selectabsenceDate="((//*[@class=\"p-datepicker-group\"])[1]//tr[2]/td[4])[1]";
			 String	selectAbsenceCodeDD="(//*[text()='Absent Code ']/..//*[text()='Select an Absent Code'])[2]";
			 String	Substitute="//*[@id='substitute']";
			  String	Hours="(//*[@class='p-inputtext p-component p-filled p-inputnumber-input'])[1]";
			 String	Minutes="(//*[text()='Total Hours']/..//*[@role='spinbutton'])[2]";
			 String	ApplyBtn="//*[@aria-label='Apply']";
			 String	SaveBtn="//*[text()='Save']";
			 String	BackBtn="//*[@class='flex flex-wrap justify-between items-center']//*[text()='Back']/i";
			  String	Action1Edit="(//*[@href='/initiator/weekly_absence_report']/i[contains(@class, 'gusd-edit')])[1]";
			 String ApproverSubmittedOn="(//*[@class='p-datatable-tbody']/tr/td[4])[1]";
			 String Status="(//*[@class='p-datatable-tbody']/tr//span[@class='p-tag-value'])[1]";
			  String submitbtn="//*[text()='Submit']";
			 String SendBtn="//*[text()='Send']";
			 String	ApproverAction1Edit= "(//*[@href='/approver/weekly_absence_report']/i[contains(@class, 'gusd-edit')])[1]";
		    String RejectBtn="//*[text()='Reject']";
		    String NameofEMP="(//*[@role='complementary']//*[@role='cell'])[1]";
		    String RejectReason="//*[@placeholder='Enter the Reason for Rejection']";
		    String RejectionSendBtn="//*[text()='Send']";
	String RejectionOkBtn="//*[text()='Ok']";
		    
	//Launch Chrome

	System.setProperty("webdriver.chrome.driver","C:\\Users\\SHRUTI BHAVI\\OneDrive\\Documents\\Chrome\\chromedriver-win64\\chromedriver.exe");
	  driver=new ChromeDriver(); 
	  driver.manage().window().maximize(); 
	driver.navigate().to(URL);
	  
	//Login to GUSD and Navigate to WAR_Class  
	  LoginGUSD_WarClass("rtiria@hexalytics.com");  
	   
  //Click on Initiator
    WebElement element1 = driver.findElement(By.xpath(InitiatorButton));
    JavascriptExecutor js2= (JavascriptExecutor) driver;
	       js2.executeScript("arguments[0].click();", element1);
	       
//select school
    driver.findElement(By.xpath(School_dept)).click(); 
    driver.findElement(By.xpath(searchName)).sendKeys(SchoolName);
    driver.findElement(By.xpath(select1Approver)).click(); 
//select Empl
    driver.findElement(By.xpath(Emp_Name)).click(); 
    driver.findElement(By.xpath(searchName)).sendKeys(EMPName);
    driver.findElement(By.xpath(select1Approver)).click(); 
   //select Approver
    driver.findElement(By.xpath(Approver)).click(); 
    driver.findElement(By.xpath(searchName)).sendKeys(Approver_Name);
    driver.findElement(By.xpath(select1Approver)).click(); 
    //select Period
    driver.findElement(By.xpath(PeriodDropDown)).click(); 
    driver.findElement(By.xpath(selectdate)).click(); 
    driver.findElement(By.xpath("//*[text()='Select Period']")).click();
    Thread.sleep(3000);
    //select Absence date
    driver.findElement(By.xpath(selectabsenceDate)).click(); 
    Thread.sleep(1000);
    driver.findElement(By.xpath(selectAbsenceCodeDD)).click(); 
    //select Absence code and enter timings and click on apply
    driver.findElement(By.xpath(selectDD_Option)).click(); 
    driver.findElement(By.xpath(Substitute)).sendKeys("Test Substitute name"); 
    driver.findElement(By.xpath(Hours)).click(); 
    driver.findElement(By.xpath(Hours)).sendKeys("5"); 
    driver.findElement(By.xpath(Minutes)).click(); 
    driver.findElement(By.xpath(Minutes)).sendKeys("43"); 
    driver.findElement(By.xpath(ApplyBtn)).click(); 
  
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
  //Click on save
    driver.findElement(By.xpath(SaveBtn)).click();   
    Thread.sleep(10000);
    //click on Back
    WebElement element3 = driver.findElement(By.xpath(BackBtn));
	      // builder.moveToElement(element3).click(element3).perform();
	      
	       JavascriptExecutor js1= (JavascriptExecutor) driver;
	       js1.executeScript("arguments[0].click();", element3);
	  
   //Verify the Pending status
    String status= driver.findElement(By.xpath(Status)).getText();
		if (status.equals("Pending"))
    {
	        	 System.out.println("New Form Created and its in Pending state");
	         driver.findElement(By.xpath(Action1Edit)).click();
	         
	      } else {
	    	 
	         System.out.println("New Form Not Created");
	        
	      }
		Thread.sleep(20000);
		//Click on Submit
   driver.findElement(By.xpath(submitbtn)).click();
   driver.findElement(By.xpath(SendBtn)).click();
   Thread.sleep(10000);
   //Verify the Submitted status
   String status1= driver.findElement(By.xpath(Status)).getText();
		 if (status1.equals("Submitted"))
	        { 
		        	 System.out.println("New Form Created and its in Submitted state");

		      } else {
		    	 
		         System.out.println("New Form Not Created");
		        
		      }
		 
//Logout
	        driver.findElement(By.xpath(Profile)).click();
	        driver.findElement(By.xpath(Logout)).click();
	        Thread.sleep(10000);
	 //Login as Approver
	        LoginGUSD_WarClass("poojad@inniveinc.com");
	  //Verify the created date and status
	        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	        Date date = new Date();
	       String date1= dateFormat.format(date);
	       String replacedate=date1.replace('/', ' ');
	       System.out.println(replacedate);
	       
	       String getdate= driver.findElement(By.xpath(ApproverSubmittedOn)).getText();
	       String replacedate1=getdate.replace('/', ' ');
	       System.out.println(replacedate1);
	       String status2= driver.findElement(By.xpath(Status)).getText();
		       if(replacedate.equals(replacedate1) && status2.equals("Pending for Approval"))
		       {
		    	    System.out.println("Able to see form In Approver popup");
		    	    Thread.sleep(10000);
		    	    //Click on Action edit
		    	    driver.findElement(By.xpath(ApproverAction1Edit)).click();
		    	    Thread.sleep(10000);
		       }
		       else {
		    	   System.out.println("Not Able to see form In Approver popup");
		       }
		        
		       String empname= driver.findElement(By.xpath(NameofEMP)).getText();
		
	//Rejection Flow
			if(EMPName.contains(empname))
			{
				System.out.println("Able to see EMP Name as"+empname);
				 driver.findElement(By.xpath(RejectBtn)).click();
				 driver.findElement(By.xpath(RejectReason)).sendKeys("Resject to initiator"); 
				 driver.findElement(By.xpath(RejectionSendBtn)).click();
				 driver.findElement(By.xpath(RejectionOkBtn)).click();
				 
				 Thread.sleep(20000);
			}
			else{
				System.out.println("Employee name not matched"+EMPName +empname);
			}
			
			 String status3= driver.findElement(By.xpath(Status)).getText();
		       if(replacedate.equals(replacedate1) && status3.equals("Rejected"))
		       {
		    	  //&& status2.equals("Pending for Approval")
		    	    System.out.println("Form Is rejected");
		    	   
		       }
		       else {
		    	   System.out.println("Form Not Rejected");
		       }
		       
		       driver.findElement(By.xpath(Profile)).click();
		       Thread.sleep(2000);
		        WebElement element4 = driver.findElement(By.xpath(Logout));
			       JavascriptExecutor js3= (JavascriptExecutor) driver;
			       js3.executeScript("arguments[0].click();", element4);
			   // element4.click();
// Login as Initiator Verify the status
		        LoginGUSD_WarClass("rtiria@hexalytics.com"); 
		        
		        String status4= driver.findElement(By.xpath(Status)).getText();
				if (status4.equals("Rejected"))
		        {
			        	 System.out.println("Form is Rejected by 1st Approver");
			        
			         
			      } else {
			    	 
			         System.out.println("Form is not Rejected by 1st Approver");
			        
			      }
	}
	
	//Login method for GUSD and navigate to WAR-class
	 @SuppressWarnings("deprecation")
	static void LoginGUSD_WarClass(String UserName) throws InterruptedException {
		    
		  driver.findElement(By.xpath(UN)).click();
		  driver.findElement(By.xpath(UN)).sendKeys(UserName);
		  driver.findElement(By.xpath(PSW)).click();
		  driver.findElement(By.xpath(PSW)).sendKeys(Password);
		  driver.findElement(By.xpath(Login)).click();
		  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  WebElement element = driver.findElement(By.xpath(WAR_Class));
	        Actions builder = new Actions(driver);
	        builder.moveToElement(element).click(element);
	        builder.perform();
	        Thread.sleep(20000);
		  }
}


