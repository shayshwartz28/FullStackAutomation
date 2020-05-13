package SanityTests;

import Extensions.verifications;
import Utilities.commonOps;
import WorkFlows.mortgageMobileFlow;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.Listeners.class)
public class mortgageMobile extends commonOps
{
    @Test(priority = 0, description = "Test01: Verify Mortgage")
    @Description("Test Description: Fill in Mortgage fields and calculate the repayment")
    public void test01_VerifyMortgageRepayment()
    {
        mortgageMobileFlow.calculateMortgage("1000", "3", "4");
        verifications.textInElementAssertEquals(mortgageMainPage.text_Repayment, "£30.03");
    }

//    @Test(priority = 1, description = "Test02: Verifies Monthly Payment Saved")
//    @Description("Test Description: Save the calculation of monthly repayment and verify it been saved ")
//    public void test02_verifiesMonthlyRepaymentSaved()
//    {
//        mortgageMobileFlow.verifySavedCalculations();
//    }
}
