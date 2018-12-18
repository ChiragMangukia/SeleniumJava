import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class InvokeBrowser {

	private static WebDriver driver = MyMethods.chrome();
	
	public static void main(String[] args) throws IOException {
		try {
			invokeChrome();
		} finally {
			MyMethods.killProcess();
		}
	}
	
	private static void invokeChrome() {		
		driver.get("https://www.google.com");
	}

}
