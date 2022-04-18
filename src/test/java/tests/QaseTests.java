package tests;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
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
        String alert = getWebDriver().findElement(By.xpath("//*[@id=\"auth\"]/div/div/form/div[2]/div")).getText();
        assertEquals(alert, "These credentials do not match our records.");
    }

    @Test
    public void wrongPassword() {
        loginPage.tryToSendWrongPassword();
        String alert = getWebDriver().findElement(By.xpath("//*[@id=\"auth\"]/div/div/form/div[2]/div")).getText();
        assertEquals(alert, "These credentials do not match our records.");
    }


    @Test
    public void createNewProject() {
        loginPage.loginAndEnter();
        newProjectPage.createNewProject();
        newProjectPage.checkProject();

    }

}
