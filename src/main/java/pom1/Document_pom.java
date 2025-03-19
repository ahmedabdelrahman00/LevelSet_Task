package pom1;

import Abstract.Abstract_pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Document_pom extends Abstract_pom {

    private WebDriver driver;

    String DynamicBTN ="Get Paid ";

    @FindBy(xpath = "//a[text()='Get paid ']")
    private WebElement btnGetPaid;

    @FindBy(xpath = "//span[text()='Free']/parent::div/preceding-sibling::div")
    private List<WebElement> freeDoc;

    @FindBy(xpath = "//span[contains(@class,'price-amount') and number(translate(text(),'$','')) > 30 and number(translate(text(),'$','')) < 60]/parent::div/preceding-sibling::div")
    private List<WebElement> priceDoc;

    private final By byBtnGetPaid = By.xpath("//a[text()='Get paid ']");
    private final By byFreeDoc = By.xpath("//span[text()='Free']/parent::div/preceding-sibling::div");
    private final By title = By.cssSelector(".step-title");
    private final By byPriceDoc = By.xpath("//span[contains(@class,'price-amount') and number(translate(text(),'$','')) > 30 and number(translate(text(),'$','')) < 60]/parent::div/preceding-sibling::div");

    public Document_pom(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickGetPaid() {
        WaitForElemnt(byBtnGetPaid);
        PerformClick(btnGetPaid);
    }

    public int GetFreeSize() {
        return freeDoc.size();
    }

    public List<String> getFreeList() {
        WaitForElemnt(byFreeDoc);
        return getElementsText(freeDoc);
    }

    public void WaitTitle() {
        WaitForElemnt(title);
    }

    public int getPriceDocSize() {
        WaitForElemnt(byPriceDoc);
        return priceDoc.size();
    }

    public List<String> getPriceDocList() {
        WaitForElemnt(byPriceDoc);
        return getElementsText(priceDoc);
    }
}
