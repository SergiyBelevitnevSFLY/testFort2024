import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class FirstTest {


    @AfterMethod
    public void postconditions() {
        System.out.println("after test");
    }

    @Test
    public void firstTest() {
        SoftAssert softAssert = new SoftAssert();
        System.out.println("Hello first test ng test");
        int b =2;
        boolean isSignInPresent = false;
        softAssert.assertEquals(b,3);
        softAssert.assertTrue(isSignInPresent);

        softAssert.assertAll();
    }

    @Test
    public void secondTest() {
        System.out.println("Hello second test ng test");
    }

    @BeforeMethod
    public void preconditions() {
        System.out.println("Some preconditions");
    }
}
