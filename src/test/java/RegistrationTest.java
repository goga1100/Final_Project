import StepObject.RegistrationPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.RegistrationPageData.*;
import static com.codeborne.selenide.Condition.*;

public class RegistrationTest extends ChromeRunner {

    RegistrationPageSteps registrationPageSteps = new RegistrationPageSteps();


    @Test(priority = 1)
    @Description("Testing the registration frames and checking the operation of the launch button by positive")
    @Severity(SeverityLevel.CRITICAL)
    public void RegistrationCheck_Positive(){
        registrationPageSteps
                .GoToRegPage()
                .Name(Name)
                .Email(Email)
                .Password(Password)
                .PhoneNumber(PhoneNumber);
        Assert.assertTrue(registrationPageSteps.submit_Btn.isDisplayed());

    }

    @Test(priority = 2)
    @Description("Testing the registration frames and checking the operation of the launch button by negative")
    @Severity(SeverityLevel.CRITICAL)
    public void RegistrationCheck_Negative() {
        registrationPageSteps
                .GoToRegPage()
                .Name(Name)
                .Email(IncorrectEmail)
                .Password(IncorrectPassword)
                .PhoneNumber(PhoneNumber);
        Assert.assertFalse(registrationPageSteps.submit_Btn.is(editable));
    }

}
