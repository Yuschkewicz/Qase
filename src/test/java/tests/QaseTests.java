package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;

public class QaseTests extends BaseTest {
    @Test
    public void сorrectStartWorking() {
        loginPage.login(LoginPage.EMAIL,LoginPage.PASSWORD);
        $("#createButton").shouldBe(Condition.visible);

    }


    @Test
    public void wrongEmail() {
        loginPage.login("13@13.com","33monkey");
        String alert = getWebDriver().findElement(By.xpath("//div[@class='form-control-feedback']")).getText();
        assertEquals(alert, "These credentials do not match our records.");
    }

    @Test
    public void wrongPassword() {
        loginPage.login("13@13.com","33monkey");
        String alert = getWebDriver().findElement(By.xpath("//div[@class='form-control-feedback']")).getText();
        assertEquals(alert, "These credentials do not match our records.");
    }


    @Test
    public void createNewProject() {
        loginPage.loginAndEnter();
        newProjectPage.createNewProject("TSM","TSM17");
        newProjectPage.checkProject();

    }

    @Test
    public void trySuiteAndCase() {
        loginPage.loginAndEnter();
        newProjectPage.createNewProject("TSM","TSM17");
        newProjectPage.openProject();
        newProjectPage.createNewSuite("Test project");
        newProjectPage.createNewCase("Test suite");
    }

}
