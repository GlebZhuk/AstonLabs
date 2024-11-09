import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import service.MainPageService;

import static utils.Constants.FIELD_DEBT_NUMBER;
import static utils.Constants.FIELD_EMAIL;
import static utils.Constants.FIELD_INSTALLMENT_NUMBER;
import static utils.Constants.FIELD_INTERNET_NUMBER;
import static utils.Constants.FIELD_MOBILE_NUMBER;
import static utils.Constants.FIELD_SUM;
import static utils.Constants.PHONE_NUMBER;
import static utils.Constants.SUM;


public class TestsForLesson14 extends BaseTest {
    private MainPageService mainPageService = new MainPageService();

    @BeforeMethod
    public void openPage() {
        mainPageService.openPage();
        mainPageService.cancelCookie();
    }

    @Test
    public void verifyTextInFieldsMobile() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextMobileNumber(), FIELD_MOBILE_NUMBER,
                "Текст поля 'Номер телефона' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Test
    public void verifyTextInFieldsInternet() {
        mainPageService.changeTypeForInternet();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextFieldInternetNumber(), FIELD_INTERNET_NUMBER,
                "Текст поля 'Номер абонента' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Test
    public void verifyTextInFieldsInstallments() {
        mainPageService.changeTypeForInstallments();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextFieldInstallmentNumber(), FIELD_INSTALLMENT_NUMBER,
                "Текст поля 'Номер счёта на 44' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Test
    public void verifyTextInFieldsDebt() {
        mainPageService.changeTypeForDebt();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextFieldDebtNumber(), FIELD_DEBT_NUMBER,
                "Текст поля 'Номер счёта на 2073' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldSum(), FIELD_SUM,
                "Текст поля 'Сумма' не соответствует");
        softAssert.assertEquals(mainPageService.getTextFieldEmail(), FIELD_EMAIL,
                "Текст поля 'E-mail' не соответствует");
        softAssert.assertAll();
    }

    @Test
    public void verifyInputValues() {
        mainPageService.inputForm(PHONE_NUMBER, SUM);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(mainPageService.getTextSumHeader(), SUM,
                "Сумма не соответствует введенной");
        softAssert.assertEquals(mainPageService.getTextNumberHeader(), "375" + PHONE_NUMBER,
                "Номер телефона не соответствует введенному");
        softAssert.assertEquals(mainPageService.getTextSumButton(), SUM,
                "Сумма не соответствует введенной");
        softAssert.assertAll();
    }
}
