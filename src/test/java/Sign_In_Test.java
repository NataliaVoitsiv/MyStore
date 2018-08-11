import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;


public class Sign_In_Test {

    public static WebDriver driver;
 
    @BeforeTest
    public static void start_browser() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "D:\\Courses\\My_store\\src\\test\\resourses\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(),"My Store");
    }

    @Test
    public static void correct_sign_in() throws InterruptedException {
        WebElement element = driver.findElement(By.linkText("Sign in"));
        element.click();
        WebDriverWait wait = new WebDriverWait(driver,10);
    }

    @AfterTest
    public static void close_browser(){
        driver.quit();
    }
}
