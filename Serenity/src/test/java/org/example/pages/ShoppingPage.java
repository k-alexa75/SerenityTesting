package org.example.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://automationpractice.com")
public class ShoppingPage extends PageObject {

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]")
    private WebElementFacade element1;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[1]")
    private WebElementFacade element2;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span")
    private WebElementFacade continueShopping;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")
    private WebElementFacade viewCart;

    @FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/p[2]/a")
    private WebElementFacade checkout;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
    private WebElementFacade proceedToCheckout;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input")
    private WebElementFacade email;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button")
    private WebElementFacade createAccount;

    // ---------------- Register information ------------------- //
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[1]/div[1]/label/div/span")
    private WebElementFacade title;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[2]/input")
    private WebElementFacade firstName;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[3]/input")
    private WebElementFacade lastName;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[5]/input")
    private WebElementFacade password;

    // ------------- Address information ------------- //

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[4]/input")
    private WebElementFacade address;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[6]/input")
    private WebElementFacade city;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select/option[3]")
    private WebElementFacade state;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[8]/input")
    private WebElementFacade postalCode;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[9]/div/select")
    private WebElementFacade country;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[13]/input")
    private WebElementFacade mobilePhone;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button")
    private WebElementFacade registerButton;

    // ---- GOTO shippingpage ----- //
    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button")
    private WebElementFacade proceedToShipping;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span")
    private WebElementFacade agreeTerms;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button")
    private WebElementFacade goToPayment;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")
    private WebElementFacade choosePayment;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button")
    private WebElementFacade confirmOrder;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/p/strong")
    private WebElementFacade confirmationText;



    public void clickAddToCartElement(WebElementFacade elementName) {
        elementName.click();
    }

    public WebElementFacade getElement1() {
        return element1;
    }

    public WebElementFacade getElement2() {
        return element2;
    }

    public void enterInformation(WebElementFacade textField, String information) {
        textField.type(information);
    }

    public void clickToContinueShopping() {
        continueShopping.waitUntilPresent().click();
    }

    public void clickToProceedToCheckout() {
        proceedToCheckout.click();
    }

    public void clickCheckout() {
        checkout.click();
    }

    public void viewCart() {
        viewCart.waitUntilPresent().click();
    }

    public void enterEmail(String email_text) {
        email.type(email_text);
    }


    public void clickCreateAccount() {
        createAccount.click();
    }

    // ---- REGISTRATION ------- //

    public WebElementFacade getTitleMrOrMrs() {
        return title;
    }

    public WebElementFacade getFirstName() {
        return firstName;
    }

    public WebElementFacade getLastName() {
        return lastName;
    }

    public WebElementFacade getPassword() {
        return password;
    }



    public WebElementFacade getAddress() {
        return address;
    }

    public WebElementFacade getCity() {
        return city;
    }

    public void setState() {
        state.click();
    }

    public WebElementFacade getPostalCode() {
        return postalCode;
    }



    public WebElementFacade getMobilePhone() {
        return mobilePhone;
    }



    public void click_Register() {
        registerButton.click();
    }

    public void click_goToShipping() {
        proceedToShipping.waitUntilPresent().click();
    }

    public void click_agreeTerms() {
        agreeTerms.waitUntilPresent().click();
    }

    public void click_goToPayment() {
        goToPayment.click();
    }

    public void choosePayment() {
        choosePayment.click();
    }

    public void confirmOrder() {
        confirmOrder.click();
    }

    public String getConfirmationText() {
        return confirmationText.getText();
    }



}
