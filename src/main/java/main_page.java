import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class main_page extends BaseClass{

    public static final String SIGN_IN_CLASS_NAME = "login";

    @FindBy (className = SIGN_IN_CLASS_NAME)
    static WebElement sign_in_link;

    public static void click_on_sign_in_link(){
        sign_in_link.click();
    }


}


