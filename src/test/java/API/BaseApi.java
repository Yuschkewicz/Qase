package API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseApi {
    RequestSpecification reqSpec;
    Gson gson = new GsonBuilder().create();
    public BaseApi(){
      reqSpec=
                given().
                        header("token","cb0e7680a30c041c1b1e543758ec757bd449669c").
                        header("Content-Type", "application/json").
                        log().all();

    }
    public void post(String body,String Uri){
        given().
                header("token","cb0e7680a30c041c1b1e543758ec757bd449669c").
                header("Content-Type", "application/json").
                body(body).log().all().
                when().
                post("https://api.qase.io/v1/"+ Uri).
                then().log().all().
                statusCode(400);

    }

    public void get(String uri){
        reqSpec.
                when().
                get("https://api.qase.io/v1/"+ uri).
                then().log().all().
                statusCode(400);
    }

}
