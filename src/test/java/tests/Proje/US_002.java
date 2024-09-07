package tests.Proje;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


public class US_002 extends ExtentReport {

    @Test
    public void TC_001() {
   extentTest=extentReports.createTest("Kullanici gecerli email ve password girer"
                ,"Kullanici giris yapar doğrular ve firsname lastname ve email bilgilerini görür");
        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

        //Testotomasyonu anasayfaya gidin
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
        ReusableMethods.bekle(4);
        //Account linki'ne tıkla
       extentTest.info("kullanici account like basar");
        testotomasyonPage.accountLinki.click();

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

        //Gecerli  password gir
        testotomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        extentTest.info("Kullanici gecerli password girer");

        //Gorunur durumdaysa Sign in butonuna tikla
        Assert.assertTrue(testotomasyonPage.LoginSayfasiLoginButonu.isDisplayed());
        extentTest.pass("Login butonunun görünürlüğünü doğrular");

        //Sign In' a tikla
        testotomasyonPage.LoginSayfasiLoginButonu.click();
        extentTest.info("Sign In butonuna tiklar");
        ReusableMethods.bekle(5);
        //Login Success gorunurlugunu dogrula
        Assert.assertTrue(testotomasyonPage.loginSuccess.isEnabled());
        extentTest.pass("Login Succes çıktığı doğrulanır");

        //Kullanici profiline yonlendirildigini dogrula
    Assert.assertTrue(testotomasyonPage.UpdateProfile.isDisplayed());
    extentTest.pass("Kullanıcı profilene ulaşır");

        //Kullanici First Name gorunurlugunu test et
    Assert.assertTrue(testotomasyonPage.ProfilFirstName.isDisplayed());
    extentTest.pass("Kullanıcı firstname kutusunu görür");

        //Kullanici Last Name gorunurlugunu test et
        Assert.assertTrue(testotomasyonPage.ProfilLastName.isDisplayed());
        extentTest.pass("Kullanıcı lastname kutusunu görür");

        //Kullanici email gorunurlugunu test et
    Assert.assertTrue(testotomasyonPage.ProfilEmail.isDisplayed());
    extentTest.pass("Kullanıcı email kutusunu görür");

    }

    @Test
    public void TC002() {

     extentTest=extentReports.createTest("Kullanıcı gecerli giris yaparsa"
              ,"Kullanıcı gecerli giris yaparsa account bölümünde;" +
                     " MyProfile, My Orders, Wishlist, Manage Adress,change password ve Logout butonlarini gorebilmeli ");
     TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

        //Testotomasyonu anasayfaya gidin
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

        //Gecerli Email girer
        testotomasyonPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        extentTest.info("Kullanici geçerli email girer");

        //Gecerli  password gir
        testotomasyonPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        extentTest.info("Kullanici gecerli password girer");

        //Gorunur durumdaysa Sign in butonuna tikla
        Assert.assertTrue(testotomasyonPage.LoginSayfasiLoginButonu.isDisplayed());
        extentTest.pass("Login butonunun görünürlüğünü doğrular");

        //Sign In' a tikla
        testotomasyonPage.LoginSayfasiLoginButonu.click();
        extentTest.info("Sign In butonuna tiklar");

        //Login Success gorunurlugunu dogrula
        ReusableMethods.bekle(5);
        Assert.assertTrue(testotomasyonPage.loginSuccess.isEnabled());
        extentTest.pass("Login Succes çıktığı doğrulanır");
        ReusableMethods.bekle(5);
        //Kullanici profiline yonlendirildigini dogrula
        Assert.assertTrue(testotomasyonPage.UpdateProfile.isDisplayed());
        extentTest.pass("Kullanıcı profilene ulaşır");

        //Kullanici profilinde My Profile butonunun gorunurlugunu test et
        Assert.assertTrue(testotomasyonPage.MyProfile.isDisplayed());
        extentTest.pass("Kullanici My Profile butonu görünür");

        //Kullanici profilinde  Wishlist butonunun gorunurlugunu test et
        Assert.assertTrue(testotomasyonPage.Wishlist.isDisplayed());
        extentTest.pass("Kullanici Wishlist butonunu görür");

        //Kullanici profilinde Manage Adress butonunun gorunurlugunu test et
        Assert.assertTrue(testotomasyonPage.MyManageAdress.isDisplayed());
        extentTest.pass("Kullanici Manage Adress butonunu görür");

        //Kullanici profilinde change password butonunun gorunurlugunu test et
        Assert.assertTrue(testotomasyonPage.MyChangePassword.isDisplayed());
        extentTest.pass("Kullanıcı Change Password butonunu görür");

        //Kullanici profilinde Logout butonunun gorunurlugunu test et
        Assert.assertTrue(testotomasyonPage.logoutButonu.isDisplayed());
        extentTest.pass("Kullanıcı Logout butonunu görür");

    }
}
