package de.phonebook.tests;
import de.phonebook.model.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void newUserRegisterPositiveTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLogiRegisterForm(new User()
                .setEmail("kristitomash@gmail.com")
                .setPassword("Aa12345!"));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isSingOutButtonPresent());
    }

    @Test
    public void existedUserRegisterNegativeTest(){
        app.getUser().clickOnLoginLink();
        app.getUser().fillLogiRegisterForm(new User()
                .setEmail("kristitomash@gmail.com")
                .setPassword("Aa12345!"));
        app.getUser().clickOnRegistrationButton();
        Assert.assertTrue(app.getUser().isAlertPresent());

    }

}
