package pageObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase.*;

public class BankLoginPageObjects {

    @FindBy(xpath = "//button[@aria-label='Open Checking & Savings Menu']")
    WebElement checkingAndSavingsBtn;

    @FindBy(xpath = "//button[@aria-label='Close Checking & Savings Menu']")
    WebElement closeCheckingAndSavingsBtnMenu;

    @FindBy(xpath = "//button[@aria-label='Open Credit Cards Menu']")
    WebElement creditCardBtn;

    @FindBy(xpath = "//button[@aria-label='Close Credit Cards Menu']")
    WebElement closeCreditCardBtnMenu;

    @FindBy(xpath = "//button[@aria-label='Open Investing & Retirement Menu']")
    WebElement investingRetirementMenu;

    @FindBy(xpath = "//button[@aria-label='Close Investing & Retirement Menu']")
    WebElement closeInvestingRetirementMenu;


    @FindBy(xpath = "//button[@aria-label='Open Auto Menu']")
    WebElement autoMenuBtn;

    @FindBy(xpath = "//button[@aria-label='Close Auto Menu']")
    WebElement closeAutoMenuBtn;


    public BankLoginPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void clickCheckingAndSavingsBtn() {
        checkingAndSavingsBtn.click();

    }

    public void clickCloseCheckingAndSavingsBtnMenu() {
        closeCheckingAndSavingsBtnMenu.click();

    }

    public void clickCreditCardBtn() {
        creditCardBtn.click();

    }

    public void closeCreditCardBtnMenu() {
        closeCreditCardBtnMenu.click();
    }

    public void clickInvestingRetirementMenu() {
        investingRetirementMenu.click();
    }

    public void closeInvestingRetirementMenu() {
        closeInvestingRetirementMenu.click();
    }
        public void clickAutoMenu() {
            autoMenuBtn.click();
        }

        public void closeAutoMenu() {
            closeAutoMenuBtn.click();
        }
        public void getTitleOfThePage(){
        testBase.TestBase.getDriverObj().getTitle();
        }

    }

