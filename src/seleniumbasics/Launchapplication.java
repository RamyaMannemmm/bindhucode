package seleniumbasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Launchapplication {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		invokebrowser("firefox");
		
		driver.get("https://demoqa.com/elements");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//gettitle();
		
		//manage();
		
		//findelement();
		
		
		//webelementcommands();
		
		//dropdowns();
		
		//actions();
		
		//alerts();
		
		//frames();
		
		//webtables();
		
		//windowhandles();
		
		//screenshothandling();
		waits();
	}
	
	
	


	public static void invokebrowser(String browsernName)
	{
		
		if(browsernName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ramya_Mannem\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		 driver=new FirefoxDriver();
		}
		if(browsernName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramya_Mannem\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");

		 driver=new ChromeDriver();
		}
	}
	
	public static void gettitle()
	{
		String actualtitle=driver.getTitle();
		
		System.out.println(actualtitle);
	}
	
	public static void manage()
	{
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	
	public static void navigation()
	{
		
		driver.navigate().refresh();
	}
	
	public static void findelement()
	{
		String actualtext=driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		System.out.println(actualtext);
		
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='main-header']"));
		List<String> actualText=new ArrayList<>();
		for(int i=0;i<list.size();i++)
		{
			actualText.add(list.get(i).getText());
		}
		System.out.println(actualText);
	}
	
	
	public static void webelementcommands() {
				
		WebElement ele=driver.findElement(By.xpath("(//div[text()='Elements'])[2]"));
		
		//ele.click();
		
		
		WebElement textBoxmenu=driver.findElement(By.xpath("//span[text()='Text Box']"));
		textBoxmenu.click();
		
		WebElement fullname=driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		
		fullname.sendKeys("bindhu");
		System.out.println(fullname.getAttribute("value"));
		
		WebElement mainHeader=driver.findElement(By.xpath("//div[@class='main-header']"));
		
		System.out.println(mainHeader.getText());
		System.out.println(mainHeader.getCssValue("font-size"));
		
		WebElement FormsMenu=driver.findElement(By.xpath("//div[text()='Forms']"));
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		js.executeScript("arguments[0].scrollIntoView();",FormsMenu);
		js.executeScript("arguments[0].click();",FormsMenu);

		//FormsMenu.click();	
	}
	
	public static void dropdowns()
	{
		
		WebElement WidgetsMenu=driver.findElement(By.xpath("//div[text()='Widgets']"));
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		js.executeScript("arguments[0].scrollIntoView();",WidgetsMenu);
		js.executeScript("arguments[0].click();",WidgetsMenu);
		WebElement selectMenu=driver.findElement(By.xpath("//span[text()='Select Menu']"));
		js.executeScript("arguments[0].scrollIntoView();",selectMenu);
		js.executeScript("arguments[0].click();",selectMenu);
		
		
		
	/*	Actions action=new Actions(driver);
		WebElement dropdown1=driver.findElement(By.xpath("//div[text()='Select Option']"));
		dropdown1.click();
		dropdown1.sendKeys("A root option");
		action.sendKeys(Keys.ENTER).build().perform();*/
		
		/*WebElement dropdown=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		js.executeScript("arguments[0].scrollIntoView();",dropdown);
		js.executeScript("arguments[0].click();",dropdown);
		
		Select select=new Select(dropdown);
		
		select.selectByVisibleText("Blue");*/
	}
	
	public static void actions()
	{
		JavascriptExecutor js=((JavascriptExecutor)(driver));

		WebElement menu=driver.findElement(By.xpath("//span[text()='Menu']"));
		js.executeScript("arguments[0].scrollIntoView();",menu);
		js.executeScript("arguments[0].click();",menu);
		
		WebElement menuitemtohover=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(menuitemtohover).build().perform();
	}

	
	public static void alerts()
	{
		
		JavascriptExecutor js=((JavascriptExecutor)(driver));

		WebElement menu=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].scrollIntoView();",menu);
		js.executeScript("arguments[0].click();",menu);
		
		WebElement alertsmenu=driver.findElement(By.xpath("//span[text()='Alerts']"));
		js.executeScript("arguments[0].scrollIntoView();",alertsmenu);
		js.executeScript("arguments[0].click();",alertsmenu);
		
		WebElement clickme=driver.findElement(By.id("confirmButton"));
		clickme.click();
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
	public static void frames() throws InterruptedException
	{
		JavascriptExecutor js=((JavascriptExecutor)(driver));

		WebElement menu=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].scrollIntoView();",menu);
		js.executeScript("arguments[0].click();",menu);
		
		WebElement Framesmenu=driver.findElement(By.xpath("//span[text()='Frames']"));
		js.executeScript("arguments[0].scrollIntoView();",Framesmenu);
		js.executeScript("arguments[0].click();",Framesmenu);
		
		driver.switchTo().frame("frame1");
		
		Thread.sleep(3000);
		String value=driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText();
		
		System.out.println(value);
		driver.switchTo().defaultContent();
		
		String value1=driver.findElement(By.xpath("//div[@id='framesWrapper']//div[1]")).getText();

		System.out.println(value1);

		
	}
	
	public static void webtables()
	{
		
		JavascriptExecutor js=((JavascriptExecutor)(driver));
		
		WebElement tablesmenu=driver.findElement(By.xpath("//span[text()='Web Tables']"));
		js.executeScript("arguments[0].scrollIntoView();",tablesmenu);
		js.executeScript("arguments[0].click();",tablesmenu);
		
		int rowcount=3;
		int colcount=driver.findElements(By.xpath("(//div[@class='rt-tr -odd'])[1]//div[@class='rt-td']")).size();
		
		for(int i=2;i<=(rowcount+1);i++)
		{
			for(int j=1;j<colcount;j++)
			{
				
				String value=driver.findElement(By.xpath("(//div[@role='row'])["+i+"]//div[@class='rt-td']["+j+"]")).getText();				
				System.out.println(value);
			}
		}	
	}
	
	public static void windowhandles()
	{
		JavascriptExecutor js=((JavascriptExecutor)(driver));

		WebElement menu=driver.findElement(By.xpath("//div[text()='Alerts, Frame & Windows']"));
		js.executeScript("arguments[0].scrollIntoView();",menu);
		js.executeScript("arguments[0].click();",menu);
		
		WebElement windowsmenu=driver.findElement(By.xpath("//span[text()='Browser Windows']"));
		js.executeScript("arguments[0].scrollIntoView();",windowsmenu);
		js.executeScript("arguments[0].click();",windowsmenu);
		
		String parentwindowid=driver.getWindowHandle();

		System.out.println(parentwindowid); //1
		
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> windowids=driver.getWindowHandles(); //1,2
		
		for(String window:windowids)
		{
			if(!(window.equals(parentwindowid)))
			{
				driver.switchTo().window(window);
				System.out.println(driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
			}
		}
		
		driver.switchTo().window(parentwindowid);	
	}
	
	public static void screenshothandling() throws IOException {
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 File DestFile=new File(".//screenshots//screenshot.png");
		 Files.copy(SrcFile, DestFile);
	}
	
	public static void waits()
	{
		
		JavascriptExecutor js=((JavascriptExecutor)(driver));

		WebElement menu=driver.findElement(By.xpath("//div[text()='Elements']"));
		js.executeScript("arguments[0].scrollIntoView();",menu);
		js.executeScript("arguments[0].click();",menu);
		
		WebElement dynamicmenu=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		js.executeScript("arguments[0].scrollIntoView();",dynamicmenu);
		js.executeScript("arguments[0].click();",dynamicmenu);
		
		
		
		WebElement ele=driver.findElement(By.id("enableAfter"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		
		Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
			    .withTimeout(Duration.ofSeconds(30))
			    .pollingEvery(Duration.ofSeconds(5))
			    .ignoring(NoSuchElementException.class);	
		
		
		
	}
	
	
	
}
