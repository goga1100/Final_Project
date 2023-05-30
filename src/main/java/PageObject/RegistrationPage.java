package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public SelenideElement

        signIn_Btn = $(byTitle("ჩემი გვერდი")),
        signUp_Btn = $(byText("რეგისტრაცია")),
        signUp_Text = $(byText("რეგისტრაცია")),
        name_Input = $(byId("reg_username")),
        email_Input = $(byId("reg_email")),
        password_Input = $(byId("reg_password")),
        phoneNumber_Input = $(byId("billing_phone")),
        submit_Btn = $(byName("register")),
        passWeak = $(byAttribute("class","woocommerce-password-strength short")),
        passNormal = $(byAttribute("class","woocommerce-password-strength good")),
        passStrong = $(byAttribute("class","woocommerce-password-strength strong"));







}
