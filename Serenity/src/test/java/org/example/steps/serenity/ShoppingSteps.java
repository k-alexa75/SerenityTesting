package org.example.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.example.pages.ShoppingPage;

public class ShoppingSteps {
    ShoppingPage shoppingPage;

    @Step
    public void is_the_home_page() {
        shoppingPage.open();
    }

    @Step
    public void add_to_cart_element1() {
        shoppingPage.clickAddToCartElement(shoppingPage.getElement1());
    }

    @Step
    public void continue_shopping() {
        shoppingPage.clickToContinueShopping();
    }

    @Step
    public void add_to_cart_element2() {
        shoppingPage.clickAddToCartElement(shoppingPage.getElement2());
    }

    @Step
    public void view_Cart() {
        shoppingPage.viewCart();
    }

    @Step
    public void click_ProceedToCheckout() {
        shoppingPage.clickToProceedToCheckout();
    }

    @Step
    public void type_Email() {
        shoppingPage.enterEmail("inkypixel34@gmail.com");
    }

    @Step
    public void click_CreateAccount() {
        shoppingPage.clickCreateAccount();
    }

    @Step
    public void register() {
        shoppingPage.getTitleMrOrMrs().waitUntilPresent().click();
        shoppingPage.enterInformation(shoppingPage.getFirstName(), "Inky");
        shoppingPage.enterInformation(shoppingPage.getLastName(), "Pixel");
        shoppingPage.enterInformation(shoppingPage.getPassword(), "alma123");
        shoppingPage.enterInformation(shoppingPage.getAddress(), "Main street, 976");
        shoppingPage.enterInformation(shoppingPage.getCity(), "Cluj-Napoca");
        shoppingPage.setState();
        shoppingPage.enterInformation(shoppingPage.getPostalCode(), "65736");
        shoppingPage.enterInformation(shoppingPage.getMobilePhone(), "0739576893");
        shoppingPage.click_Register();
    }

    @Step
    public void goToShipping() {
        shoppingPage.click_goToShipping();
        shoppingPage.click_agreeTerms();
        shoppingPage.click_goToPayment();
    }

    @Step
    public void payment() {
        shoppingPage.choosePayment();
        shoppingPage.confirmOrder();
    }

    @Step
    public String confirmationText() {
        return shoppingPage.getConfirmationText();
    }
}
