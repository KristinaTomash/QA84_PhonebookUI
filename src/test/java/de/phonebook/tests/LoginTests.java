package de.phonebook.tests;

import de.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{


    @Test
    public void loginRegisteredUserPositiveTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLogiRegisterForm(new User()
                .setEmail("kristitomash@gmail.com")
                .setPassword("Aa12345!"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isSingOutButtonPresent());


    }@Test
    public void loginRegisteredUserWithoutEmailNegativeTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLogiRegisterForm( new User().setPassword("Aa12345!"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());


    }


}
