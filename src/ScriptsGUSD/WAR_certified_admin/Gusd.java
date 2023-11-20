package WAR_certified_admin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class Gusd {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\vicky\\eclipse-workspace\\automation\\Driver\\msedgedriver.exe");
	
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new EdgeDriver(options);

		driver.get("https://main.dz66lonf4fc3g.amplifyapp.com/");
		driver.manage().window().maximize();
		System.out.println("Gusd Forms initated");
		System.out.println("-------------------");
		Thread.sleep(4000);
		
		WebElement element= driver.findElement(By.id("required-email"));
	    element.sendKeys("rtiria@hexalytics.com");
	    WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
	    pass.sendKeys("Gusd@2023");
	    WebElement but= driver.findElement(By.xpath("//button[@type='submit']"));
	    but.click();
	    System.out.println("Logging in as initiator");
	    Thread.sleep(4000);
	    
	    
	    WebElement element0 = driver.findElement(By.xpath("//div/h4[text()='Weekly Absence Report Certificated Admin']")); 
	    element0.click();
	    Thread.sleep(2000);
	    WebElement element1= driver.findElement(By.xpath("//a[@class='w-full text-center tableBtn blue radius8']"));
	     element1.click();
	     
	     
	     WebElement element2= driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[1]"));
	     element2.click();
	     
	     Thread.sleep(3000);
	     
	     WebElement element3= driver.findElement(By.xpath("//li[text()='Binns elementery school']"));
	     element3.click();
	     
	     Thread.sleep(2000);
	     
	     WebElement element4= driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']"));
	     element4.click();
	     Thread.sleep(2000);
	     WebElement element5= driver.findElement(By.xpath("//li[text()='as, AS (cg)']"));
	     element5.click();
	     Thread.sleep(2000);
	     WebElement element51= driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[3]"));
	     element51.click();
	     Thread.sleep(2000);
	     WebElement element52= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	     element52.sendKeys("pooja");
	     Thread.sleep(2000);
	     WebElement element53= driver.findElement(By.xpath("//li[text()='Innive, POOJA (888)']"));
	     element53.click();
	     Thread.sleep(2000);
	     WebElement element6= driver.findElement(By.xpath("//span[@class='p-calendar p-component p-inputwrapper w-full h-11 p-inputwrapper-filled']"));
	     element6.click();
	     Thread.sleep(5000);
	     WebElement element7= driver.findElement(By.xpath("(//td[@class='p-datepicker-today'])[1]"));
	     element7.click();
	     Thread.sleep(2000);
	     WebElement element8= driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[1]"));
	     element8.click();
	     Thread.sleep(2000);
	     
	     WebElement element9= driver.findElement(By.xpath("//li[text()='District Covid (DC)']"));
	     element9.click();
	     Thread.sleep(2000);
	     
	     WebElement element10= driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']"));
	     element10.click();
	     Thread.sleep(2000);
	     
	     WebElement element11= driver.findElement(By.xpath("//li[text()='Dodge.r (10008)']"));
	     element11.click();
	     Thread.sleep(2000);
	     WebElement element12= driver.findElement(By.id("integeronly"));
		 element12.sendKeys("08");
		 Thread.sleep(1000);
		 WebElement element13= driver.findElement(By.xpath("(//input[@role='spinbutton'])[2]"));
		 element13.sendKeys("25");
		 Thread.sleep(2000);
		 WebElement element14= driver.findElement(By.xpath("//span[@class='p-button-label p-c']"));
	     element14.click();
	     JavascriptExecutor js = (JavascriptExecutor) driver;
	     js.executeScript("window.scrollBy(0,500)");
	     WebElement element15= driver.findElement(By.xpath("//a[@class='font-medium inline-block text-[#FFFFFF] text-xs xl:text-[0.938vw] py-[0.833vw] px-[2.448vw] box-shadow-2 rounded xl:rounded-lg bg-[#113699] border border-[#F2F4F7]']"));
	     element15.click();
	     WebElement element16= driver.findElement(By.xpath("//a[@class='custmBtn3 rounded-lg text-[#FFFFFF] text-center bg-[#113699]']"));
	     element16.click();
	     WebElement element17= driver.findElement(By.xpath("//i[@class='gusd-arrow-down  text-[#4C525F]/60 text-[12px]']"));
	     element17.click();
	     driver.findElement(By.xpath("//div[@class='px-4 py-4']")).click();
	     WebElement element18= driver.findElement(By.id("required-email"));
		 element18.sendKeys("rtiria@hexalytics.com");
		 WebElement pass1= driver.findElement(By.xpath("//input[@type='password']"));
		 pass1.sendKeys("Gusd@2023");
		 WebElement but1= driver.findElement(By.xpath("//button[@type='submit']"));
		 but1.click();
		 System.out.println("Logging in as approver");
		 WebElement element19 = driver.findElement(By.xpath("//div/h4[text()='Weekly Absence Report Certificated Admin']")); 
		 element19.click();
		 WebElement element20 = driver.findElement(By.xpath("//i[@class='gusd-edit text-[18px] text-[#667085] font-meduim']")); 
		 element20.click();
		 js.executeScript("window.scrollBy(0,500)");
		 WebElement element21 = driver.findElement(By.xpath("//button[@class='custmBtn2 border rounded-lg bg-[#006b3c] text-[#ffffff] text-center']")); 
		 element21.click();
		 
		 
	     
	     


	     
	     
		 
	}
}
