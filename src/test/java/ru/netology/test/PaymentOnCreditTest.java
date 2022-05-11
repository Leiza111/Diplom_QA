//package ru.netology.test;
//
//import com.codeborne.selenide.logevents.SelenideLogger;
//import io.qameta.allure.selenide.AllureSelenide;
//import lombok.val;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import ru.netology.data.DataHelper;
//import ru.netology.data.DataHelperSQL;
//import ru.netology.page.CreditPage;
//import ru.netology.page.StartPage;
//
//import static com.codeborne.selenide.Selenide.open;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static ru.netology.data.DataHelperSQL.cleanDataBase;
//
public class PaymentOnCreditTest {
//    CreditPage creditPage = new CreditPage();
//    StartPage startPage = new StartPage();
//
//    @BeforeEach
//    void CleanDataBaseAndOpenWeb() { //очистить базу данных и открыть веб страницу
//        cleanDataBase();
//        startPage = open("http://localhost:8080", StartPage.class);
//        startPage.buyPaymentByCard();
//    }
//
//    @BeforeAll
//    static void setUpAll() {
//        SelenideLogger.addListener("allure", new AllureSelenide());
//    }
//
//    @AfterAll
//    static void tearDownAll() {
//        SelenideLogger.removeListener("allure");
//    }

    //1.Позитивные сценарии
    //1.1_Позитивный тест с первой картой
  //  @Test
//    void shouldApproveFirstCard() {
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth();
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        creditPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        creditPage.messageAboutSuccessfulPayment();
//        val expected = DataHelper.getStatusFirstCard(); //ОР-какое сообщение банка вывести
//        val actual = DataHelperSQL.getPurchaseOnCreditCard(); //ФР-покупка дебетовой картой
//        assertEquals(expected, actual);
 //   }

//    //1.2_Позитивный тест с буквой Ё в имени владельца
//    @Test
//    void shouldApproveOwnerNameWithTheLetter() {
//        val cardNumber = DataHelper.getFirstCardNumber(); //номер используемой карты
//        val month = DataHelper.getValidMonth();
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getLetterЁ(); //тестируемое имя
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment(); //сообщение которое должно быть
//        val expected = DataHelper.getStatusFirstCard(); //ОР-какое сообщение банка вывести
//        val actual = DataHelperSQL.getPurchaseByDebitCard(); //ФР-покупка дебетовой картой
//        assertEquals(expected, actual);
//    }
//
//    //1.3_Позитивный тест с двойным именем владельца
//    @Test
//    void shouldApproveDoubleNameOfTheOwner() {
//        val cardNumber = DataHelper.getFirstCardNumber(); //номер используемой карты
//        val month = DataHelper.getValidMonth();
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getDoubleNameOfTheOwner(); //тестируемое имя
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment(); //сообщение которое должно быть
//        val expected = DataHelper.getStatusFirstCard(); //ОР-какое сообщение банка вывести
//        val actual = DataHelperSQL.getPurchaseByDebitCard(); //ФР-покупка дебетовой картой
//        assertEquals(expected, actual);
//    }
//
//    //1.4_Позитивный тест со второй картой
//    @Test
//    void shouldApproveSecondCard() {
//        val cardNumber = DataHelper.getSecondCardNumber();
//        val month = DataHelper.getValidMonth();
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment();
//        val expected = DataHelper.getStatusSecondCard(); //ОР-какое сообщение банка вывести
//        val actual = DataHelperSQL.getPurchaseByDebitCard(); //ФР-покупка дебетовой картой
//        assertEquals(expected, actual);
//    }
//
//    //2.Негативные сценарии
//    //2.1_Негативный тест с вводом номера карты, содержащую меньше 16 цифр
//    @Test
//    void shouldLessThan16DigitsInTheCard() { //следует ввести меньше 16 цифр в карте
//        val cardNumber = DataHelper.getLessThan16DigitsInTheCard();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.2_Негативный тест с вводом номера карты, содержащее 16 нулей-оформить ишью
//    @Test
//    void should16ZerosInTheCard() { //следует ввести номер карты, содержащий 16 нулей
//        val cardNumber = DataHelper.get16ZerosInTheCard();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutUnsuccessfulPaymentRefused(); //сообщение которое должно быть
//    }
//
//    //2.3_Негативный тест с вводом номера карты, содержащий латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//    @Test
//    void shouldLettersSymbolsTextInTheCard() { //следует ввести номер карты, содержащий латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//        val cardNumber = DataHelper.getLettersSymbolsText();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.4_Негативный тест с пустым полем карты
//    @Test
//    void shouldEmptyFieldInTheCard() { //следует поле карты оставить пустым
//        val cardNumber = DataHelper.getEmptyFieldInTheCard();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.5_Негативный тест с вводом месяца, содержащего латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//    @Test
//    void shouldLettersSymbolsTextInTheMonth() { //ввод месяца, содержащий латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getLettersSymbolsTextInTheMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.6_Негативный тест с вводом месяца больше 12
//    @Test
//    void shouldMonthNumberMore12() { //ввод месяца больше 12
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getMonthNumberMore12(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectCardExpirationDate(); //сообщение которое должно быть
//    }
//
//    //2.7_Негативный тест с пустым полем месяца
//    @Test
//    void shouldMonthFieldEmpty() { //пустой месяц
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getMonthFieldEmpty(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.8_Негативный тест с предыдущим годом
//    @Test
//    void shouldYearFieldPrevious() { //предыдущий год
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getYearFieldPrevious();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutCardExpiration(); //сообщение которое должно быть
//    }
//
//    //2.9_Негативный тест в поле "Год" ввести год на 6 лет больше текущего года
//    @Test
//    void shouldYearMoreThan6YearsOfTheCurrentYear() { //в поле "Год" ввести год на 6 лет больше текущего года
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getMoreThan6YearsOfTheCurrentYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectCardExpirationDate(); //сообщение которое должно быть
//    }
//
//    //2.10_Негативный тест в поле "Год" ввести нулевой год
//    @Test
//    void shouldYearZero() { //в поле "Год" ввести нулевой год
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getYearZero();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutCardExpiration(); //сообщение которое должно быть
//    }
//
//    //2.11_Негативный тест в поле "Год" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//    @Test
//    void shouldLettersSymbolsTextInTheYear() { //в поле "Год" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getLettersSymbolsTextInTheYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.12_Негативный тест  поле "Год" оставить пустым
//    @Test
//    void shouldYearFieldEmpty() { //поле "Год" оставить пустым
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getYearFieldEmpty();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.13_Негативный тест  поле "Владелец" ввести только имя, либо только фамилию, либо только отчество латинскими буквами
//    @Test
//    void shouldOnlyNameOwner() { //в поле "Владелец" ввести только имя, либо только фамилию, либо только отчество латинскими буквами
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getOnNameOwnerly();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment(); //сообщение которое должно быть
//    }
//
//    //2.14_Негативный тест в поле "Владелец" ввести только имя фамилию и отчество с маленькой буквы
//    @Test
//    void shouldNameNndPatronymicWithSmallLetterInTheOwner() { //в поле "Владелец" ввести только имя фамилию и отчество с маленькой буквы
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getNameNndPatronymicWithSmallLetterInTheOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment(); //сообщение которое должно быть
//    }
//
//    //2.15_Негативный тест в поле "Владелец" ввести ввести более 30 символов
//    @Test
//    void shouldMoreThan30CharactersInTheOwner() { //в поле "Владелец" ввести только имя фамилию и отчество с маленькой буквы
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getMoreThan30CharactersInTheOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment(); //сообщение которое должно быть
//    }
//
//    //2.16_Негативный тест в поле "Владелец" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//    @Test
//    void shouldLettersSymbolsTextInTheOwner() { //в поле "Владелец" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getLettersSymbolsTextInTheOwner();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment(); //сообщение которое должно быть
//    }
//
//    //2.17_Негативный тест с пустым полем владельца
//    @Test
//    void shouldOwnerFieldEmpty() { //поле "Год" оставить пустым
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getOwnerFieldEmpty();
//        val cvc = DataHelper.getValidCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutTheMandatoryFillingInOfTheField(); //сообщение которое должно быть
//    }
//
//    //2.18_Негативный тест с нулевым полем CVC
//    // @Test
//    void shouldCvcZero() { //поле "Cvc" ввести нули
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getCvcZero();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutSuccessfulPayment(); //сообщение которое должно быть
//    }
//
//    //2.19_Негативный тест в поле "Cvc" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//    // @Test
//    void shouldLettersSymbolsTextInTheCvc() { //в поле "Cvc" ввести латинские буквы, арабскую вязь, иероглифы, спецсимволы (*, / . = - 0 ? и т.д.)
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getLettersSymbolsTextInTheCvc();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
//
//    //2.20_Негативный тест с пустым полем Cvc
//    // @Test
//    void shouldEmptyFieldInTheCvc() { //следует поле Cvc оставить пустым
//        val cardNumber = DataHelper.getFirstCardNumber();
//        val month = DataHelper.getValidMonth(); //
//        val year = DataHelper.getValidYear();
//        val owner = DataHelper.getValidOwner();
//        val cvc = DataHelper.getCvcFieldEmpty();
//        paymentPage.fillOutLine(cardNumber, month, year, owner, cvc);
//        paymentPage.messageAboutIncorrectDataFormat(); //сообщение которое должно быть
//    }
}

