package API;

import dto.Suite;

import static io.restassured.RestAssured.given;

public class SuiteApiClient {
    public void createNewSuite(Suite suite)

    {
        given().
                header("token", "cb0e7680a30c041c1b1e543758ec757bd449669c").
                header("Content-Type", "application/json").
                body(suite).log().all().
                when().
                post("https://api.qase.io/v1/suite" ).
                then().log().all().
                statusCode(400);
    }
}
