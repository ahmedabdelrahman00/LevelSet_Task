// Task1.java
package P1;

import Abstract.Abstract_pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pom1.Document_pom;
import pom1.Home_pom;
import java.util.List;

public class Task1 {

    WebDriver driver = new ChromeDriver();
    Document_pom Doc = new Document_pom(driver);
    Home_pom Home  = new Home_pom(driver);

    @BeforeTest
    public void BeforeTest() {
        Home.Navigate();
        Home.DisplayedHome();
    }

    @Test(priority = 1)
    public void FirstTest() {
        Doc.clickGetPaid();
        Doc.clickGetPaid();
        Doc.WaitTitle();

        int actualSize = Doc.GetFreeSize();
        int expectedSize = 2;
        Assert.assertEquals(actualSize, expectedSize, "Mismatch in the number of free documents.");

        List<String> actualFreeDocs = Doc.getFreeList();
        String[] expectedFreeDocs = {"Exchange a Waiver", "Send a Payment Document"};
        Assert.assertEquals(actualFreeDocs.toArray(), expectedFreeDocs, "Mismatch in free document names.");
    }

    @Test(priority = 2)
    public void SecondTest() {
        int actualPriceDocSize = Doc.getPriceDocSize();
        int expectedPriceDocSize = 1;
        Assert.assertEquals(actualPriceDocSize, expectedPriceDocSize, "Mismatch in the number of priced documents.");

        List<String> actualPriceDocs = Doc.getPriceDocList();
        String[] expectedPriceDocs = {"Send a Warning"};
        for (int i = 0; i < actualPriceDocs.size(); i++) {
            Assert.assertEquals(actualPriceDocs.get(i), expectedPriceDocs[i], "Text mismatch for priced document at index " + i);
        }
    }

    @AfterTest
    public void AfterTest() {
        driver.quit();
    }
}
