package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class BasketPage {

    //for Case1 : Add to Basket and remove
    public SelenideElement
        sideBasket_Btn = $(byTitle("კალათა")),
        noProduct_Text = $(byAttribute("class","woocommerce-mini-cart__empty-message empty title")),
        goToProduction = $(byAttribute("class","btn btn-size-small btn-color-primary wc-backward")),
        search_Input = $(byTitle("პროდუქტების ძებნა")),
        search_Btn = $(byAttribute("class","searchsubmit")),
        firstItem = $(byAttribute("class","attachment-woocommerce_thumbnail size-woocommerce_thumbnail wp-image-20518")),
        addToBasket_Btn = $(byText("კალათაში დამატება")),
        showBasket_Btn = $(byAttribute("class","button btn-cart wc-forward")),
        orderSum_Text = $(byText("შეკვეთების ჯამი")),
        removeItem_Btn = $(by("class","remove")),
        removeCheck_Text = $(byAttribute("class","cart-empty wd-empty-page")),


    //For Case2 : Test other details.

        couponCode_Input = $(byId("coupon_code")),
        couponCode_Btn = $(byName("apply_coupon")),
        couponNotExist_Text = $(byAttribute("class","woocommerce-notices-wrapper")),
        plus_Btn = $(byAttribute("class","plus")),
        updateBasket_Btn = $(byName("update_cart")),
        restoreItem = $(byAttribute("class","restore-item")),
        restoreItem_Text = $(byAttribute("class","restore-item"));



}
