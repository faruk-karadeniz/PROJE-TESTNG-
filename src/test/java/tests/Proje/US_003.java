package tests.Proje;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TestotomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;



public class US_003 extends ExtentReport {

    @Test
    public void TC_001() {

        Actions actions=new Actions(Driver.getDriver());
        SoftAssert softAssert=new SoftAssert();

        extentTest=extentReports.createTest("Anasayfa testi"
                ,"Kullanıcı anasayfaya gider ve kategorilerin ulaşılabilirliğini test eder" );
        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

    //Testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");
    // url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrlIcerik,actualUrl, "url testdatası ile verilen url ayni değildir");
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

    //Sayfada 'Electronics' kategorisinin tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.Electronics.isEnabled(),"Electronics kategorisi tıklanmıyor");
        extentTest.pass("Electronics kategorisi tiklanir");
    //'Electronics' kategorisine tikla
        testotomasyonPage.Electronics.click();
        extentTest.info("Kullanıcı Electronics kategorisini tıklar");
    //Sayfa url'sinin "https://testotomasyonu.com/category/7/products" oldugunu test et
        String ExpectedCategory7=ConfigReader.getProperty("Category7");
        String actualCategory7=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualCategory7,ExpectedCategory7, "Url datasi ile verilen url ayni değildir");
        extentTest.pass("url datasi ile verilen url'i test eder");
    //Acilan sayfanin 'Electronics' bolumu oldugunu test et
        softAssert.assertTrue(testotomasyonPage.electronicsSayfaYazi.isDisplayed(),"Electronics Sayfası acilmiyor");
        extentTest.pass("Kullanıcı electronics bölümüne görür");
        ReusableMethods.bekle(4);

        //Sayfada 'Men Fashion' kategorisinin tiklanabilirligini test edin
        softAssert.assertTrue(testotomasyonPage.MenFashion.isEnabled(), "Menfashion kategorisi tıklanmıyor");
        extentTest.pass("Kullanici MenFashion kategorisini görür");
    //'Men Fashion' kategorisine tikla
        testotomasyonPage.MenFashion.click();
        extentTest.pass("Kullanici MenFashion kategorisini tıklar ");
    //Sayfa url'sinin "https://testotomasyonu.com/category/1/products" oldugunu test et
        String expectedCategory1=ConfigReader.getProperty("Category1");
        String actualCategory1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualCategory1,expectedCategory1,"url testdatasi ile verilen url ayni değildir");
        extentTest.pass("url testdatasi ile verilen url'i test eder");
    //Acilan sayfanin 'Men Fashion' bolumu oldugunu test et
        softAssert.assertTrue(testotomasyonPage.MenFashionSayfaYazi.isDisplayed(),"Acilan sayfa MenFashion bölümü değildir ");
        extentTest.pass("Kullanici menfashion sayfasına gider");

    //Sayfada 'Women Fashion' kategorisinin tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.WomenFashion.isEnabled(),"Womenfashion kategorisi tiklanmıyor");
        extentTest.pass("Kullanici WomenFashion kategorisini görür");
    //'Women Fashion' kategorisine tikla
        testotomasyonPage.WomenFashion.click();
        extentTest.info("Kullanici WomenFashion kategorsine tiklar");
    //Sayfa url'sinin "https://testotomasyonu.com/category/2/products" oldugunu test et
        String expectedCategory2=ConfigReader.getProperty("Category2");
        String actualCategory2=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualCategory2,expectedCategory2,"url test datasi ile verilen url ayni değildir");
        extentTest.pass("url datasi ile verilen url test eder");
    //Acilan sayfanin 'Women Fashion' bolumu oldugunu test et
        softAssert.assertTrue(testotomasyonPage.WomenFashionSayfaYazi.isDisplayed(),"WomenFashi sayfasi acilmaz");
        extentTest.pass("Kullanici WomenFashion sayfasina gider");

    //Sayfada 'Shoes' kategorisinin tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.Shoes.isEnabled(),"Shoes kategorisi tıklanmaz");
        extentTest.pass(" Kullanici Shoes kategorisini görür");
    //'Shoes' kategorisine tikla
        testotomasyonPage.Shoes.click();
        extentTest.info("Kullanici Shoes kategorisini tiklar");
   //Sayfa url'sinin "https://testotomasyonu.com/category/3/products" oldugunu test et
          String expectedCategory3=ConfigReader.getProperty("Category3");
          String actualCategory3=Driver.getDriver().getCurrentUrl();
          softAssert.assertEquals(actualCategory3,expectedCategory3,"url test datasi ile verilen url ayni değildir");
          extentTest.pass("url datasi ile verilen url test eder");
    //Acilan sayfanin 'Shoes' bolumu oldugunu test et
        softAssert.assertTrue(testotomasyonPage.ShoesSayfaYazi.isDisplayed(),"Shoes sayfasi açilmaz");
        extentTest.pass("Kullanici Shoes sayfasina gider");

    //Sayfada 'Furniture' kategorisinin tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.Furniture.isDisplayed(),"Furniture kategorisi görünmüyor");
        extentTest.pass("Kullanici furniture kategorisini görür");
    //'Furniture' kategorisine tikla
        testotomasyonPage.Furniture.click();
        extentTest.info("Kullanici furniture kategorisine tiklar");
    //Sayfa url'sinin "https://testotomasyonu.com/category/8/products" oldugunu test et
        String expectedCategory8=ConfigReader.getProperty("Category8");
        String actualCategory8=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualCategory8,expectedCategory8,"url datasi ile verilen url ayni değildir");
        extentTest.pass("url datasi ile verilen url'i test eder");
    //Acilan sayfanin 'Furniture' bolumu oldugunu test et
        softAssert.assertTrue(testotomasyonPage.FurnitureSayfaYazi.isDisplayed(),"Furniture sayfasi acilmaz");
        extentTest.pass("Kullanici Furniture sayfasina gider");

    //Sayfada 'Travel' kategorisinin tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.Furniture.isEnabled(),"Travel kategorisi görünmüyor");
        extentTest.pass("Kullanici Travel kategorisine görür");
    //'Travel' kategorisine tikla
        testotomasyonPage.Travel.click();
        extentTest.info("Kullanici Travel kategorisini tiklar");
    //Sayfa url'sinin "https://testotomasyonu.com/category/5/products" oldugunu test et
        String expectedCategory5=ConfigReader.getProperty("Category5");
        String actualCategory5=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualCategory5,expectedCategory5,"Travel url datasi ile verilen url ayni değildir");
        extentTest.pass("Travel datasi iel verilen url test edilir");
    //Acilan sayfanin 'Travel' bolumu oldugunu test et
        softAssert.assertTrue(testotomasyonPage.TravelSayfaYazi.isDisplayed(),"Travel sayfasi acilmaz");
        extentTest.pass("Kullanci Travel sayfasina gider");

    //Sayfada 'Kids Wear' kategorisinin tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.KidsWear.isEnabled()," Kids Wear kategorisi görünmüyor");
        extentTest.pass("Kullanici KidsWear kategorisini görür");
    //Kids Wear kategorisinin üzerine gelindiğinde Boys seçeneğinin ciktiğini test edin
        actions.moveToElement(testotomasyonPage.KidsWear).perform();
        ReusableMethods.bekle(5);
        softAssert.assertTrue(testotomasyonPage.KidsWearBoys.isDisplayed(),"Kids Wear kategorisinde Boys seceneği görünmüyor");
        extentTest.pass("Kullanici KidsWear kategorisinde Boys seceneğini görür");
    //Kids Wear kategorisinin üzerine gelindiğinde Girl seçeneğinin ciktiğini test edin
        actions.moveToElement(testotomasyonPage.KidsWear).perform();
        softAssert.assertTrue(testotomasyonPage.KidsWearGirl.isEnabled(),"Kids Wear kategorisinde Girl seceneği görünmüyor");
        extentTest.pass("Kullanici KidsWear kategorisinde Girl seceneğini görür");
        //'Kids Wear' kategorisine tikla
        testotomasyonPage.KidsWear.click();
        extentTest.info("Kullanici KidsWear kategorisini tiklar");
    //Sayfa url'sinin "https://testotomasyonu.com/category/6/products" oldugunu test et
        String expectedCategory6=ConfigReader.getProperty("Category6");
        String actualCategory6=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualCategory6,expectedCategory6,"KidsWear url datasi ile verilen url aynı değildir");
        extentTest.pass("KidsWear url datasi ile verilen url'i test eder");
    //Acilan sayfanin 'Kids Wear' bolumu oldugunu test et
        softAssert.assertTrue(testotomasyonPage.KidsWearSayfaYazi.isDisplayed(),"KidsWear sayfasi acilmadı");
        extentTest.pass("Kullanici KidsWear sayfasina gider");

    //Sayfada 'Grocery' kategorisinin tiklanabilirligini test et
      softAssert.assertTrue(testotomasyonPage.Grocery.isEnabled(),"Grocery kategorisi görünmüyor");
        extentTest.pass("Kullanici Grocery kategorisini görür");
    //'Grocery' kategorisine tikla
     testotomasyonPage.Grocery.click();
     extentTest.info("Kullanici Grocery kategorisini tiklar");
    //Sayfa url'sinin "https://testotomasyonu.com/category/4/products" oldugunu test et
String expectedCategory4=ConfigReader.getProperty("Category4");
String actualCategory4=Driver.getDriver().getCurrentUrl();
softAssert.assertEquals(actualCategory4,expectedCategory4,"Grocery url datasi ile verilen url ayni değildir");
extentTest.pass("Grocery url datasi ile verilen url test edilir");
    // Acilan sayfanin 'Grocery' bolumu oldugunu test et
softAssert.assertTrue(testotomasyonPage.GrocerySayfaYaziElementi.isDisplayed(),"Grocery saysafi acilmiyor");
extentTest.pass("Kullanici Grocery sayfasina gider");
softAssert.assertAll();

    }

    @Test
    public void TC_002() {

        extentTest=extentReports.createTest("Anasayfa kategori Testi","anasayfa kategorileri test edilir.");
        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();
        SoftAssert softAssert=new SoftAssert();

//Testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");
// url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrlIcerik,actualUrl, "url testdatası ile verilen url ayni değildir");
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

//Anasayfada kategorilerin gorunurlugunu test et ve Anasayfa kategori isimlerini liste olarak kaydet
 List<String> anasayfaKategoriList=new ArrayList<>();

 for (WebElement each:testotomasyonPage.AnasayfaKategoriler)
 {
     if(each.isDisplayed()){
         anasayfaKategoriList.add(each.getText());
     }
 }

        System.out.println(anasayfaKategoriList);
extentTest.info("Anasayfa kategorilerin görünürlülüğünü test eder ve liste olarak kaydeder");

//Arama kutusundaki Select Category butonunun gorunurlugunu test et
softAssert.assertTrue(testotomasyonPage.selectCategory.isDisplayed(),"Anasayfadaki Select Category butonu görünmüyor");
extentTest.pass("Kullanici Anasayfadaki Select Caregory butonunun görünürlülüğünü test eder");

//Select Category butonuna tikla
        testotomasyonPage.selectCategory.click();
        extentTest.info("\"Kullanici Select Category butonunu tiklar");
//Kategori listesinin gorunur oldugunu test et
testotomasyonPage.selectCategory.click();
Actions actions=new Actions(Driver.getDriver());
actions.moveToElement(testotomasyonPage.selectCategory).perform();
Assert.assertTrue(testotomasyonPage.selectCategory.isDisplayed(),"Select Category deki liste görünmüyor");

extentTest.pass("Kullanici Select Category deki liste yi görür");
//Kategori listesindeki isimleri liste olarak kaydet
//Anasayfa kategori listesi ile Arama kutusu kategori listesi uzunluklarinin ayni oldugunu dogrula
//Anasayfa kategori listesindeki 'Electronics' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Men Fashion' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Women Fashion' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Shoes' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Furniture' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Travel' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Kids Wear' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Grocery' kategorisinin Arama kutusu kategori listesinde oldugunu dogrula
        List<String> selectCategoryList=new ArrayList<>();

        selectCategoryList.add(testotomasyonPage.selectElectronics.getText());
        selectCategoryList.add(testotomasyonPage.selectMenFashion.getText());
        selectCategoryList.add(testotomasyonPage.selectWomenFashion.getText());
        selectCategoryList.add(testotomasyonPage.selectShoes.getText());
        selectCategoryList.add(testotomasyonPage.selectFurniture.getText());
        selectCategoryList.add(testotomasyonPage.selectTravel.getText());
        selectCategoryList.add(testotomasyonPage.selectKidsWear.getText());
        selectCategoryList.add(testotomasyonPage.selectGrocery.getText());

        Collections.sort(anasayfaKategoriList);
        Collections.sort(selectCategoryList);

        softAssert.assertEquals(anasayfaKategoriList,selectCategoryList);
        extentTest.pass("Anasayfadaki kategoriler listesi ile Select Category listesinin aynı olduğunu doğrular");

    }

    @Test
    public void TC_003() {

        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();
        SoftAssert softAssert=new SoftAssert();
        extentTest=extentReports.createTest("Anasayfa Kategorileri ile Most Popular Products bölümünü doğrulama testi"
                ,"Most Popular Products bolumundeki kategorilerinde ayni oldugu dogrulanmali");

        //Testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");
        // url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrlIcerik, "url testdatası ile verilen url ayni değildir");
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

  //Anasayfada kategorilerin gorunurlugunu test et ve liste olarak kaydet
List<String> anasayfaKategoriListStr=new ArrayList<>();
for (WebElement each2:testotomasyonPage.AnasayfaKategoriler) {
    if (each2.isDisplayed()) {
        anasayfaKategoriListStr.add(each2.getText());}
}
extentTest.pass("Kullanici Anasayfa Kategorilerini görür");

//Ana sayfada Most Popular Products bolumune git
       Actions actions=new Actions(Driver.getDriver());
       actions.moveToElement(testotomasyonPage.MostPopularProducts).perform();
       extentTest.info("Kullanici  Most Popular Products bölümüne gider");
        ReusableMethods.bekle(5);

//Bolumdeki kategorilerin gorunurlugunu test et ve isimleri liste olarak kaydet
List<String> mostPopularProducts=new ArrayList<>();
for (WebElement each3:testotomasyonPage.MostPopularProductsKategori){
    if(each3.isDisplayed()){
        mostPopularProducts.add(each3.getText());
    }
}
extentTest.pass("Most Popular Products taki kategorilerin görünürlüğü test eder ve listeye kaydeder");

//Anasayfa kategori listesi ile Most Popular Products kategori listesi uzunluklarinin ayni oldugunu dogrula
        if (anasayfaKategoriListStr.size()== mostPopularProducts.size())
        {System.out.println("Anasayfa kategori listesi ile Most Popular Products kategori listesi uzunluklari aynidir");}
        else {System.out.println("Anasayfa kategori listesi ile Most Popular Products kategori listesi uzunluklari ayni değildir");}
 //Anasayfa kategori listesindeki 'Electronics' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Men Fashion' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Women Fashion' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Shoes' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Furniture' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Travel' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Kids Wear' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula
//Anasayfa kategori listesindeki 'Grocery' kategorisinin Most Popular Products kategori listesinde oldugunu dogrula

Collections.sort(anasayfaKategoriListStr);
Collections.sort(mostPopularProducts);
Assert.assertEquals(anasayfaKategoriListStr,mostPopularProducts,"Anasayfa kategori listesiyle Most Popular Products kategori listesi ayni değildir");
extentTest.pass("Anasayfa kategori listesiyle Most Popular Products kategori listesi test edilir");

    }
}

