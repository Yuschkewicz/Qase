package pages;

import com.codeborne.selenide.Configuration;

public class BasePage {

    public void setUp() {
        Configuration.baseUrl = "http://qase.io/";
        Configuration.browser = "chrome";
        Configuration.headless = true;
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;
    }
}
