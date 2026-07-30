package de.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void loginRegisteredUserPositiveTest(){
        clickOnLoginLink();
        fillLogiRegisterForm(new User()
                .setEmail("kristitomash@gmail.com")
                .setPassword("Aa12345!"));
        clickOnLoginButton();
        Assert.assertTrue(isSingOutButtonPresent());


    }@Test
    public void loginRegisteredUserWithoutEmailNegativeTest(){
        clickOnLoginLink();
        fillLogiRegisterForm( new User().setPassword("Aa12345!"));
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());


    }


}
