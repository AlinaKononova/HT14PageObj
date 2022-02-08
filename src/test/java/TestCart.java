import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCart {
  private WebDriver driver;
  private WebDriverWait wait;

  @BeforeTest
  public void before() {
    System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://rozetka.com.ua/");
    wait = new WebDriverWait(driver, 5);
  }

  @Test
  public void test(){
    new HomePage(driver, wait).clickComputersAndLaptops()
            .clickLaptops()
            .clickBuyBtn();

    Assert.assertEquals(new Cart(driver, wait).shoppingCartCountItems(), "1");
    Assert.assertEquals(new Cart(driver, wait).clickShoppingCart().getTitleOfItemInShoppingCart(), new SearchPage(driver, wait).getTitleFirstItem());

  }

  @AfterMethod
  public void after() {
    driver.quit();
  }

}
