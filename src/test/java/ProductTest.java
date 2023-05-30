import StepObject.ProductPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class ProductTest extends ChromeRunner {
    ProductPageSteps productPageSteps = new ProductPageSteps();

    @Test(priority = 1, description = "Product test by discount filter")
    @Severity(SeverityLevel.CRITICAL)
    public void VerifyProductFilterAndLabels(){
        productPageSteps
                .GotoNuts()
                .FilterByDiscountAndStock()
                .PriceSlider()
                .VerifyProductLabels();

    }

    @Test(priority = 2, description = "Product test by contained name")
    @Severity(SeverityLevel.CRITICAL)
    public void VerifyProductNamesContains(){
        productPageSteps
                .GotoMixes()
                .PriceSlider()
                .ProductNamesContains("ᲛᲘᲥᲡᲘ");
    }
}
