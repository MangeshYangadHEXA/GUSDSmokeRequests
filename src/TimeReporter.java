package hexalyticsproj.hexalyticsproj; 
import java.text.Format;
import java.text.SimpleDateFormat;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TimeReporter {

	public static int generateUniqueId() {      
		UUID idOne = UUID.randomUUID();
		String str=""+idOne;        
		int uid=str.hashCode();
		String filterStr=""+uid;
		str=filterStr.replaceAll("-", "");
		return Integer.parseInt(str);
	}


	public static void main(String args[]) throws InterruptedException, FileNotFoundException, IOException 
	{
		System.setProperty("webdriver.chrome.driver",".\\resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));

		Properties props=new Properties();
		props.load(new FileReader("./resources/testdata/qa.properties"));

		//Launch the application
		driver.get(props.getProperty("App_URL"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.id("required-email")).sendKeys(props.getProperty("Username"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(props.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


		// Clicking on Time Report
		driver.findElement(By.xpath("//div[@id=\"root\"]//div[10]//a/div")).click();
		Thread.sleep(10000);


		//Initiating new report
		driver.findElement(By.partialLinkText("Initiate New Report")).click();
		WebElement nameofschool_dropdown = driver.findElement(By.xpath("//*[@id=\"dept\"]/span"));
		//WebElement nameofschool_dropdown = driver.findElement(By.xpath("//div[@id=\"dept\"]/../../label[contains(text(),\"Name of School\")]"));
		nameofschool_dropdown.click();

		driver.findElement(By.xpath("//ul[@role='listbox']/li[contains(text(),'Balboa elem. ')]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Date Range\"]")).sendKeys("11/08/2023 - 11/09/2023");	
		driver.findElement(By.xpath("//*[@id=\"employee\"]/span")).click();
		driver.findElement(By.xpath("//li[@aria-label=\"Certificated\"]")).click();

		//Generation Unique Account
		driver.findElement(By.xpath("//input[@placeholder=\"Account\"]")).sendKeys("12345");

		// Rate type
		driver.findElement(By.xpath("(//*[@id=\"dept\"])[2]")).click();
		driver.findElement(By.xpath("//ul/li[text()=\"Daily Rate\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"employee\" and @placeholder=\"Daily Rate\"]")).sendKeys("100");

		Format f = new SimpleDateFormat("MM/dd/yyyy");
		String BrdRprtDate = f.format(new Date());

		//Authorizing board report date selection		
		driver.findElement(By.xpath("//input[@class=\"p-inputtext p-component\"]")).sendKeys(BrdRprtDate);
		driver.findElement(By.xpath("//input[@id=\"employee\" and @placeholder=\"Page No.\"]")).sendKeys("1");

		driver.findElement(By.xpath("(//*[@id=\"dept\"]/span[text()=\"Select\"])[1]")).click();
		WebElement element = driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\" and @aria-label=\"Innive, POOJA (888)\"]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\" and @aria-label=\"Innive, POOJA (888)\"]")).click();
		Thread.sleep(2000);

		//Not mandatory field
		//driver.findElement(By.xpath("(//span[text()=\"Select\"])[5]")).click();
		//driver.findElement(By.xpath("//input[@class=\"p-dropdown-filter p-inputtext p-component\"]")).sendKeys("888");
		//driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\" and @aria-label=\"Innive, POOJA (888)\"]")).click();

		//Name of the Employee
		driver.findElement(By.xpath("(//child::span[@class=\"p-dropdown-label p-inputtext p-placeholder\"])[2]")).click();
		driver.findElement(By.xpath("//li[@class=\"p-dropdown-item\" and @aria-label=\"Abc1234 (1234)\"]"));

		//Clicking on Save button
		js.executeScript("window.scrollBy(0,350)", "");
		driver.findElement(By.xpath("//i[@class=\"pi pi-save mr-1\"]")).click();
		Thread.sleep(5000); 

		// Click on Back button
		driver.findElement(By.xpath("//a[text()=\"Back\"]")).click();
		WebElement status =driver.findElement(By.xpath("//span[@class=\"p-tag-value\"]"));
		Assert.assertTrue(status.getText().equals("Pending"));

		//Click on Edit button
		driver.findElement(By.xpath("//a[@class=\"py-2 px-2.5\"]/..")).click();
		Thread.sleep(7000); 

		// Clicking on Submit
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		driver.findElement(By.xpath("//*[@id=\"root\"]//div/a[text()=\"Submit\"]")).click();

		// Click on Send button on Modal
		driver.findElement(By.xpath("//a[text()='Send']")).click();
		Thread.sleep(7000);
		WebElement status2 =driver.findElement(By.xpath("//span[@class=\"p-tag-value\"]"));
		Assert.assertTrue(status2.getText().equals("Submitted"));

		driver.findElement(By.xpath("//button[@id=\"headlessui-menu-button-:r1:\"]/span/i")).click();
		driver.findElement(By.xpath("//a[contains(text(),\"Log out\")]")).click();  

		// Login with First Approver

		driver.findElement(By.id("required-email")).sendKeys(props.getProperty("First_Approvar"));
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(props.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(10000);

		// Clicking on Time Report
		WebElement timeReport=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/time_report']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']//div[@class='text-[#011834] font-semibold absolute bottom-0 right-0 text-right alert-bg-warp']")));
		timeReport.click();
		WebElement tabReqstdReprt = driver.findElement(By.xpath("//span[text()=\"Requested Reports\"]"));
		Thread.sleep(5000);
		tabReqstdReprt.click();
		
		
		 WebElement status3=driver.findElement(By.xpath("//span[@class=\"p-tag-value\"]"));
		 Assert.assertTrue(status3.getText().equals("Pending for Approval"),"Pending for Approval status found");
		 //driver.findElement(By.xpath("//tr[@draggable='false']//i[@class='gusd-edit text-[18px] text-[#667085] font-meduim']")).click();
		 
		 //Closing the browser
		 driver.close();

	}

}
