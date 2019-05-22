package PageObjBdd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CurrencyVerificaton extends Utils {

    LoadProp loadProp = new LoadProp();
    public void userCanSeeThatAreProductCurrencyAreChanged() {

        //verify all currency of all products are dollar or not

        boolean present = false;
        List<WebElement> activeList = driver.findElements(By.className("actual-price"));
        //List<WebElement> activeList = driver.findElements(By.cssSelector("span.actual-price"));
        for (WebElement element : activeList) {
            String str = element.getText();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == '$') {
                    present = true;

                }
            }
            if (present == true) {
                System.out.println("$" + " is present in the array list");
                // break;
            } else {
                System.out.println("The $ is not present at the array list");
            }
        }

    }}