import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {

  By firstItem = By.xpath("//span[@class='goods-tile__title']");
  By buyBtn = By.xpath("//button[contains(@class, 'buy-button')]");

  private WebDriver driver;
  private WebDriverWait wait;

  public SearchPage(WebDriver driver, WebDriverWait wait){
    this.driver = driver;
    this.wait = wait;
  }

  public String getTitleFirstItem(){
    return driver.findElement(firstItem).getText().trim();
  }

  public SearchPage clickBuyBtn(){
    driver.findElement(buyBtn).click();
    return this;
  }

}
