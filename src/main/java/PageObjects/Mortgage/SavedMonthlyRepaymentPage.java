package PageObjects.Mortgage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class SavedMonthlyRepaymentPage
{
    @FindBy(how = How.XPATH, using = "//*[@text='Saved']")
    public WebElement text_Header_Saved;
}
