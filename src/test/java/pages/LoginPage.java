package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage {
    public final static String EMAIL = "13and.jei@gmail.com";
    public final static String PASSWORD = "hellodjet";

    @Step("login and open general page QASE.io using  email {EMAIL} and password {PASSWORD}")
    public void loginAndEnter() {
        open("login");
        $("#inputEmail").sendKeys(EMAIL);
        $("#inputPassword").sendKeys(PASSWORD);
        $("#btnLogin").click();


    }

    public void login(String email, String password) {
        open("login");
        $("#inputEmail").sendKeys(email);
        $("#inputPassword").sendKeys(password);
        $("#btnLogin").click();

    }

    @Step(" try to login with uncorrect email")
    public void tryToSendWrongEmail() {
        open("login");
        $("#inputEmail").sendKeys("23@qwert.by");
        $("#inputPassword").sendKeys(PASSWORD);
        $("#btnLogin").click();
    }

    @Step("try to login with uncorrect password ")
    public void tryToSendWrongPassword() {
        open("login");
        $("#inputEmail").sendKeys(EMAIL);
        $("#inputPassword").sendKeys("PASSWORD");
        $("#btnLogin").click();

    }
}
