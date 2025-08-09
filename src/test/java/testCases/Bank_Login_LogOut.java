package testCases;

import org.testng.annotations.Test;
import pageObjectRepository.PageObjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class Bank_Login_LogOut extends PageObjects{

    //	TC001_Login into Bank account click on Checking and Savings Menu and Close Checking and Savings Menu.
    @Test
    public void TC001_loginToApplication_Click_On_CheckingAndSavingsMenu() {
        BankLoginPage.clickCheckingAndSavingsBtn();
        BankLoginPage.clickCloseCheckingAndSavingsBtnMenu();
    }

    //	TC002_Login into Bank account click on Credit Card Menu and Close Credit Card Menu.
    @Test
    public void TC002_loginToApplication_Click_On_CreditCardMenu() {
        BankLoginPage.clickCreditCardBtn();
        BankLoginPage.closeCreditCardBtnMenu();
    }

    @Test
    public void TC003_loginToApplication_Click_On_InvestingRetirementMenu() {
        BankLoginPage.clickInvestingRetirementMenu();
        BankLoginPage.closeInvestingRetirementMenu();
    }

    @Test
    public void TC004_loginToApplication_Click_On_AutoMenu() {
        BankLoginPage.clickAutoMenu();
        BankLoginPage.closeAutoMenu();
    }
}
