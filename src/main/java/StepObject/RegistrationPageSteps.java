package StepObject;

import PageObject.RegistrationPage;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public class RegistrationPageSteps extends RegistrationPage {
    @Step("Go to the registration page")
    public RegistrationPageSteps GoToRegPage() {
        signIn_Btn.click();
        signUp_Btn.click();
        signUp_Text.shouldBe(visible, Duration.ofMillis(2000));
        return this;
    }

    @Step("Filling the name field with: {name} ")
    public RegistrationPageSteps Name(String name) {
        name_Input.click();
        name_Input.setValue(name);
        name_Input.shouldNotBe(empty,Duration.ofMillis(2000));
        return this;
    }

    @Step("Filling the email field with: {email} ")
    public RegistrationPageSteps Email(String email) {
        email_Input.click();
        email_Input.setValue(email);
        email_Input.shouldNotBe(empty);
        return this;
    }

    @Step("Filling the Password field with: {password} , Three types of passwords are used depending on the complexity")
    public RegistrationPageSteps Password(String password) {
        password_Input.click();
        password_Input.setValue(password);
        try{
            if (password == "123123"){
                passWeak.shouldBe(visible,Duration.ofMillis(2000));

            }else if(password == "Tester123wq"){
                passNormal.shouldBe(visible,Duration.ofMillis(2000));

            }else if(password == "Tester123UUddU"){
                passStrong.shouldBe(visible,Duration.ofMillis(2000));
            }

        }catch(Exception e) {
            System.out.println("error" + e.getMessage());
        }
        password_Input.shouldNotBe(empty,Duration.ofMillis(2000));
        return this;
    }

    @Step("Filling the phone number field with: {phoneNumber} ")
    public RegistrationPageSteps PhoneNumber(String phoneNumber){
        phoneNumber_Input.click();
        phoneNumber_Input.setValue(phoneNumber);
        phoneNumber_Input.shouldNotBe(empty);
        return this;
        }




    }

