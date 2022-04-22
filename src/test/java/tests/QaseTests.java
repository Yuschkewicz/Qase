package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;

public class QaseTests extends BaseTest {
    @Test
    public void сorrectStartWorking() {
        loginPage.loginAndEnter();
        $("#createButton").shouldBe(Condition.visible);

    }

    @Test
    public void wrongEmail() {
        loginPage.tryToSendWrongEmail();
        String alert = getWebDriver().findElement(By.xpath("//div[@class='form-control-feedback']")).getText();
        assertEquals(alert, "These credentials do not match our records.");
    }

    @Test
    public void wrongPassword() {
        loginPage.tryToSendWrongPassword();
        String alert = getWebDriver().findElement(By.xpath("//div[@class='form-control-feedback']")).getText();
        assertEquals(alert, "These credentials do not match our records.");
    }


    @Test
    public void createNewProject() {
        loginPage.loginAndEnter();
        newProjectPage.createNewProject();
        newProjectPage.checkProject();

    }
    @Test
    public void trySuiteAndCase(){
        loginPage.loginAndEnter();
        newProjectPage.createNewProject();
                newProjectPage.openProject();
        newProjectPage.createNewSuite("Test project");
        newProjectPage.createNewCase();
    }

}
