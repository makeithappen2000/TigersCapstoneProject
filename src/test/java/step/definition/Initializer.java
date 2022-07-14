package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

public class Initializer extends Base{

	@Before
	public void beforeHooks(Scenario myscenario) {
		mylogger.info("The Scenario " + myscenario.getName() + ", has been started!");
		Utils.verify = myscenario;
		browserTypes();
		openBrowser();
	}
	
	@After
	public void afterHooks(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		    scenario.attach(screenshot, "image/png", "Failed Test!");
		}else {
			tearDownBrowser();
			mylogger.info("The Scneario " + scenario.getName() + " has " + scenario.getStatus());
		}
	}
}
