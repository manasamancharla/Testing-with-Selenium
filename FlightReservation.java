
import java.net.SocketException;
import java.util.*;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class demoAutomation {

	public static void main(String[] args) throws SocketException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\BrowserDrivers\\chromedriver.exe");
		
		//Initializing Chrome driver object
		
		ChromeDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Opening BlazeDemo website with Chrome
		
		driver.get("https://blazedemo.com/");
		
		driver.manage().window().maximize();
		
		//Checking the title of the page
		
		System.out.println("The Page title is : " + driver.getTitle());
		
	        //Counting the number of links and printing them along with the text
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("The number of links in this page is " + links.size());
	    
	        for(int i=0; i<links.size(); i++) {
	    	
	    	System.out.println(links.get(i).getText());
	       }
	
	      
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@name='fromPort' and @class='form-inline']")).sendKeys("Mexico City");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@name='toPort' and @class='form-inline']")).sendKeys("Berlin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		//Checking the title of the page
		
	        System.out.println("The Page title is : " + driver.getTitle());
				
	        //Counting the number of links and printing them along with the text
				
	        List<WebElement> links1 = driver.findElements(By.tagName("a"));
		System.out.println("The number of links in this page is " + links1.size());
			    
			    for(int i=0; i<links1.size(); i++) {
			    	
			    	System.out.println(links1.get(i).getText());
			    }
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[5]/td[1]/input[1]")).click();
		
                //Checking the title of the page
		
	        System.out.println("The Page title is : " + driver.getTitle());
				
		//Counting the number of links and printing them along with the text
				
		List<WebElement> links2 = driver.findElements(By.tagName("a"));
		System.out.println("The number of links in this page is " + links2.size());
			    
			    for(int i=0; i<links2.size(); i++) {
			    	
			    	System.out.println(links2.get(i).getText());
			    }
		
                //Reservation of flight   
			    
		Thread.sleep(2000);
			    
	        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Manas Amancharla");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='address']")).sendKeys("420 Street");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Mexico City");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Mexico");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("42069");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//select[@id='cardType']")).sendKeys("American Express");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("374245455400126");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='creditCardMonth']"));
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='creditCardYear']"));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Manas Amancharla");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		
                //Checking the title of the page
		
	        System.out.println("The Page title is : " + driver.getTitle());
	    
	        Thread.sleep(4000);
	    
	        js.executeScript("window.scrollBy(0,1000)");
	     
	        //Reservation made
	    
	        System.out.println("Reservation made");
	    
	        Thread.sleep(60000);
	    
	        driver.close();
	    	
			    
	}

}
