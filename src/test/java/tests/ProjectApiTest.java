package tests;

import dto.Project;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class ProjectApiTest {

    @Test
    public void createProjectStatus200(){
        Project project = Project
                .builder().
                projectCode("Apitest").
                projectName("Apitest").
projectDescription("Samesm").build();

    }


    @Test
    public void createProjectStatus400(){
        given().
                header("token","cb0e7680a30c041c1b1e543758ec757bd449669c").
                header("Content-Type", "application/json").
                body("{\n" +
                        "    \"title\": \"\",\n" +
                        "\t\"code\": \"41111\",\n" +
                        "    \"description\": \"test12\",\n" +
                        "    \"access\": \"all\",\n" +
                        "    \"group\": \"test\"\n" +
                        "}").
                when().
                post("https://api.qase.io/v1/project").
                then().
                statusCode(400);


    }
}
