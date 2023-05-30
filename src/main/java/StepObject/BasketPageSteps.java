package StepObject;

import PageObject.BasketPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public class BasketPageSteps extends BasketPage {
    @Step("Go to basket page")
    public BasketPageSteps GoToBasket() {
        sideBasket_Btn.click();
        noProduct_Text.shouldBe(visible,Duration.ofMillis(2000));
        goToProduction.click();
        return this;
    }

    @Step("Search item by name: {chiri}")
    public BasketPageSteps SearchItem(String chiri) {
        search_Input.click();
        search_Input.setValue(chiri);
        search_Input.shouldNotBe(empty, Duration.ofMillis(2000));
        search_Btn.click();
        return this;
    }

    @Step("Open the first item and adding it to the basket")
    public BasketPageSteps OpenItem(){
        firstItem.click();
        addToBasket_Btn.click();
        return this;
    }

    @Step("Open basket page")
    public BasketPageSteps ShowBasket(){
        showBasket_Btn.click();
        orderSum_Text.shouldBe(visible,Duration.ofMillis(2000));
        return this;
    }

    @Step("Remove an item from the basket")
    public BasketPageSteps RemoveItem(){
        removeItem_Btn.click();
        removeCheck_Text.shouldBe(visible,Duration.ofMillis(2000));
        return this;
    }

    @Step("Filling the coupon field with: {couponCode} ")
    public BasketPageSteps CheckCoupon(String couponCode){
        couponCode_Input.click();
        couponCode_Input.setValue(couponCode);
        couponCode_Btn.click();
        couponNotExist_Text.shouldBe(visible,Duration.ofMillis(2000));
        return this;
    }

    @Step("Return the deleted item back to the basket")
    public BasketPageSteps RestoreItem(){
        restoreItem_Text.shouldBe(visible,Duration.ofMillis(2000));
        restoreItem.click();
        orderSum_Text.shouldBe(visible,Duration.ofMillis(2000));
        return this;
    }

    @Step("check the plus Btn and check update Btn working or not")
    public BasketPageSteps UpdateBasket(){
        plus_Btn.click();
        Assert.assertTrue(updateBasket_Btn.isDisplayed());
        updateBasket_Btn.click();
        Assert.assertTrue(updateBasket_Btn.is(editable));
        return this;
    }
}
