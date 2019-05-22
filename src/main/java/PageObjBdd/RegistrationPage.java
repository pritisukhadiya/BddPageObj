package PageObjBdd;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    LoadProp loadProps = new LoadProp();


    private By _register = By.xpath("//a[@class='ico-register']");
    private By _gender =  By.xpath("//input[@id='gender-female']");
    private By _firstName = By.xpath("//input[@id='FirstName']");
    private By _lastName = By.xpath("//input[@id='LastName']");
    private By _dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    private By _dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private By _dateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    private By _email = By.xpath("//input[@id='Email']");
    private By _password = By.xpath("//input[@id='Password']");
    private By _confirmPassword = By.xpath(" //input[@id='ConfirmPassword']");
    private By _clickOnregister = By.xpath(" //input[@id='register-button']");

    public void userShouldAbleToRegisterSuccessfully(){

        //click on register button
        clickElementBy(_register);

        //choose gender
        clickElementBy(_gender);

        //enter given firstname
        enterText(_firstName,loadProps.getProperty("firstName"));

        //enter given lastname
        enterText(_lastName,loadProps.getProperty("lastName"));

        //enter date of bith
        selectByValue(_dateOfBirthDay,loadProps.getProperty("Dobdate"));

        //enter month of birth
        selectByValue(_dateOfBirthMonth,loadProps.getProperty("DOBmonth"));

        //enter year of birth
        selectByValue(_dateOfBirthYear,loadProps.getProperty("DOByear"));

        //enter given email
        enterText(_email,LongTimeStamp() + loadProps.getProperty("email"));

        //enter given password
        enterText(_password,loadProps.getProperty("password"));

        //confirm given password
        enterText(_confirmPassword,loadProps.getProperty("Confirmpassword"));

        //click on register button
        clickElementBy(_clickOnregister);



    }}

