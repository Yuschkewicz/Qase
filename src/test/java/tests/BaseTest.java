package tests;

import com.codeborne.selenide.Configuration;
import dto.Project;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.NewProjectPage;

public class BaseTest {

    LoginPage loginPage;
    NewProjectPage newProjectPage;
    Project project;


    @BeforeMethod
    public void setUp() {
        Configuration.baseUrl = "http://qase.io/";
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.clickViaJs = true;
        Configuration.timeout = 10000;
        loginPage = new LoginPage();
        newProjectPage = new NewProjectPage();
        project=new Project();
    }


}
