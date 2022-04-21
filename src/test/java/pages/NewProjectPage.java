package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class NewProjectPage extends BasePage {


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

    public void openProject(){
        $(byText(PROJECT_NAME)).click();
    }
    public void createNewSuite(String nameSuite){
        $("#create-suite-button").click();
    $("#nameGroup").shouldBe(Condition.visible);
    $("#name").sendKeys(nameSuite);
    $("#save-suite-button").click();


    }
    public void createNewCase(){
$("#create-case-button").click();
        $("#title").shouldBe(Condition.visible);
        $("#title").sendKeys("Test name Case");
       // $("#div[contains(@class,' css-io3r9z-singleValue')][1]").selectOption("Actual");
        //$("#div[contains(@class,'toastui-editor ww-mode')]//*[@class='empty-node']").sendKeys("test text description");
        $("#save-case").click();


    }

}
