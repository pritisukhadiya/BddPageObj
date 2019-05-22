package PageObjBdd;

import org.openqa.selenium.By;

public class ChangeCurrency extends Utils {
    LoadProp loadProps = new LoadProp();

    private By _currency = By.xpath("//select[@id='customerCurrency']");
    private By _euro = By.xpath("//select[@id='customerCurrency']");
    private By _dollar = By.xpath("//select[@id='customerCurrency']");

    public void userIsAbleToChangeCurrency(){

        //click on currency button
        clickElementBy(_currency);

        //select Euro
        selectByText(_euro, "Euro");

        //select dollar
        selectByText(_dollar, "US Dollar");

        { System.out.println("all products are in Dollars"); }

    }
}

