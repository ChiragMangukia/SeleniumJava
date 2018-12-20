import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class InvokeBrowser {

	//private static WebDriver driverChrome = MyMethods.chrome();
	private static WebDriver driverEdge = MyMethods.edge();
	
	public static void main(String[] args) throws IOException {
		try {
			//invokeChrome();
			invokeEdge();
		} finally {
			MyMethods.killProcess();
		}
	}
	
	//private static void invokeChrome() {		
		//driverChrome.get("https://www.google.com");
	//}
	
	private static void invokeEdge() {		
		driverEdge.get("https://www.google.com");
	}

}
