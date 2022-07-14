package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Properties myproper;
	public static Logger mylogger;
	
	public static String configPath = ".\\src\\test\\resources\\input\\config.properties";
	public static String log4jPath = ".\\src\\test\\resources\\input\\log4j.properties";
	
	public Base() {
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(configPath));
			myproper = new Properties();
			myproper.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		mylogger = Logger.getLogger("Logger_File");
		PropertyConfigurator.configure(log4jPath);
	}
	
	public static String getUrl() {
		String url = myproper.getProperty("url");
		return url;
	}
	
	public static String getBrowser() {
		String browser = myproper.getProperty("browser");
		return browser;
	}
	
	public static void openBrowser() {
		driver.get(getUrl());
	}
	
	public static void tearDownBrowser() {
		driver.close();
		driver.quit();
		
	}
	
	public static void browserTypes() {
		String BrowserName = getBrowser();
		switch (BrowserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
			
			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
			
}