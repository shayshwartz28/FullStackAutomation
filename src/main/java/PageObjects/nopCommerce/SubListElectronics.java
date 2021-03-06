package PageObjects.nopCommerce;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SubListElectronics
{
    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li[2]/ul/li/a[1]")
    public WebElement subListlink_Camera_And_Photo;

    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li[2]/ul/li/a[2]")
    public WebElement subListlink_Cell_Phones;

    @FindBy(how = How.XPATH, using = "//ul[@class='top-menu notmobile']/li[2]/ul/li/a[3]")
    public WebElement subListlink_Others;
}
