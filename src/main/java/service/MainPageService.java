package service;

import page.MainPage;

import static utils.Constants.MAIN_PAGE_URL;

public class MainPageService {

    private final MainPage mainPage = new MainPage();

    public MainPageService openPage() {
        mainPage.openPage(MAIN_PAGE_URL)
                .scrolToBlock();
        return this;
    }

    public boolean logoVisaIsEnabled() {
        return mainPage.logoVisaIsEnabled();
    }

    public boolean logoVerifiedByVisaIsEnabled() {
        return mainPage.logoVerifiedByVisaIsEnabled();
    }

    public boolean logoMastercardIsEnabled() {
        return mainPage.logoMastercardIsEnabled();
    }

    public boolean logoMastercardSecureCodeIsEnabled() {
        return mainPage.logoMastercardSecureCodeIsEnabled();
    }

    public boolean logoBelcardIsEnabled() {
        return mainPage.logoBelcardIsEnabled();
    }

    public String getTextFromBlockTitle() {
        return mainPage.getTextFromBlockTitle();
    }

    public void clickMoreAboutService() {
        mainPage.clickButtonMoreAboutService();
    }

    public void cancelCookie() {
        mainPage.cancelCookie();
    }

    public void inputForm(String phoneNumber, String sum) {
        mainPage.inputPhoneNumber(phoneNumber);
        mainPage.inputSum(sum);
    }

    public boolean payWindowIsDisplayed() {
        return mainPage.payWindowIsDisplayed();
    }

    public String getTextMobileNumber() {
        return mainPage.getTextFieldPhoneNumber();
    }

    public String getTextFieldSum() {
        return mainPage.getTextFieldSum();
    }

    public String getTextFieldEmail() {
        return mainPage.getTextFieldEmail();
    }

    public void changeTypeForInternet() {
        mainPage.changeTypeForInternet();
    }

    public void changeTypeForInstallments() {
        mainPage.changeTypeForInstallments();
    }

    public void changeTypeForDebt() {
        mainPage.changeTypeForDebt();
    }

    public String getTextFieldInternetNumber() {
        return mainPage.getTextFieldInternetNumber();
    }

    public String getTextFieldInstallmentNumber() {
        return mainPage.getTextFieldInstallmentNumber();
    }

    public String getTextFieldDebtNumber() {
        return mainPage.getTextFieldDebtNumber();
    }

    public String getTextSumHeader() {
        String[] arr = mainPage.getTextSumHeader().split(" ");
        return arr[0];
    }
    public String getTextNumberHeader() {
        String[] arr = mainPage.getTextNumberHeader().split(":");
        return arr[2];
    }
    public String getTextSumButton() {
        String[] arr = mainPage.getTextSumButton().split(" ");
        return arr[1];
    }
}
