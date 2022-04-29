package pages;

import com.codeborne.selenide.Configuration;
import utils.PropertyReader;

public class BasePage {
    public final static String PROJECT_NAME = "TSMq";
    public final static String PROJECT_CODE = "tsm13q";
    public  String email;
    public  String password;
    public void setUp() {
        email= PropertyReader.getProperty("email");
        password=PropertyReader.getProperty("password");
        Configuration.baseUrl = "http://qase.io/";
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;
    }
}
