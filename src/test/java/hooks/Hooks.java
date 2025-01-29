package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.AfterStep;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {
	WebDriver driver;

	@Before
	public void setup() {
		System.out.println("Starting browser...");
	}

	@AfterStep
	public void pauseAfterStep() {
		try {
			Thread.sleep(2000); // 2-second delay after every step
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	@After
	public void teardown() {
		System.out.println("Closing browser...");

	}
}
