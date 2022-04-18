package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NewProjectPage extends BasePage {
    public final static String PROJECT_NAME = "TSMq";
    public final static String PROJECT_CODE = "tsm13q";

    @Step("create new project ")
    public void createNewProject() {

        $("#createButton").click();
        $("#inputTitle").sendKeys(PROJECT_NAME);
        $("#inputCode").clear();
        $("#inputCode").sendKeys(PROJECT_CODE);
        $("#inputDescription").sendKeys("Write a few sentences about your project");
        $("#public-access-type").click();
        $(byText("Create project")).click();
    }

    public void checkProject() {
        $(byText(PROJECT_NAME)).shouldBe(Condition.visible);

    }

}
