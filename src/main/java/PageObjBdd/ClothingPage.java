package PageObjBdd;

import org.openqa.selenium.By;

public class ClothingPage extends Utils {
    LoadProp loadProps = new LoadProp();

    private By _apperal = By.linkText("Apparel");
    private By _clothing = By.xpath("//h2[@class='title']//a[contains(text(),'Clothing')]");

    public  void userIsOnClothingPage() {

        //click on apperal
        clickElementBy(_apperal);

        //click on clothing category
        clickElementBy(_clothing);
    }
}
