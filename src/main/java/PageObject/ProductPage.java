package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class ProductPage {
    public SelenideElement
        nuts_Btn = $(byText("თხილეული")),
        checkMainPage = $(byText("ფასი")),
        rightSlider = $(byAttribute("class","ui-slider-handle ui-corner-all ui-state-default")),
        leftSlider = $(byAttribute("class","ui-slider-handle ui-corner-all ui-state-default")),
        filter_Btn = $(byText("გაფილტვრა")),
        inStock_Btn = $(byXpath("//*[@id='wd-widget-stock-status-9']/ul/li[2]/a")),
        discount_filter_btn = $(byAttribute("href", "https://chemimaragi.ge/product-category/tkhileuli/?stock_status=onsale")),
        mix_Btn = $(byText("მიქსები"));



    public ElementsCollection
            productElement = $$(byAttribute("class","product-wrapper")),
            productDiscountLabels = $$(byAttribute("class", "onsale product-label")),
            productNames = $$(byXpath("//*[@class='wd-entities-title']/a"));

}
