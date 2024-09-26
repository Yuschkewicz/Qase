package pages;

import com.codeborne.selenide.Configuration;

public class BasePage {
    public final static String PROJECT_NAME = "TSMq";
    public final static String PROJECT_CODE = "tsm13q";

    public void setUp() {
        Configuration.baseUrl = "http://qase.io/";
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;
    }
}
