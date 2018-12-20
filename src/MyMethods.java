import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyMethods {	
	
	public static WebDriver chrome() {		
		File filePath = new File("Binaries", "chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", filePath.getPath());
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver edge() {		
		File fileEdge = new File("Binaries", "MicrosoftWebDriver.exe");
		System.setProperty("webdriver.edge.driver", fileEdge.getPath());
		WebDriver driverEdge = new EdgeDriver();
		return driverEdge;
	}
	
	public static void killProcess() throws IOException {
		Runtime.getRuntime().exec("taskkill /F /IM ChromeDriver.exe");	
	}

}
