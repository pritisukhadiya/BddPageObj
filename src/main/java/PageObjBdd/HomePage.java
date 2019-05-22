package PageObjBdd;

import org.openqa.selenium.By;

public class HomePage extends Utils{

    // verifying user is on home page
    public void verifyUserisOnHomePage() {
        getActualText(By.linkText("Log in"));
//        Assert.assertEquals("Log in",actualresult);
        validation("Log in");

        System.out.println("User is on Homepage");
    }
}
