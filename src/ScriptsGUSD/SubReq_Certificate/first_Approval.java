package SubReq_Certificate;

import java.io.FileNotFoundException;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;


public class first_Approval {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.setBinary("D:\\chrome-win64\\chrome.exe");


		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.get("https://main.dz66lonf4fc3g.amplifyapp.com/");

		System.out.println(driver.getTitle());


		Duration waitTime = Duration.ofSeconds(50); // 10 seconds

		//WebDriverWait wait = new WebDriverWait(driver, waitTime);

		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		element1.sendKeys("sidhantpise001@gmail.com");

		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		element2.sendKeys("Gusd@2023");

		WebElement element3 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		element3.click();
		System.out.println("Sign in the application");

		WebElement element4 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/substitute_request_certificated']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']")));
		element4.click();
		System.out.println("Form link is clicked!");
		Thread.sleep(10000);
		WebElement element5 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//a[@class='w-full text-center tableBtn blue radius8']")));
		element5.click();
		Thread.sleep(5000);
		System.out.println("Redirected to New page");

		WebElement element6 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "(//input[@id='employee'])[1]")));
		element6.sendKeys("Biology");
		System.out.println("Info added");

		Thread.sleep(2000);

		WebElement element7 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='dept'])[1]")));element7.click();
		Thread.sleep(3000);
		WebElement element8 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='p-dropdown-filter-container']/*[1]")));
		element8.sendKeys("Business operations");
		Thread.sleep(3000);
		WebElement element9 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Business operations']")));
		element9.click();


		WebElement element10 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='dept'])[2]")));
		element10.click();
		WebElement element11 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='p-dropdown-filter p-inputtext p-component']")));
		element11.sendKeys("Sid, PISE (55611)");
		WebElement element12 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Sid, PISE (55611)']")));
		element12.click();
		Thread.sleep(3000);

		WebElement element13 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='dept'])[5]")));
		element13.click();
		Thread.sleep(3000);
		//WebElement element14 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@class,'p-dropdown-filter p-inputtext p-component')]")));
		//element14.sendKeys("Abc, KKR (az12)");
		WebElement element15 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='p-dropdown-items']/*)[3]")));
		element15.click();

		WebElement element16 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Select Dates']")));
		element16.click();
		System.out.println(" Date selected");
		WebElement element17 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='6']"))); 
		element17.click();

		driver.findElement(By.xpath("//span[normalize-space()='15']")).click();



		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[3]")).click();
		driver.findElement(By.xpath("//li[@aria-label='AM']")).click();

		driver.findElement(By.xpath("//div[@class='w-full col-span-2']//input[@id='employee']")).sendKeys("Automation Testing demo");
		driver.findElement(By.xpath("//*[@placeholder='Enter Purpose']")).sendKeys("Automation");
		driver.findElement(By.xpath("//span[normalize-space()='Select Funding Account']")).click();
		driver.findElement(By.xpath("//li[@aria-label='School Bussiness']")).click();
		driver.findElement(By.xpath("//div[@id='deleteFun_0']//input[@id='employee']")).sendKeys("123456");
		driver.findElement(By.xpath("//a[@class='text-center text-white tableBtn blue radius8 p-4']")).click();//submit
		driver.navigate().back();
		Thread.sleep(10000);


		driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
		WebElement element = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));//logout.
		Actions builder = new Actions(driver);
		builder.moveToElement(element).click(element);
		builder.perform();

		WebElement element18 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		element18.sendKeys("spise@hexalytics.com");

		WebElement element19 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		element19.sendKeys("Gusd@2023");
		WebElement element20 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		element20.click();
		System.out.println("Sign in the application");

		WebElement element21 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/substitute_request_certificated']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']")));
		element21.click();
		System.out.println("Form link is clicked!");
		Thread.sleep(10000);

		WebElement element22 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")));
		element22.click();

		driver.findElement(By.xpath("//span[text()='Pending for Approval Site Admin/Dept Head']"));
		System.out.println("pending for Approval side");


		WebElement element24 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a//i[@class=\"gusd-edit text-[18px] text-[#667085] font-meduim\"])[1]")));//edit button
		element24.click();
		System.out.println("Add Details");

		WebElement element25 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='w-full border text-[green] mt-10 border-[#D0D5DD] shadow-[0px_1px_2px_rgba(16,24,40,0.05)] font-medium flex items-center py-[10px] px-[8px] rounded-[8px] justify-center']")));
		element25.click();//Approve
		System.out.println("Approve the form!");

		WebElement element26 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='border border-[#1E1E1E] text-[#1E3E5A] px-4 py-2 rounded']")));//Closed
		element26.click();//1st approval done
		System.out.println("First Approval Done!");

		driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
		System.out.println("Click on Profile Picture");

		WebElement element27 = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));//logout
		System.out.println("logout from the page");

		Actions builder1 = new Actions(driver);
		builder1.moveToElement(element27).click(element27);
		builder1.perform();


		WebElement element28 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		element28.sendKeys("spnrl33333@gmail.com");
		System.out.println("Final Approval Login");

		WebElement element29 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		element29.sendKeys("Gusd@2023");
		WebElement element30 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		element30.click();
		System.out.println("Sign in the application");

		WebElement element31 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/substitute_request_certificated']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']")));
		element31.click();
		System.out.println("Form link is clicked!");
		//Thread.sleep(3000);

		WebElement element32 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")));
		element32.click();

		WebElement element33 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@aria-label='Pending for Acknowledgement']//span[contains(text(),'Pending for Acknowledgement')]")));
		element33.click();
		System.out.println("detailed Filled");


		WebElement element34 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a//i[@class=\"gusd-edit text-[18px] text-[#667085] font-meduim\"])[1]")));//edit button
		element34.click();

		WebElement element35 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Acknowledge Report']")));//Acknowledge
		System.out.println("Acknowledgement ");
		element35.click();
		WebElement element36 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='border border-[#1E1E1E] text-[#1E3E5A] px-4 py-2 rounded']")));
		element36.click();//closed
		System.out.println("Application acknowledge");

		driver.navigate().refresh();


	}



}


