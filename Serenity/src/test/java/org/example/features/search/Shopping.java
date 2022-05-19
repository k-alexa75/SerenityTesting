package org.example.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.example.steps.serenity.ShoppingSteps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class Shopping {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public ShoppingSteps shoppingSteps;

    @Test
    public void shoppingTest() {
        shoppingSteps.goToHomePage();
        shoppingSteps.addToCartElement1();
        shoppingSteps.continueShopping();
        shoppingSteps.addToCartElement2();
        shoppingSteps.viewCart();

        shoppingSteps.clickProceedToCheckout();
        shoppingSteps.typeEmail();
        shoppingSteps.clickCreateAccount();
        shoppingSteps.register();

        shoppingSteps.goToShipping();
        shoppingSteps.payment();

        Assert.assertEquals(shoppingSteps.confirmationText(), "Your order on My Store is complete.");
    }
}

