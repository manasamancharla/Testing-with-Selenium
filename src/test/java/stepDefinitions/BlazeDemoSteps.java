package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BlazeDemoSteps {
	WebDriver driver;
	WebDriverWait wait;

	@Given("I navigate to {string}")
	public void navigateToUrl(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		driver.get(url);
		}
	
	
	@When("I select {string} as the departure city")
	public void selectDepartureCity(String city) {
		WebElement fromCity = wait.until(ExpectedConditions.elementToBeClickable(By.name("fromPort")));
		fromCity.sendKeys(city);

	}

	@When("I select {string} as the destination city")
	public void selectDestinationCity(String city) {
		WebElement toCity = driver.findElement(By.name("toPort"));
		toCity.sendKeys(city);

	}

	@When("I click {string}")
	public void clickButton(String buttonValue) {
		WebElement button = driver.findElement(By.xpath("//input[@value='" + buttonValue + "']"));

		button.click();

	}

	@When("I select the {int}th flight")
	public void selectFlight(int flightIndex) {
		WebElement flightButton = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[" + flightIndex + "]/td[1]/input[1]")));

		flightButton.click();
	}

	@When("I fill in the reservation form")
	public void fillReservationForm() {
		driver.findElement(By.id("inputName")).sendKeys("Manas Amancharla");

		driver.findElement(By.id("address")).sendKeys("420 Street");

		driver.findElement(By.id("city")).sendKeys("Mexico City");

		driver.findElement(By.id("state")).sendKeys("Mexico");

		driver.findElement(By.id("zipCode")).sendKeys("42069");

		driver.findElement(By.id("cardType")).sendKeys("American Express");

		driver.findElement(By.id("creditCardNumber")).sendKeys("374245455400126");

		driver.findElement(By.id("nameOnCard")).sendKeys("Manas Amancharla");
		
		driver.findElement(By.xpath("//label[@class='checkbox']")).click();
	}

	@Then("the reservation should be successful")
	public void verifyReservation() {
		driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
		WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
		String title = confirmationMessage.getText();
		System.out.println("Reservation Status: " + title);
		driver.quit();
	}
}
