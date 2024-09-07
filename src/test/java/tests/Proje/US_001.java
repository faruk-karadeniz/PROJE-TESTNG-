package tests.Proje;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class US_001 extends ExtentReport {

    @Test
    public void TC001() {

        extentTest=extentReports.createTest("anasayfaya ve kullanici kayit sayfasına erişilebilirlik testi"
                ,"Kayit sayfasında;firstname,lastname,email,password,confirm password,sing up button'u görmelidir");

        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

      //Testotomasyonu anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
extentTest.info("kullanici testotomasyonu anasayfaya gider");

//Title'nin "Test" içerdiğini doğrulayın
  String ExpectedTitleIcerikElement="Test";
String actualTitle=Driver.getDriver().getTitle();
Assert.assertTrue(actualTitle.contains(ExpectedTitleIcerikElement));
extentTest.pass("title testi içerdiğini doğrular");

//  url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
 String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
 String actualUrl=Driver.getDriver().getCurrentUrl();
Assert.assertEquals(expectedUrlIcerik,actualUrl);
extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

//Account linkinin görünür durumda olduğunu doğrulayın
 Assert.assertTrue(testotomasyonPage.accountLinki.isDisplayed(),"Account linki görünmüyor");
  extentTest.info("Account linkinin görünürlüğünü doğrula");
ReusableMethods.bekle(4);
  //Account linki'ne tıkla
  testotomasyonPage.accountLinki.click();
  extentTest.info("kullanici account like basar");

  //signup butonunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.signupButton.isDisplayed());
        extentTest.pass("Signup Butonunun görünürlüğünü doğrular");

//Signup butonunu tıklar
        testotomasyonPage.signupButton.click();
        extentTest.info("kullanici Signup butonuna tıklar");

//  Register Now sayfasina gelindigi dogrulayın
        Assert.assertTrue(testotomasyonPage.RegisterNow.isDisplayed());
        extentTest.pass("Register Now yazısının görünürlüğü doğrular");
        ReusableMethods.bekle(3);

//First Name kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.firstNameKutu.isDisplayed());
        extentTest.pass("First Name görünür olduğunu doğrular");

//Last Name nin kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.lastNameKutu.isDisplayed());
        extentTest.pass("Last Name görünür olduğunu doğrular");

//Email kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.emailKayitKutu.isDisplayed());
        extentTest.pass("Email kutusunun görünür olduğunu doğrular ");

        //Password kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.passwordKayitKutu.isDisplayed());
        extentTest.pass("Password kutusunun görünür olduğunu doğrular");

//Comfirm Password kutunusun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.comfirmPasswordKutu.isDisplayed());
        extentTest.pass("Comfirm Password kutusunun görünür olduğunu doğrular");

  Driver.quitDriver();

    }

    @Test
    public void TC002() {

        extentTest=extentReports.createTest("kullanici başarılı bir şekilde kayıt olma"
                ,"Kullanici kayit sayfasinda sunlari doldurup kayidi tamamlamalidir ; " +
                        "firstname, lastname, email, password, confirm password, sign up button");

        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

        //Testotomasyonu anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");

        //  url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrlIcerik,actualUrl);
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");
ReusableMethods.bekle(4);
        //Account linki'ne tıkla
        testotomasyonPage.accountLinki.click();
        extentTest.info("kullanici account like basar");

     //signup butonunun görünür olduğunu doğrulayın
     Assert.assertTrue(testotomasyonPage.signupButton.isDisplayed());
     extentTest.pass("Signup Butonunun görünürlüğünü doğrular");

    //Signup butonunu tıklar
    testotomasyonPage.signupButton.click();
    extentTest.info("kullanici Signup butonuna tıklar");

    //Register Now sayfasina gelindigi dogrulayın
    Assert.assertTrue(testotomasyonPage.RegisterNow.isDisplayed());
    extentTest.pass("Register Now yazısının görünürlüğü doğrular");

    //First Name kutusuna gecerli bilgiyi girin
    testotomasyonPage.firstNameKutu.sendKeys(ConfigReader.getProperty("toFirstName"));
    extentTest.info("Kullanici first name kutusuna bilgi girer");

    //Last Name kutusuna gecerli bilgiyi girin
    testotomasyonPage.lastNameKutu.sendKeys(ConfigReader.getProperty("toLastName"));
    extentTest.info("Kullanici last name kutusuna bilgi girer");

    //Email  kutusuna gecerli bilgiyi girin
    testotomasyonPage.emailKayitKutu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
    extentTest.info("Kullanici email kutusuna bilgi girer");

      //Password kutusuna gecerli bilgiyi girin
    testotomasyonPage.passwordKayitKutu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
    extentTest.info("Kullanici password kutusuna bilgi girer");

    //Comfirm Password kutusuna gecerli bilgiyi girin
    testotomasyonPage.comfirmPasswordKutu.sendKeys(ConfigReader.getProperty("toComfirmPassword"));
    extentTest.info("Kullanici comfirm password kutusuna bilgi girer");

        //Görünür durumdaysa Sing up butonuna basilir
            ReusableMethods.bekle(3);
        Assert.assertTrue(testotomasyonPage.signupKayitButton.isDisplayed());
        extentTest.pass("Sing up butonu görünürlüğünü doğrular");

        //Sign Up butonunu tıklar
        testotomasyonPage.signupKayitButton.click();
        extentTest.info("Sing Up butonuna tiklar");

        //Account linkinin görünür durumda olduğunu doğrulayın, linkin tıklayın ve
        Assert.assertTrue(testotomasyonPage.accountLinki.isDisplayed(),"Account linki görünmüyor");
        extentTest.info("Account linkinin görünürlüğünü doğrula");

        //Account linki'ne tıkla
        testotomasyonPage.accountLinki.click();
        extentTest.info("kullanici account like basar");
        // Logout buttonunun görünür olduğunu test ederek Basarili kayit yapildiği test edin
        Assert.assertTrue(testotomasyonPage.logoutButonu.isDisplayed());
        extentTest.pass("Logout butonu görünür olup basarili kayit yapar");

    }

    @Test
    public void TC_003() {

        extentTest=extentReports.createTest("Kullanici kayit yapamamasi"
                ,"Kullanicini anasayfaya gider sonrada kayitsayfasina gider ve eksik bilgileri girer, kayit yapamaz");
TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

        //Testotomasyonu anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");

//  url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrlIcerik,actualUrl);
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

        //Account linkinin görünür durumda olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.accountLinki.isDisplayed(),"Account linki görünmüyor");
        extentTest.info("Account linkinin görünürlüğünü doğrula");
ReusableMethods.bekle(5);
        //Account linki'ne tıkla
        testotomasyonPage.accountLinki.click();
        extentTest.info("kullanici account like basar");

        //signup butonunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.signupButton.isDisplayed());
        extentTest.pass("Signup Butonunun görünürlüğünü doğrular");

        //Signup butonunu tıklar
        testotomasyonPage.signupButton.click();
        extentTest.info("kullanici Signup butonuna tıklar");

        //Register Now sayfasina gelindigi dogrulayın
        Assert.assertTrue(testotomasyonPage.RegisterNow.isDisplayed());
        extentTest.pass("Register Now yazısının görünürlüğü doğrular");

        //Signup butonunu tıklar
      testotomasyonPage.signupKayitButton.click();
        extentTest.info("kullanici Signup butonuna tıklar");

        //First Name kutusunu boş bırak ve required uyarisini doğrulayın
       Assert.assertTrue(testotomasyonPage.firstNameRequired.isDisplayed());
       extentTest.pass("Firs Name kutusu boş birakilir ve required uyarisini doğrular");

        //Last Name kutusunu boş bırak ve required uyarisini doğrulayın
        Assert.assertTrue(testotomasyonPage.LastNameRequired.isDisplayed());
        extentTest.pass("Last Name kutusu boş birakilir ve required uyarisini doğrular");

        //Email kutusunu boş bırak ve required uyarisini doğrulayın
        Assert.assertTrue(testotomasyonPage.EmailRequired.isDisplayed());
        extentTest.pass("Email kutusu boş birakilir ve required uyarisini doğrular ");

        //Password kutusunu boş bırak ve required uyarisini doğrulayın
          Assert.assertTrue(testotomasyonPage.PasswordRequired.isDisplayed());
          extentTest.pass("Password kutusu boş birakilir ve required uyarisini doğrular");

         //Comfirm password kutusunu boş bırak ve required uyarisini doğrulayın
        Assert.assertTrue(testotomasyonPage.ConfirmPasswordRequired.isDisplayed());
        extentTest.pass("Comfirm Password kutusu boş birakilir ve required uyarisini doğrular");

         //Kayit yapilamadigini ve Register Now sayfasinda kalindigini test et
        Assert.assertTrue(testotomasyonPage.RegisterNow.isDisplayed());
        extentTest.pass("Kayit yapilamaz ve Register Now sayfasinda kalinir");

    }

    @Test
    public void TC_004() {

        extentTest=extentReports.createTest("Kullanici doğru giriş yapamamasi",
                "Kullanicinin hatali mail formati yazmasi");
        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

        //Testotomasyonu anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");

        //  url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrlIcerik,actualUrl);
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

        //Account linkinin görünür durumda olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.accountLinki.isDisplayed(),"Account linki görünmüyor");
        extentTest.info("Account linkinin görünürlüğünü doğrula");
ReusableMethods.bekle(4);
        //Account linki'ne tıkla
        testotomasyonPage.accountLinki.click();
        extentTest.info("kullanici account like basar");

        //Login Now sayfasinda olduğunu doğrular
        Assert.assertTrue(testotomasyonPage.LoginNow.isDisplayed());
        extentTest.pass("Login Now sayfasinda olduğunu doğrular");

        //Email kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.emailKutusu.isDisplayed());
        extentTest.pass("Email kutusunun görünür olduğunu doğrular ");

        //Password kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.passwordKutusu.isDisplayed());
        extentTest.pass("Password kutusunun görünür olduğunu doğrular");

        //Email adresi @ isareti kullanilmadan gir
        testotomasyonPage.emailKutusu.sendKeys(ConfigReader.getProperty("toEksikEmail"));
        extentTest.info("Email kutusuna hatali formatla email girilir");

        //Password kutusuna doğru password girilir
        testotomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        extentTest.info("Password kutusuna doğru password girilir");

      //Gorunur durumdaysa Sign In' a tikla
    Assert.assertTrue(testotomasyonPage.LoginSayfasiLoginButonu.isDisplayed());
    extentTest.pass("Login butonunun görünürlüğünü doğrular");

    //Sign In' a tikla
       testotomasyonPage.LoginSayfasiLoginButonu.click();
       extentTest.info("Sign In butonuna tiklar");

      //      Kayit yapilamadigini test et
    Assert.assertTrue(testotomasyonPage.emailKutusu.isDisplayed());
    extentTest.pass("Kullanici email kutusunu görüyorsa giriş yapamiyor");

    }

    @Test
    public void TC_005() {

        extentTest=extentReports.createTest("Kullanicinin giris yapamaması "
                ,"Kullanici hatali password girer ve giriş yapamaz");
        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

    //Testotomasyonu anasayfaya gider
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");

    //url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrlIcerik,actualUrl);
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

    //Account linkinin görünür durumda olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.accountLinki.isDisplayed(),"Account linki görünmüyor");
        extentTest.info("Account linkinin görünürlüğünü doğrula");

        //Account linki'ne tıkla
        testotomasyonPage.accountLinki.click();
        extentTest.info("kullanici account like basar");

        //Login Now sayfasinda olduğunu doğrular
        Assert.assertTrue(testotomasyonPage.LoginNow.isDisplayed());
        extentTest.pass("Login Now sayfasinda olduğunu doğrular");

    //Email kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.emailKutusu.isDisplayed());
        extentTest.pass("Email kutusunun görünür olduğunu doğrular ");

    //Password kutusunun görünür olduğunu doğrulayın
        Assert.assertTrue(testotomasyonPage.passwordKutusu.isDisplayed());
        extentTest.pass("Password kutusunun görünür olduğunu doğrular");

    //Gecerli Email girer
        testotomasyonPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        extentTest.info("Kullanici geçerli email girer");

    //Password kutusuna hatali bilgiyi gir
        testotomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));

    //Kayit yapilamadigini test et
        Assert.assertTrue(testotomasyonPage.passwordKutusu.isDisplayed());
        extentTest.pass("Kullanici password kutusunu görüyorsa giriş yapamiyor");

    }
}
