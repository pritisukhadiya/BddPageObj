package PageObjBdd;

import org.openqa.selenium.By;

public class RegistrationSuccessPage extends Utils {
    LoadProp loadProps = new LoadProp();

    private By _registrationMessage =By.xpath("//div[@class='result']");

    public void registrationSuccesfullMessage() {

        assertTextMessage("Your registration completed",_registrationMessage);
        {
            System.out.println("Registration Successful");
        }
    }


}
