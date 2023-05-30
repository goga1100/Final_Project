import StepObject.BasketPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import static DataObject.BasketPageData.Chiri;
import static DataObject.BasketPageData.CouponCode;


public class BasketTest extends ChromeRunner {

BasketPageSteps basketPageSteps = new BasketPageSteps();

    @Test(priority = 1, description = "Add and remove items to basket")
    @Severity(SeverityLevel.CRITICAL)
    public void BasketCheck(){
        basketPageSteps
                .GoToBasket()
                .SearchItem(Chiri)
                .OpenItem()
                .ShowBasket()
                .RemoveItem();

}
    @Test(priority = 2, description = "Check work of the other elements in the basket")
    @Severity(SeverityLevel.CRITICAL)
    public void BasketDetailsCheck(){
    basketPageSteps
            .GoToBasket()
            .SearchItem(Chiri)
            .OpenItem()
            .ShowBasket()
            .CheckCoupon(CouponCode)
            .RemoveItem()
            .RestoreItem()
            .UpdateBasket();


    }


}
