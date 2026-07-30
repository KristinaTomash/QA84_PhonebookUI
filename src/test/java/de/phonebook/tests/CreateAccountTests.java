package de.phonebook.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void newUserRegisterPositiveTest(){
        clickOnLoginLink();
        fillLogiRegisterForm(new User()
                .setEmail("kristitomash@gmail.com")
                .setPassword("Aa12345!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isSingOutButtonPresent());
    }

    @Test
    public void existedUserRegisterNegativeTest(){
        clickOnLoginLink();
        fillLogiRegisterForm(new User()
                .setEmail("kristitomash@gmail.com")
                .setPassword("Aa12345!"));
        clickOnRegistrationButton();
        Assert.assertTrue(isAlertPresent());

    }

}
