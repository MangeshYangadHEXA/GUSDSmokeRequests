package SubReq_Certificate;

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

public class Rejected {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.setBinary("D:\\chrome-win64\\chrome.exe");


		WebDriver driver = new ChromeDriver(co);
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

		WebElement element4 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/substitute_request_certificated']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']")));
		element4.click();
		System.out.println("Form link is clicked!");

		WebElement element5 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "//a[@class='w-full text-center tableBtn blue radius8']")));
		element5.click();
		Thread.sleep(5000);
System.out.println("Redirected to New page");

		WebElement element6 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath( "(//input[@id='employee'])[1]")));
		element6.sendKeys("General Knowledge");
		System.out.println("Info added");
Thread.sleep(2000);

		WebElement element7 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='dept'])[1]")));element7.click();
		System.out.println("write dept Name");
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
		System.out.println("login with second Approval");
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
		System.out.println("Date selected");
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
		System.out.println("click on profile");
		WebElement element = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));//logout.
		Actions builder = new Actions(driver);
		builder.moveToElement(element).click(element);
		builder.perform();

		WebElement element18 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		element18.sendKeys("spise@hexalytics.com");
		System.out.println("last Approval Login");

		WebElement element19 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		element19.sendKeys("Gusd@2023");
		System.out.println("Enter the password");
		WebElement element20 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		element20.click();
		System.out.println("Sign in ");

		WebElement element21 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/substitute_request_certificated']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']")));
		element21.click();
		System.out.println("Form link is clicked!");
		Thread.sleep(10000);

		WebElement element23 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']")));
		element23.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[text()='Pending for Approval Site Admin/Dept Head']")).click();
		Thread.sleep(10000);
		System.out.println("Pending for Approval");
		WebElement element24 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a//i[@class=\"gusd-edit text-[18px] text-[#667085] font-meduim\"])[1]")));
		element24.click();//edit button

		WebElement element25 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='w-full border text-[red] mt-10 border-[#D0D5DD] shadow-[0px_1px_2px_rgba(16,24,40,0.05)] font-medium flex items-center py-[10px] px-[8px] rounded-[8px] justify-center']")));
		element25.click();
		System.out.println("add ");

		WebElement element37 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter the Reason for Rejection']")));
		element37.sendKeys("Not added proper documentation!");
		driver.findElement(By.xpath("//button[@class='bg-[#113699] border border-[##113699] text-white px-8 py-2 rounded']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='bg-[#113699] border border-[##113699] text-white px-8 py-2 rounded']")).click();
		System.out.println("Rejected Status");



		driver.findElement(By.xpath("(//*[@class='p-image p-component'])[1]")).click();//profile
		WebElement element38 = driver.findElement(By.xpath("//*[@class='mr-3 gusd-logout']/.."));//logout.
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(element38).click(element38);
		builder1.perform();
		WebElement element39 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='required-email']")));
		element39.sendKeys("sidhantpise001@gmail.com");

		WebElement element40 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));
		element40.sendKeys("Gusd@2023");

		WebElement element41 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		element41.click();
		System.out.println("Sign in the application");

		WebElement element42 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/substitute_request_certificated']//div[@class='bg-[#F9FBFF] xl:p-[1.250vw] p-[20px] box-shadow rounded-lg relative xl:h-[8.833vw] h-[160px]']")));
		element42.click();
		System.out.println("Form link is clicked and End the Scripts!!!");


	}

}
