package de.phonebook.tests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegisterPositiveTest(){

        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "kristitomash741@gmail.com");
        type(By.name("password"), "Aa12345!");
        click(By.name("registration"));
        Assert.assertTrue(isElementPresent(By.xpath("//*[.='Sign Out']")));

    }

    @Test
    public void existedUserRegisterNegativeTest(){

        click(By.cssSelector("[href='/login']"));
        type(By.name("email"), "kristitomash741@gmail.com");
        type(By.name("password"), "Aa12345!");
        click(By.name("registration"));
        Assert.assertTrue(isAlertPresent());

    }

}
