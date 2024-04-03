package org.acme;

import static io.restassured.RestAssured.given;

import io.quarkus.test.junit.QuarkusTest;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class UserPageTest {

  @Test
  void testUsers() {
    given()
        .when().get("/users/")
        .then()
        .statusCode(200)
        .body(CoreMatchers.containsStringIgnoringCase("users"));
  }
}
