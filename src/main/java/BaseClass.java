import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

    public static WebDriver driver;

        @BeforeClass
        public static void start_browser() throws InterruptedException {
            System.setProperty("webdriver.gecko.driver", "D:\\Courses\\My_store\\src\\test\\resourses\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get("http://automationpractice.com/index.php");
            driver.manage().window().maximize();
            Thread.sleep(5);
}
       @AfterClass
       public static void close_browser(){
        driver.quit();
        }
    }

