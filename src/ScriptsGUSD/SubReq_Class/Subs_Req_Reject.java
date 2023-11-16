package SubReq_Class;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Subs_Req_Reject {

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
	        
			
			
			 Duration waitTime = Duration.ofSeconds(80); // 10 seconds

			 WebDriverWait wait = new WebDriverWait(driver, waitTime);
		       
		        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		        element1.sendKeys("sidhantpise001@gmail.com");
		        
		        WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		        element2.sendKeys("Gusd@2023");
		        
		        WebElement element3 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		        element3.click();
		        System.out.println("Sign in the application");
		        
		       
		        WebElement element4 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/initiator/substituteRequestClassified']")));
		        element4.click();
		        System.out.println("Form link is clicked!");
		        
		        Thread.sleep(5000);
		        driver.findElement(By.xpath("//i[@class='gusd-pluse-circle mx-1.5 ']")).click();		        
		        //WebElement element5 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='gusd-pluse-circle mx-1.5 ']")));
		        //element5.click();
		        System.out.println("Initiate new request button clicked!");
		    
		        String AssignTi="Signals & systems";
		        WebElement element6 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter Assignment Title']")));
		        element6.sendKeys(AssignTi);
		        System.out.println("Assignment title Entered." +AssignTi);
		        
		        WebElement elemSel =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select here'][1]")));
		        elemSel.click();
		        
		        String Emp="Sid, PISE (55611)";
		        WebElement element8 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']")));
		        element8.sendKeys(Emp);
		        
		        WebElement element9 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Sid, PISE (55611)']")));
		        element9.click();
		        System.out.println("Employee selected" +Emp);
		        
		        String classif ="Intermediate";
		        driver.findElement(By.xpath("//input[@placeholder='Enter Classification']")).sendKeys(classif);
		        System.out.println("Classification entered "+classif);
		        driver.findElement(By.xpath("//input[@placeholder='From']")).click();
		        
		        
		        WebElement FrmDt =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='3']")));
		        FrmDt.click();
		        System.out.println("From Date selected");
		        WebElement element11 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Thru']")));
		        element11.click();
		        System.out.println("To date clicked");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath(" /html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[3]/span[1]")).click();//This is for date selection static
		        System.out.println("From & to dates selected");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//span[text()='Select here'])[1]")).click();
		        
		        WebElement element12 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'p-dropdown-filter p-inputtext p-component')]")));
		        element12.sendKeys("Code 1");
		       
		        WebElement element13 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Code 1']")));
		        element13.click();
		         
		        driver.findElement(By.xpath("//input[@placeholder='Enter Total Working Hours']")).sendKeys("20");
		        driver.findElement(By.xpath("//input[@placeholder='Start time']")).sendKeys("14:00");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//input[@placeholder='End time']")).sendKeys("18:00");
		        System.out.println("Times Selected!");
		       
		        WebElement element;
		        element =driver.findElement(By.xpath("(//span[text()='Select here'])[2]"));
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].click();",element );
		        js.executeScript("arguments[0].scrollIntoView(true);", element);
		        
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("(//span[text()='Select here'])[1]")).click();
		        
		        WebElement element14 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'p-dropdown-filter p-inputtext p-component')]")));
		        element14.sendKeys("Franklin elem.");
		        
		        WebElement element15 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Franklin elem.']")));
		        element15.click();
		       
		        driver.findElement(By.xpath("//input[@placeholder='Enter Reason for Absence/Request']")).sendKeys("22");
		        
		        Thread.sleep(2000);	
		        driver.findElement(By.xpath("(//input[@placeholder='Type here'])[1]")).sendKeys("51");//
		        driver.findElement(By.xpath("(//span[text()='Select here'])[1]")).click();//1/
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//input[contains(@class,'p-dropdown-filter p-inputtext p-component')]")).sendKeys("Sid, PISE (55611)");
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//li[@aria-label='Sid, PISE (55611)']")).click();
		        driver.findElement(By.xpath("//a[normalize-space()='Submit']")).click();
		        
		        System.out.println("Request Submitted!");
		        Thread.sleep(3000);
		        
		        driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
				WebElement elementPr = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));
		        Actions builder = new Actions(driver);
		        builder.moveToElement(elementPr).click(elementPr);
		        builder.perform();//This is for logout
		        System.out.println("Requester Logged out");
 		        Thread.sleep(1000);
		        
		        WebElement element111 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		        element111.sendKeys("spise@hexalytics.com");
		        
		        WebElement element112 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		        element112.sendKeys("Gusd@2023");
		        
		        WebElement element113 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		        element113.click();
		        System.out.println("Sign in the application");
		        
		        WebElement element114 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/initiator/substituteRequestClassified']")));
		        element114.click();
		        System.out.println("Sub req classified link is clicked!");
		        Thread.sleep(1000);
				
		        WebElement element115 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Requested Reports']")));
		        element115.click();
		      
		        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("p-datatable-loading-overlay")));
		        WebElement elementol = driver.findElement(By.xpath("//div[@class='p-dropdown-trigger']"));
		        elementol.click();
		        
		        WebElement element120 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Pending for Principal/Department Head')]")));
		        element120.click();
		        
		        WebElement element116 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a//i[@class=\"gusd-edit text-[18px] text-[#667085] font-meduim\"])[1]")));
		        element116.click();
		              
		        WebElement element117 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-tag p-component p-tag-info']//span[@class='p-tag-value'][normalize-space()='Submitted']")));
		        element117.click();

                ((JavascriptExecutor) driver).executeScript("scroll(0,500)");//this is for scroll
		        Actions ac = new Actions(driver);
		        WebElement live= driver.findElement(By. cssSelector(".mb-10.px-5.py-3.grid.grid-cols-3.gap-2"));
		        ac.moveToElement(live).build().perform();
		       
		        driver.findElement(By.xpath("//a//i[@class='gusd-close mr-1']")).click();
		        
		        Thread.sleep(1000);
		        WebElement element118 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter the Reason for Rejection']")));
		        element118.sendKeys("Its test purpose!");
		        
		        driver.findElement(By.xpath("//button[@class='bg-[#113699] border border-[##113699] text-white px-8 py-2 rounded']")).click();
		        
		        driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
				
				WebElement elementPro = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));
		        Actions builder1 = new Actions(driver);
		        builder1.moveToElement(elementPro).click(elementPro);
		        builder1.perform();//This is for logout
		        System.out.println("Requester Logged out");
		        
		        Thread.sleep(1000);
		        WebElement element221 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		        element221.sendKeys("sidhantpise001@gmail.com");
		        
		        WebElement element222 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		        element222.sendKeys("Gusd@2023");
		        
		        WebElement element223 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		        element223.click(); 
		        System.out.println("Sign in the application");
		        
		        WebElement element224 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/initiator/substituteRequestClassified']")));
		        element224.click();
	 
	}
}
