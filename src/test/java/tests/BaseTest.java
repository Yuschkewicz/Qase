package tests;

import com.codeborne.selenide.Configuration;
import dto.Project;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.NewProjectPage;
import utils.PropertyReader;

public class BaseTest {

    LoginPage loginPage;
    NewProjectPage newProjectPage;
    Project project;
    public  String email;
    public  String password;
    @BeforeMethod
    public void setUp() {
        email= PropertyReader.getProperty("email");
        password=PropertyReader.getProperty("password");
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
