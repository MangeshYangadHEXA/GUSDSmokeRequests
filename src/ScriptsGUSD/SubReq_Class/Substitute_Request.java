package ScriptsGUSD.SubReq_Class;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Substitute_Request {

	
	

	public static void main(String[] args) throws InterruptedException {



		   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver.exe");
		   ChromeOptions co =new ChromeOptions();
		   co.setBinary("C:\\Users\\BlueOrbit\\Downloads\\chrome-win64\\chrome.exe");
			
			//System.setProperty("webdriver.gecko.driver", "E:\\Mangesh\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			//WebDriver driver=new FirefoxDriver();
			
		    WebDriver driver;
		    driver= new ChromeDriver(co);
			
			
			driver.manage().window().maximize();
			driver.get("https://main.dz66lonf4fc3g.amplifyapp.com/");
			System.out.println(driver.getTitle());
	        
			
			
			 Duration waitTime = Duration.ofSeconds(120); // 10 seconds

				WebDriverWait wait = new WebDriverWait(driver, waitTime);
		       
		        
		        WebElement elementEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		        elementEmail.sendKeys("sidhantpise001@gmail.com");
		        
		        WebElement elementPass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		        elementPass.sendKeys("Gusd@2023");
		        
		        WebElement elementSubmit =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		        elementSubmit.click();
		        System.out.println("Sign in the application");
		        
		        WebElement ReqClass =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/initiator/substituteRequestClassified']")));
		        ReqClass.click();//Initiate New Report
		        System.out.println("Request classified link is clicked!");
		          
		        
		        Thread.sleep(4000);
		        driver.findElement((By.xpath("//a[@class='w-full text-center tableBtn blue radius8']"))).click();
		        //WebElement New_Report =wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//a[@class='w-full text-center tableBtn blue radius8']")));
		        //New_Report.click();
		        System.out.println("Initiate New Report is clicked!");
		    
		        String AssignT="Fundamentals of Electronics";
		        WebElement elementAT =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Assignment Title']")));
		        elementAT.sendKeys(AssignT);
		        System.out.println("Assignment title Entered"+AssignT);
		        
		        WebElement elementdrp =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select here'][1]")));
		        elementdrp.click();
		        String emp="Sid, PISE (55611)";
		        WebElement element8 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']")));
		        element8.sendKeys(emp);
		        System.out.println("Employee dropdown displayed!");
		        
		        WebElement eleEmpSel =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Sid, PISE (55611)']")));
		        eleEmpSel.click();
		        System.out.println("Employee selected"+ emp);
		        
		        String classif="Elementary";
		        driver.findElement(By.xpath("//input[@placeholder='Enter Classification']")).sendKeys(classif);
		        driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		        System.out.println("Classification entered" +classif);
		        
		        Thread.sleep(2000);
		        WebElement elementFdte =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='3']")));
		        elementFdte.click();
		        System.out.println("From Date selected");
		        WebElement elementTD =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Thru']")));
		        elementTD.click();
		        System.out.println("To date clicked");
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath(" /html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[3]/span[1]")).click();//This is for date selection static
		        System.out.println("From & to dates selected");
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("(//span[text()='Select here'])[1]")).click();
		        
		        String ReqObj="Code 1";
		        WebElement elementObjc =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'p-dropdown-filter p-inputtext p-component')]")));
		        elementObjc.sendKeys(ReqObj);
		        WebElement elementReObj =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Code 1']")));
		        elementReObj.click();
		        System.out.println("Type of Sub Request/Object Code selected"+ ReqObj);
		        
		        String totalhrs="20";
		        driver.findElement(By.xpath("//input[@placeholder='Enter Total Working Hours']")).sendKeys(totalhrs);
		        System.out.println("Total working hours" +totalhrs);
		        
		        driver.findElement(By.xpath("//input[@placeholder='Start time']")).sendKeys("14:00");
		        System.out.println("Start time inserted 14:00");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//input[@placeholder='End time']")).sendKeys("18:00");
		        System.out.println("End time inserted 18:00");
		        System.out.println("Times Selected!");
		        
		               
		        WebElement element;
		        element =driver.findElement(By.xpath("(//span[text()='Select here'])[2]"));
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();",element );
		        js.executeScript("arguments[0].scrollIntoView(true);", element);
		        System.out.println("Scroll down done!");
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//span[text()='Select here'])[1]")).click();
		        String loc="Franklin elem.";
		        WebElement element14 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'p-dropdown-filter p-inputtext p-component')]")));
		        element14.sendKeys(loc);
		        WebElement element15 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Franklin elem.']")));
		        element15.click();
		        System.out.println("Location is selected is" +loc);
		        
		        String reason="Its specified";
		        driver.findElement(By.xpath("//input[@placeholder='Enter Reason for Absence/Request']")).sendKeys(reason);
		        System.out.println("Reason for request" +reason);
		        
		        /*driver.findElement(By.xpath("//input[@placeholder='Enter Substitute Name']")).sendKeys("JNEC");
		        WebElement element17 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='p-radiobutton-box'])[1]")));
		        element17.click();*/
		        
		        Thread.sleep(2000);	
		        String amtchr="51";
		        driver.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys(amtchr);
		        System.out.println("Account Number(s) To Be Charged" +amtchr);
		        
		        
		        driver.findElement(By.xpath("(//span[text()='Select here'])[1]")).click();//1/
		        Thread.sleep(2000);
		        String deptHead="Sid, PISE (55611)";
		        driver.findElement(By.xpath("//input[contains(@class,'p-dropdown-filter p-inputtext p-component')]")).sendKeys(deptHead);
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//li[@aria-label='Sid, PISE (55611)']")).click();
		        System.out.println("Department Head/principal" +deptHead);
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//a[normalize-space()='Submit']")).click();
		        System.out.println("Request Submitted!");
		        Thread.sleep(5000);
		        
		        driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
				//driver.findElement(By.xpath("(//*[@class='mr-3 gusd-logout']/..")).click();
				WebElement elementPr = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(elementPr).click(elementPr);
		        builder.perform();
		        System.out.println("Requestor logged out!");
		        Thread.sleep(5000);
		        
		        WebElement element111 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		        element111.sendKeys("spise@hexalytics.com");
		        
		        WebElement element112 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		        element112.sendKeys("Gusd@2023");
		        
		        WebElement element113 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		        element113.click();
		        System.out.println("Sign in the application as approver");
		        
		        WebElement ele114 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/initiator/substituteRequestClassified']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']//div[@class='text-[#011834] font-semibold absolute bottom-0 right-0 text-right alert-bg-warp']")));
		        ele114.click();
		        System.out.println("Form link is clicked as classified!");
		        
		        Thread.sleep(1000);
				
		        WebElement ele115 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Requested Reports']")));
		        ele115.click();
		        System.out.println("Redirecte to requested reports!");
		        
		        
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("p-datatable-loading-overlay")));
		        WebElement elementOvrl = driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']"));
		        elementOvrl.click();

		        
		        //driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']")).click();
		        
		        WebElement ele116 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Pending for Principal/Department Head')]")));
		        ele116.click();
		        System.out.println("Status selected 'Pending for Principal/Department Head'");
		        
		        WebElement ele117 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a//i[@class=\"gusd-edit text-[18px] text-[#667085] font-meduim\"])[1]")));
		        ele117.click();
		        System.out.println("Now user is in edit/modify request mode!");
		        
		        WebElement ele118 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[normalize-space()='Initiator']")));
		        ele118.click();
		        
		        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");//this is for scroll
		        Actions ac = new Actions(driver);
		        WebElement live= driver.findElement(By. cssSelector("button[class='text-center flex items-center tableBtn bg-white text-[#039855] border border-[#D0D5DD] radius8']"));
		        ac.moveToElement(live).build().perform();
		        System.out.println("Its scroll down upto the buttons!");
		       
		        driver.findElement(By.xpath("//button//i[@class='pi pi-check mr-1']")).click();
		        System.out.println("Approve button is clicked.");
		        //Alert alert = driver.switchTo().alert();
		        //alert.dismiss();
		        
		        WebElement alertOk =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='border border-[#1E1E1E] text-[#1E3E5A] px-4 py-2 rounded']")));
		        alertOk.click();
		        System.out.println("After submit button Ok button of alert is now clicked");
		        
		        /*Actions action = new Actions(driver);
		        action.moveToElement(driver.findElement(By.xpath("//i[@class='icon userFile_icon']"))).click().perform();
		        e browse!");*/
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
				//driver.findElement(By.xpath("(//*[@class='mr-3 gusd-logout']/..")).click();
				WebElement elementPr2 = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));
		        Actions builder2 = new Actions(driver);
		        builder2.moveToElement(elementPr2).click(elementPr2);
		        builder2.perform();
		        System.out.println("Approver logged out!");
		        Thread.sleep(5000);
		        
		        
		         
		        WebElement AckEmail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		        AckEmail.sendKeys("spnrl33333@gmail.com");
		        
		        WebElement AckPass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		        AckPass.sendKeys("Gusd@2023");
		        
		        WebElement AckSubmit =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		        AckSubmit.click();
		        System.out.println("Sign in the application");
		        
		        WebElement AckClass =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/initiator/substituteRequestClassified']")));
		        AckClass.click();//Initiate New Report
		        System.out.println("Request classified link is clicked!");        	        		        	        		       
 
		        WebElement statu =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")));
		        statu.click();
		        
		        WebElement statuPA =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Pending for Acknowledgement')]")));
		        statuPA.click();
		        
		        WebElement statuPA1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr[@draggable='false']//i[@class='gusd-edit text-[18px] text-[#667085] font-meduim'])[1]")));
		        statuPA1.click();
		        
		        
		        
		        
	}

}
