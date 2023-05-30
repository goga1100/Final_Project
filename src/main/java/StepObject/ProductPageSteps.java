package StepObject;

import PageObject.ProductPage;
import io.qameta.allure.Step;
import org.testng.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ProductPageSteps extends ProductPage {
    @Step("Moving into nuts production")
    public ProductPageSteps GotoNuts(){
        nuts_Btn.click();
        checkMainPage.shouldBe(visible, Duration.ofMillis(2000));
        return this;
    }

    @Step("Moving into mix production")
    public ProductPageSteps GotoMixes(){
        mix_Btn.click();
        checkMainPage.shouldBe(visible, Duration.ofMillis(2000));
        return this;
    }

    // In this part, the site has a bug and the product filtered by the slider does not affect the result
    @Step("sort the product price by slider by use drag and drop (x,y) minimum _ 5 to maximum _ -250 , after this click the filter Btn")
    public ProductPageSteps PriceSlider(){
        actions().dragAndDropBy(rightSlider, 5, 0).perform();
        actions().dragAndDropBy(leftSlider, -250, 0).perform();
        filter_Btn.click();
        return this;
    }

    /* In this part, the site has a bug, and if both buttons are pressed quickly, the operation is not recognized
    Therefore, it is necessary to use the sleep() method*/
    @Step("Filter products by discount and stock buttons")
    public ProductPageSteps FilterByDiscountAndStock(){
        discount_filter_btn.click();
        sleep(2000);
        inStock_Btn.click();
        return this;
    }

    //Using a comparison of the number of discount elements and the number of products
    @Step("Filter the product by Discount and by Stock")
    public ProductPageSteps VerifyProductLabels(){
        int count = productElement.size();
        int label_count = productDiscountLabels.size();
        System.out.println("Product Count = " + count);
        System.out.println("Label Count = " + label_count);
        Assert.assertEquals(label_count, count);
        return this;
    }

    @Step("whether the products contain the symbols: {name}")
    public ProductPageSteps ProductNamesContains(String name){
        int productElementsCount = productNames.size();

        for(int i = 0; i < productElementsCount; i++){
            String productName = productNames.get(i).getText().trim();
            System.out.println(productName);
            Assert.assertTrue(productName.contains(name));
        }

        return this;
    }

}
