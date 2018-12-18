import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyMethods {	
	
	public static WebDriver chrome() {		
		File filePath = new File("Binaries", "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", filePath.getPath());
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static void killProcess() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");	
	}

}
