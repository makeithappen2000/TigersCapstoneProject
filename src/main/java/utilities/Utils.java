package utilities;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import core.Base;
import io.cucumber.java.Scenario;

public class Utils extends Base {

	public static Scenario verify;
	public static void waitfor(int TimeUnit) {
		try {
			Thread.sleep(TimeUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();

		}
	}

	public void hoverMouseOverElement(WebElement element) {
		Actions myac = new Actions(driver);
		myac.moveToElement(element);
	}

	public static void takescreenshot(String screneshotName) throws IOException {
		String path = ".\\Output\\screenshots\\"; // passing the path to our where the screenshot go when it's taken.
		File myfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(myfile, new File(path + screneshotName + ".png"));

	}

	public static String GetTextFromUI(WebElement element) {
		String text = element.getText();
		return text;
	}

	public static void checkifIsDisplisEnbalisSle(WebElement yourElement) {

		if (yourElement.isDisplayed() == true && yourElement.isEnabled() == true && yourElement.isSelected() == false) {
			yourElement.click();

		} else {

			System.out.println("one or more of the condtions did not reutrn expected value");
		}

	}
	
	public static void TakeScreenShotForThisStep() {
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		verify.attach(screenshot, "image/png", "Step Screenshot!");
	}
	
	public static void highlightelement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='2px solid brown'", element);
	}
	
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void DisplayDesireAlert(String text) {
		JavascriptExecutor myjs = (JavascriptExecutor) driver;
		myjs.executeScript("alert('text')");
		waitfor(3000);
		driver.switchTo().alert().accept();
		
	}
	
	
	
}
