package Base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	private static final String ChromePath = null;
	private static final String testsiteurl= null;
	private static final String Browser = null;
	public static WebDriver driver = null;
	public static Properties PROP = new Properties();
	public static Logger logs = Logger.getLogger("devpinoyLogger");
	//public String ChromePath = "E://chromedriver.exe";
	
	@BeforeSuite
	public void setUp() throws Exception{
		//String dev_env = Config.getProperty("env");
		//String uat_env = UATConfig.getProperty("env");
		if(driver==null )
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\PROP.properties");
			PROP.load(fis);
			
			
			if(PROP.getProperty(Browser).equals("Chrome")){
							
				System.setProperty("webdriver.chrome.driver", PROP.getProperty(ChromePath));
				driver = new ChromeDriver();
				
			}
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get(PROP.getProperty(testsiteurl));
		}
	}
		
		@AfterSuite
		public void tearDown() throws Exception{
			
			
			driver.quit();
			
		}
}
