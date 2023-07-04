package seleniumFirstProject;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class seleniumWeb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium tutorial\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://google.co.in");
		// TODO Auto-generated method stub

	}

}
