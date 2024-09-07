package tests.Proje;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TestotomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExtentReport;
import utilities.ReusableMethods;


import java.time.Duration;

public class US_004 extends ExtentReport {
    @Test
    public void TC_001() {

        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();
        extentTest=extentReports.createTest("Anasayfa Kategori testi"
                ,"Anasayfada'ki Electronics,Men Fashion,Women Fashion ");

        Actions actions=new Actions(Driver.getDriver());
        SoftAssert softAssert=new SoftAssert();
//Testotomasyonu anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");
// url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrlIcerik,actualUrl, "url testdatası ile verilen url ayni değildir");
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

//sayfada 'Electronics' kategorisine tıklanır
        testotomasyonPage.Electronics.click();
        extentTest.info("Kullanıcı Electronics kategorisini tıklar");
//Electronics sayfasında olduğu doğrulanır
       softAssert.assertTrue(testotomasyonPage.electronicsSayfaYazi.isDisplayed(),"Electronics Sayfası acilmiyor");
        extentTest.pass("Kullanıcı electronics bölümüne görür");
//Birinci sayfadan bir ürün sepete eklenir
        actions.moveToElement(testotomasyonPage.IlkUrun).perform();
        testotomasyonPage.ElectronicBirinciSayfaUrunIkon.click();
        extentTest.info("Kullanici birinci sayfadan bir ürün sepete ürün ekler");
//İkinci sayfa gidilir
       actions.moveToElement(testotomasyonPage.ElectronicIkinciSayfaButton).perform();
        testotomasyonPage.ElectronicIkinciSayfaButton.click();
        extentTest.info("Kullanici ikinci sayfaya gider");
//ikinci sayfadan iki ürün sepete ekler
        actions.moveToElement(testotomasyonPage.ElectronicIkinciSyfaUrun1).perform();
        testotomasyonPage.ElectronicIkinciSyfaUrun1Ikon.click();
     actions.moveToElement(testotomasyonPage.ElectronicIkinciSyfaUrun2).perform();
        testotomasyonPage.ElectronicIkinciSyfaUrun2Ikon.click();
        extentTest.info("Kullanici ikinci sayfadan iki ürün sepete ekler");
//sayfada 'Man Fashion' kategorisine tıklanır
        testotomasyonPage.MenFashion.click();
        extentTest.pass("Kullanici MenFashion kategorisini tıklar ");
//Man Fashion sayfasında olduğu test edilir
        softAssert.assertTrue(testotomasyonPage.MenFashionSayfaYazi.isDisplayed(),"Acilan sayfa MenFashion bölümü değildir ");
        extentTest.pass("Kullanici menfashion sayfasına gider");
//üç ürün sepete eklenir
       actions.moveToElement(testotomasyonPage.MenFashionSayfaUrun1).perform();
        testotomasyonPage.MenFashionSayfaUrun1Ikon.click();
      actions.moveToElement(testotomasyonPage.MenFashionSayfaUrun2).perform();
        testotomasyonPage.MenFashionSayfaUrun2Ikon.click();
        ReusableMethods.bekle(2);
        actions.moveToElement(testotomasyonPage.MenFashionSayfaUrun3).perform();
        testotomasyonPage.MenFashionSayfaUrun3Ikon.click();
        extentTest.info("Kullanici Man Fashion sayfasindan üc ürün sepete ekler");

 //sayfada 'Women Fashion' kategorisine tıklanır
        testotomasyonPage.WomenFashion.click();
        extentTest.info("Kullanici WomenFashion kategorsine tiklar");
 //       Women Fashion sayfasında olduğu test edlir.
        softAssert.assertTrue(testotomasyonPage.WomenFashionSayfaYazi.isDisplayed(),"Women Fashion sayfasi acilmaz");
        extentTest.pass("Kullanici WomenFashion sayfasina gider");
 //Iki ürün sepete eklenir
      actions.moveToElement(testotomasyonPage.WomenFashionSayfaUrun1).perform();
        testotomasyonPage.WomenFashionSayfaUrun1Ikon.click();
        actions.moveToElement(testotomasyonPage.WomenFashionSayfaUrun2).perform();
        testotomasyonPage.WomenFashionSayfaUrun2Ikon.click();
        extentTest.info("Kullanici Women Fashion sayfasindan iki ürün sepete ekler");

 //sayfada 'Shoes' kategorisini tıklar
        testotomasyonPage.Shoes.click();
        extentTest.info("Kullanici Shoes kategorisini tiklar");
 //Shoes sayfasında olduğunu doğrular
        softAssert.assertTrue(testotomasyonPage.ShoesSayfaYazi.isDisplayed(),"Shoes sayfası açilmiyor");
        extentTest.pass("Kullanici Shoes sayfasina gider");
 //Iki ürün sepete eklenir
        actions.moveToElement(testotomasyonPage.ShoesSyfaUrun1).perform();
        testotomasyonPage.ShoesSyfaUrun1Ikon.click();
      actions.moveToElement(testotomasyonPage.ShoesSyfaUrun2).perform();
        testotomasyonPage.ShoesSyfaUrun2Ikon.click();
        extentTest.info("Kullanici Shoes sayfasindan iki ürün secer");

//sayfada 'Furniture' kategorisini tıiklar
        testotomasyonPage.Furniture.click();
        extentTest.info("Kullanici furniture kategorisine tiklar");
 //Furniture sayfasında olduğunu doğrular
        softAssert.assertTrue(testotomasyonPage.FurnitureSayfaYazi.isDisplayed(),"Furniture sayfasi acilmaz");
        extentTest.pass("Kullanici Furniture sayfasina gider");
 //üç ürün sepete eklenir
       actions.moveToElement(testotomasyonPage.FurnitureUrun1).perform();
        testotomasyonPage.FurnitureUrun1Ikon.click();
       actions.moveToElement(testotomasyonPage.FurnitureUrun2).perform();
        testotomasyonPage.FurnitureUrun2Ikon.click();
       actions.moveToElement(testotomasyonPage.FurnitureUrun3).perform();
        testotomasyonPage.FurnitureUrun3Ikon.click();
        extentTest.info("Kullanici Furniture sayfasindan üc ürün secer");

 //Anasayfada Travel' kategorisini tıiklar
        testotomasyonPage.Travel.click();
        extentTest.info("Kullanici Travel kategorisini tiklar");
  //Travel sayfasında olduğunu doğrular
        softAssert.assertTrue(testotomasyonPage.TravelSayfaYazi.isDisplayed(),"Travel sayfasi acilmaz");
        extentTest.pass("Kullanci Travel sayfasina gider");
  //üç ürün sepete eklenir
     actions.moveToElement(testotomasyonPage.TravelUrun1).perform();
        testotomasyonPage.TravelUrun1Ikon.click();
      actions.moveToElement(testotomasyonPage.TravelUrun2).perform();
        testotomasyonPage.TravelUrun2Ikon.click();
        actions.moveToElement(testotomasyonPage.TravelUrun3).perform();
        testotomasyonPage.TravelUrun3Ikon.click();
        extentTest.info("Kullanici Travel sayfasindan üc ürün secer");

//Anasayfada 'Kids Wear' kategorisinin tiklanir
        testotomasyonPage.KidsWear.click();
        extentTest.info("Kullanici KidsWear kategorisini tiklar");
//Kids Wear sayfasında olduğunu doğrular
        softAssert.assertTrue(testotomasyonPage.KidsWearSayfaYazi.isDisplayed(),"KidsWear sayfasi acilmadı");
        extentTest.pass("Kullanici KidsWear sayfasina gider");
//üç ürün sepete eklenir
        actions.moveToElement(testotomasyonPage.KidsWearUrun1).perform();
        ReusableMethods.bekle(2);
        testotomasyonPage.KidsWearUrun1Ikon.click();
   actions.moveToElement(testotomasyonPage.KidsWearUrun2).perform();
        testotomasyonPage.KidsWearUrun2Ikon.click();
      actions.moveToElement(testotomasyonPage.KidsWearUrun3).perform();
        testotomasyonPage.KidsWearUrun3Ikon.click();
        extentTest.info("Kullanici KidsWear sayfasindan üc ürün secer");

//Anasayfada 'Grocery' kategorisini tıklanir
        testotomasyonPage.Grocery.click();
        extentTest.info("Kullanici Grocery kategorisini tiklar");
//Grocery sayfasında olduğunu doğrula
        softAssert.assertTrue(testotomasyonPage.GrocerySayfaYaziElementi.isDisplayed(),"Grocery saysafi acilmiyor");
        extentTest.pass("Kullanici Grocery sayfasina gider");
 //çıkan ürünü Sepeete ekle
   actions.moveToElement(testotomasyonPage.GroceryUrun1).perform();
        testotomasyonPage.GroceryUrun1Ikon.click();
        extentTest.info("Kullanici Grocery sayfasindaki ürünü secer");

//Your Cart butonunun gorunurlugunu test et
        softAssert.assertTrue(testotomasyonPage.YourCardButton.isEnabled(),"Your Cart butonu gözükmüyor");
        extentTest.pass("Kullanici Your Cart butonunu görür");
//Your Cart butonunun sayisininin 20 oldugunu dogrula
        softAssert.assertTrue(testotomasyonPage.YirmiIkon.isDisplayed(),"Your Cart butonunda 20 sayisi gözükmez");
        extentTest.pass("Kullanici Your Cart butonun da Yirmi sayisini görür");
//Your Cart butonuna tıkla
        testotomasyonPage.YourCardButton.click();
        extentTest.pass("Kullanici Your Card Butonuna tiklar");
//Sepette urun bulundugunu test et
        softAssert.assertTrue(testotomasyonPage.CheckoutButton.isDisplayed(),"Checkout Butonu gözükmüyor");
        extentTest.pass("Kullanici Checkout butonunu görür");

    }

    @Test
    public void TC_002() {

  extentTest=extentReports.createTest("Top Selling Production testi","Kullanici Top Selling Products kategorisini test eder");
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

//Top Selling Products yazisinin görünürlüğünü test et
softAssert.assertTrue(testotomasyonPage.TopSellingYazi.isDisplayed(),"Top Selling Products yazisi görünmüyor ");
extentTest.pass("Kullanici Top Selling Products yazisi görür");

//View All Products butonunun tiklanabilirligini test et
softAssert.assertTrue(testotomasyonPage.viewAllProducts.isEnabled(),"View All Products butonu tiklanamaz");
extentTest.pass("Kullanici View All Products butonunu görür");
//View All Products butonuna tikla
        ReusableMethods.bekle(5);
        testotomasyonPage.viewAllProducts.click();
        extentTest.pass("Kullanici View All Products butonuna tiklar");
//Sayfa url'sinin "https://testotomasyonu.com/trending/all-products" oldugunu test et
 String expectedViewAllSayfaUrl=ConfigReader.getProperty("ViewAllProducts");
 String actualViewAllSayfaUrl=Driver.getDriver().getCurrentUrl();
 softAssert.assertEquals(actualViewAllSayfaUrl,expectedViewAllSayfaUrl);
 extentTest.pass("url testdatasi ile verilen url'i test eder");
//Kategoride 0'dan fazla urun bulundugunu dogrula
    int ViewSayfaSonuc=testotomasyonPage.TopSellingProductsUrunSonucYazi.size();

softAssert.assertTrue(ViewSayfaSonuc>0,"0'dan fazla urun bulunmuyor");
extentTest.pass("Kategoride 0 fazla ürün bulunduğunu test eder");
//Listedeki ilk urunun uzerine git
     Actions actions=new Actions(Driver.getDriver());
actions.moveToElement(testotomasyonPage.TopSellingIlkUrun).perform();

//Urun kutusunun uzerinde dururken gorunur olan Add to Cart butonunun tiklanabilirligini test et
softAssert.assertTrue(testotomasyonPage.AddToCardButton.isDisplayed(),"Add to Cart butonu görünmüyor");
extentTest.pass("Kullanici urun uzerinde Add to cart butonunu görür");
 //Add to cart butonuna tikla
testotomasyonPage.AddToCardButton.click();
     extentTest.pass("Kullanici urun uzerinde Add to cart butonuna tiklar");
//Product Added To Cart! Yazisinin ciktigini dogrula
     softAssert.assertTrue(testotomasyonPage.AddToCardButton.isDisplayed()," Product Added To Cart! yazisi gözükmüyor");
     extentTest.pass("Kullanici Product Added To Cart! Yazisini görür");
//Your Cart butonunun gorunurlugunu test et
     softAssert.assertTrue(testotomasyonPage.YourCardButton.isEnabled(),"Your Cart buttonu gözükmüyor");
     extentTest.pass("Kullanici Your Cart butonunu görür");
//Your Cart butonunun sayisininin 1 oldugunu dogrula
     softAssert.assertTrue(testotomasyonPage.YourCardButton1.isDisplayed(),"Your Cart butonunun da 1 gözükmüyor");
     extentTest.pass(" Your Cart butonunun sayisininin 1 oldugunu dogrular");
//Your cart butonuna tikla
     testotomasyonPage.YourCardButton.click();
     extentTest.pass("Kullanici Your Card Butonuna tiklar");
     ReusableMethods.bekle(5);
//Sayfa url'sinin "https://testotomasyonu.com/shoppingCart" oldugunu test et
     String expectedShopingCartUrl=ConfigReader.getProperty("ShopingCart");
     String actualShopingCartUrl=Driver.getDriver().getCurrentUrl();
     softAssert.assertEquals(actualShopingCartUrl,expectedShopingCartUrl,"url testdatasi ile verilen url farklidir");
     extentTest.pass("url testdatasi ile veilen url'i test eder");
//Sepette urun bulundugunu test et
     softAssert.assertTrue(testotomasyonPage.ContinueShoppingButon.isDisplayed(),"ContinueShoppingButon butonu gözükmüyor");
     extentTest.pass("Kullanici sepette urun olduğunu ContinueShoppingButon ile görür");
//Sepetteki urunun isminin listede eklenen urunun ismi ile ayni oldugunu test et
String expectedProductUrunIsim="Product Tax";
String actualProductUrun=testotomasyonPage.ProductTaxUrun.getText();
softAssert.assertEquals(actualProductUrun,expectedProductUrunIsim,"seçilen ürün ile sepetteki ürün ayni değildir");
extentTest.pass("Sepetteki urun ismi ile listeye eklenen urunun ismini test eder");
softAssert.assertAll();
    }
 @Test
 public void TC_003() {


  WebDriverWait wait=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
  TestotomasyonPage testotomasyonPage=new TestotomasyonPage();
  extentTest=extentReports.createTest("Kullanici sepet testi"
          ,"Kullanici sepet içerisindeki urunleri silebilmelive sepeti bosaltabilmelidir");
  SoftAssert softAssert=new SoftAssert();

  //Testotomasyonu anasayfaya gidin
  Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
  extentTest.info("kullanici testotomasyonu anasayfaya gider");
  // url'in test datası olarak verilen url ile aynı oldugunu dogrulayin
  String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
  String actualUrl=Driver.getDriver().getCurrentUrl();
  softAssert.assertEquals(expectedUrlIcerik,actualUrl, "url testdatası ile verilen url ayni değildir");
  extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");
//Top Selling Products bölümünün görünürlüğü test et
    softAssert.assertTrue(testotomasyonPage.TopSellingYazi.isDisplayed(),"Top Selling Products yazisi görünmüyor ");
     extentTest.pass("Kullanici Top Selling Products yazisi görür");

//View All Products butonunun tiklanabilirligini test et
  softAssert.assertTrue(testotomasyonPage.ViewAllProducts.isEnabled());
  extentTest.pass("Kullanici View All Products butonunu görür");

//View All Products butonuna tikla
  testotomasyonPage.ViewAllProducts.click();
  extentTest.info("Kullanici View All Products butonunu tiklar");

//Sayfa url'sinin "https://testotomasyonu.com/trending/all-products" oldugunu test et
  String expectedAllProducts=ConfigReader.getProperty("AllProducts");
  String actualALLproducts=Driver.getDriver().getCurrentUrl();
  softAssert.assertEquals(actualALLproducts,expectedAllProducts,"url testdatasi ile verilen url farklidir");
  extentTest.pass("url testdatasi ile verilen url test edilir");
//Kategoride 0'dan fazla urun bulundugunu dogrula
  int actualUrunSayi=testotomasyonPage.UrunSonucElementi.size();
  softAssert.assertTrue(actualUrunSayi> 0,"Kategoride 0 dan fazla ürün bulunamadı");
  extentTest.pass("Kategoride ürün bulunabildiğini test eder");
//Listedeki ilk urunun uzerine git
  Actions actions=new Actions(Driver.getDriver());
  actions.moveToElement(testotomasyonPage.IlkUrun).perform();
  ReusableMethods.bekle(3);
  extentTest.info("Kullanici sepete ürün ekler");
//Urun kutusunun uzerinde dururken gorunur olan Add to Cart butonunun tiklanabilirligini test et
  Assert.assertTrue(testotomasyonPage.AddToCardButton.isEnabled(),"Add to Cart butonunu görünmez");
  extentTest.pass("Kullanici Add to Cart butonunu görür");

//Add to cart butonuna tikla
  testotomasyonPage.AddToCardButton.click();
  ReusableMethods.bekle(5);

//Product Added To Cart! Yazisinin ciktigini dogrula
  softAssert.assertTrue(testotomasyonPage.AddToCardButton.isDisplayed()," Product Added To Cart! yazisi gözükmüyor");
  extentTest.pass("Kullanici Product Added To Cart! Yazisini görür");
//Your Cart butonunun gorunurlugunu test et
  softAssert.assertTrue(testotomasyonPage.YourCardButton.isEnabled(),"Your Cart buttonu gözükmüyor");
  extentTest.pass("Kullanici Your Cart butonunu görür");

//Your Cart butonunun sayisininin 1 oldugunu dogrula
  softAssert.assertTrue(testotomasyonPage.YourCardButton1.isDisplayed(),"Your Cart butonunun da 1 gözükmüyor");
  extentTest.pass(" Your Cart butonunun sayisininin 1 oldugunu dogrular");
  //Your cart butonuna tikla
  testotomasyonPage.YourCardButton.click();
  extentTest.pass("Kullanici Your Card Butonuna tiklar");
  ReusableMethods.bekle(5);

//Sayfa url'sinin "https://testotomasyonu.com/shoppingCart" oldugunu test et
  String expectedShopingCartUrl=ConfigReader.getProperty("ShopingCart");
  String actualShopingCartUrl=Driver.getDriver().getCurrentUrl();
  softAssert.assertEquals(actualShopingCartUrl,expectedShopingCartUrl,"url testdatasi ile verilen url farklidir");
  extentTest.pass("url testdatasi ile veilen url'i test eder");
//Sepette urun bulundugunu test et
  softAssert.assertTrue(testotomasyonPage.ContinueShoppingButon.isDisplayed(),"ContinueShoppingButon butonu gözükmüyor");
  extentTest.pass("Kullanici sepette urun olduğunu ContinueShoppingButonu ile görür");
//Urun kutusunun kosesindeki X butonunun tiklanabilirligini test et
  Assert.assertTrue(testotomasyonPage.Xbutton.isEnabled(),"Urun kutusunda x butonu gözükmez");
  extentTest.pass("Kullanici urun kutusunda X butonunu görür");
//X butonuna tikla
  testotomasyonPage.Xbutton.click();
  extentTest.info("Kullanici X butonunu tıklar");
  ReusableMethods.bekle(4);

//Are you sure penceresinin acildigini dogrula
  softAssert.assertTrue(testotomasyonPage.AreYouSureYazi.isDisplayed(),"Are you sure penceresinin acilmiyor");
  extentTest.info("Kullanici Are you sure penceresinin acildigini görür");
//Yes, remove it! Butonuna tikla
  testotomasyonPage.YesButton.click();
  extentTest.info("Kullanici Yes, remove it! Butonuna tiklar");
//Wait for it... Yazisi kaybolana kadar bekle - invisibleELement
  wait.until(ExpectedConditions.invisibilityOf(testotomasyonPage.WaitForItYazi));

//Shopping cart is empty yazisi gorunur oldugunu test et
  softAssert.assertTrue(testotomasyonPage.ShoppingCartIsEmptyYazi.isDisplayed(),"Shopping cart is empty yazisi gorunmez");
  extentTest.pass("Kullanici Shopping cart is empty yazisi gorur");
  softAssert.assertAll();
 }


    @Test
    public void TC_004() {

        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();
        SoftAssert softAssert=new SoftAssert();
        extentTest=extentReports.createTest("Arama kutusuna urun ismi yazıp satın alma"
                ,"Kullanici arama kutusuna urun ismini yazar ve sepette urun miktarını test eder ");

//url` ye git
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");
//Sayfaya gittigini dogrula
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrlIcerik, "Anasayfa url testdatası ile verilen url ayni değildir");
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");
//Arama kutusunun aktif oldugunu test et
softAssert.assertTrue(testotomasyonPage.SearchBox.isEnabled(),"Arama kutusu aktif değildir ");
extentTest.pass("Kullanici arama kutusunu görür");

//Arama kutusuna phone yaz ve entere bas
testotomasyonPage.SearchBox.sendKeys("phone"+Keys.ENTER);
extentTest.info("Kullanici arama kutusuna phone yazar ve tıklar");

//Sayfa url'sinin "https://testotomasyonu.com/search-product?search=phone&search_category=0" oldugunu test et
        String expectedSayfaUrl=ConfigReader.getProperty("PhoneSayfaSonuc");
        String actualSayfaUrl=Driver.getDriver().getCurrentUrl();
softAssert.assertEquals(actualSayfaUrl,expectedSayfaUrl,"sayfa url datasi ile verilen url ayni değildir");
extentTest.pass(" url test datasi ile verilen url'i doğrular");

//0'dan fazla urun bulundugunu dogrula
   int phoneSonuc=testotomasyonPage.PhoneSonuc.size();
softAssert.assertTrue(phoneSonuc>0,"Arama sonucunda 0 fazla urun bulunamadi");
extentTest.pass("Kullanici arama sonucunda 0 fazla ürün görür");

//ilk urune tikla
        ReusableMethods.bekle(5);
testotomasyonPage.PhoneIlkUrun.click();
extentTest.info("Kullanici ilk ürünü tiklar");

//Sayfa url'sinin "https://testotomasyonu.com/product/34" icerdigini test et
        ReusableMethods.bekle(5);
String expectedPhoneIlkUrun=ConfigReader.getProperty("PhoneIlkUrun");
String actualPhoneIlkUrun=Driver.getDriver().getCurrentUrl();
softAssert.assertEquals(actualPhoneIlkUrun,expectedPhoneIlkUrun,"url testdatasi ile verilen url ayni değildir");
extentTest.pass("Url testdatasi ile verilen url'i test eder");

//Miktar kutusunun gorunurlugunu dogrula
softAssert.assertTrue(testotomasyonPage.MiktarKutusu.isDisplayed(),"Miktar kutusu görünmüyor");
extentTest.pass("Kullanici miktar kutsunu görür");
//Miktar kutusunda + butonuna 2 kere bas
Actions actions=new Actions(Driver.getDriver());
actions.moveToElement(testotomasyonPage.MiktarKutusuArtiButton).doubleClick(testotomasyonPage.MiktarKutusuArtiButton).perform();
extentTest.info("Kullanici miktar kutusuna iki kez tiklar");

//Add to cart butonuna tikla
    testotomasyonPage.AddToCart.click();
    extentTest.info("Kullanici Add to cart butonuna tiklar");

//Your Cart butonunun gorunurlugunu test et
        softAssert.assertTrue(testotomasyonPage.YourCardButton.isEnabled(),"Your Cart buttonu gözükmüyor");
        extentTest.pass("Kullanici Your Cart butonunu görür");
//Your Cart butonunun sayisininin 3 oldugunu dogrula
softAssert.assertTrue(testotomasyonPage.YourCartUcIkon.isDisplayed(),"Your Cart butonunda 3 gözükmüyor ");
extentTest.pass("Kullanici Your Cart butonunda 3 sayisini görür");

 //Your cart butonuna tikla
        testotomasyonPage.YourCardButton.click();
        extentTest.pass("Kullanici Your Card Butonuna tiklar");

 //Sayfa url'sinin "https://testotomasyonu.com/shoppingCart" oldugunu test et
String expectedShoppingCartSayfaUrl=ConfigReader.getProperty("ShoppingCart");
String actualShoppingCartSayfaUrl=Driver.getDriver().getCurrentUrl();
softAssert.assertEquals(actualShoppingCartSayfaUrl,expectedShoppingCartSayfaUrl,"url test datasi ile verilen url ayni değildir");
extentTest.pass("url test datasi ile verilen url'i test edilir");
ReusableMethods.bekle(5);
 //Sepette urun bulundugunu test et
        softAssert.assertTrue(testotomasyonPage.ContinueShoppingButon.isDisplayed(),"ContinueShoppingButon butonu gözükmüyor");
        extentTest.pass("Kullanici sepette urun olduğunu ContinueShoppingButon ile görür");

 //Urun miktarinin 3 oldugunu test et
softAssert.assertTrue(testotomasyonPage.UrunMiktar.isDisplayed(),"Urün adedi gözükmüyor");
extentTest.pass("Kullanici sectigi ürün  adedini görür");
softAssert.assertAll();
ReusableMethods.bekle(5);

    }


    @Test
    public void TC_005() {

        extentTest=extentReports.createTest("Bir ürün seçip bütün adimlar tamamlanir"
                ,"Kullanici bir ürün seçer ve sonrasindaki bütün adimlar gerçekleştirir");
        SoftAssert softAssert=new SoftAssert();
        TestotomasyonPage testotomasyonPage=new TestotomasyonPage();

    //url` ye git
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        extentTest.info("kullanici testotomasyonu anasayfaya gider");

    //Sayfaya gittigini dogrula
        String expectedUrlIcerik=ConfigReader.getProperty("toUrl");
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrlIcerik, "Anasayfa url testdatası ile verilen url ayni değildir");
        extentTest.pass("url testdatası ile verilen url ayni olduğunu doğrular");

    //Top Selling Products bölümünün görünürlüğü test et
        softAssert.assertTrue(testotomasyonPage.TopSellingYazi.isDisplayed(),"Top Selling Products yazisi görünmüyor");
        extentTest.pass("Kullanici Top Selling Products yazisi görür");

    //View All Products butonunun tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.ViewAllProducts.isEnabled());
        extentTest.pass("Kullanici View All Products butonunu görür");
        ReusableMethods.bekle(3);

    //View All Products butonuna tikla
        ReusableMethods.bekle(3);
        testotomasyonPage.ViewAllProducts.click();
        extentTest.info("Kullanici View All Products butonunu tiklar");

    //Sayfa url'sinin "https://testotomasyonu.com/trending/all-products" oldugunu test et
        String expectedAllProducts=ConfigReader.getProperty("AllProducts");
        String actualALLproducts=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualALLproducts,expectedAllProducts,"View All Products url testdatasi ile verilen url farklidir");
        extentTest.pass("url testdatasi ile verilen url test edilir");

     //Kategoride 0'dan fazla urun bulundugunu dogrula
         int viewAllUrun=testotomasyonPage.UrunSonucElementi.size();
         softAssert.assertTrue(viewAllUrun>0,"Arama sonucunda 0 fazla urun bulunamadi");
        extentTest.pass("Kullanici arama sonucunda 0 fazla ürün görür");

        //Listedeki ilk urunun uzerine git
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(testotomasyonPage.TopSellingIlkUrun).perform();
        ReusableMethods.bekle(5);
        //Urun kutusunun uzerinde dururken gorunur olan Add to Cart butonunun tiklanabilirligini test et
        softAssert.assertTrue(testotomasyonPage.AddToCardButton.isDisplayed(),"Add to Cart butonu görünmüyor");
        extentTest.pass("Kullanici urun uzerinde Add to cart butonunu görür");

    //Add to cart butonuna tikla
    testotomasyonPage.AddToCardButton.click();
     extentTest.pass("Kullanici urun uzerinde Add to cart butonuna tiklar");
    //Product Added To Cart! Yazisinin ciktigini dogrula
     softAssert.assertTrue(testotomasyonPage.AddToCardButton.isDisplayed()," Product Added To Cart! yazisi gözükmüyor");
     extentTest.pass("Kullanici Product Added To Cart! Yazisini görür");
    //Your Cart butonunun gorunurlugunu test et
     softAssert.assertTrue(testotomasyonPage.YourCardButton.isEnabled(),"Your Cart buttonu gözükmüyor");
     extentTest.pass("Kullanici Your Cart butonunu görür");
    //Your Cart butonunun sayisininin 1 oldugunu dogrula
     softAssert.assertTrue(testotomasyonPage.YourCardButton1.isDisplayed(),"Your Cart butonunun da 1 gözükmüyor");
     extentTest.pass(" Your Cart butonunun sayisininin 1 oldugunu dogrular");
    //Your cart butonuna tikla
     testotomasyonPage.YourCardButton.click();
     extentTest.pass("Kullanici Your Card Butonuna tiklar");
     ReusableMethods.bekle(5);
    //Sayfa url'sinin "https://testotomasyonu.com/shoppingCart" oldugunu test et
     String expectedShopingCartUrl=ConfigReader.getProperty("ShopingCart");
     String actualShopingCartUrl=Driver.getDriver().getCurrentUrl();
     softAssert.assertEquals(actualShopingCartUrl,expectedShopingCartUrl,"Your cart url testdatasi ile verilen url farklidir");
     extentTest.pass("url testdatasi ile veilen url'i test eder");
     //Sepette urun bulundugunu test et
        softAssert.assertTrue(testotomasyonPage.ContinueShoppingButton.isDisplayed(),"ContinueShoppingButon butonu gözükmüyor");
        extentTest.pass("Kullanici sepette urun olduğunu ContinueShoppingButon ile görür");
      //Checkout butonuna tikla
           testotomasyonPage.CheckoutButton.click();
            extentTest.pass("Kullanici Checkout butonunu tiklar");
      //Billing Address gorunurlugunu test et
        softAssert.assertTrue(testotomasyonPage.BillingAddress.isDisplayed(),"Billin Adress görünmüyor");
        extentTest.pass("Kullanici Billing Adress yazisini görür");
     //Add Address butonuna tikla
        testotomasyonPage.BillinAddAdressButton.click();
        extentTest.pass("Kullanici Add Address butonuna tiklar");
    //Name, Email,Mobil,address, address 2, city, postcode, ülke ve sehir bilgilerini doldur
        testotomasyonPage.Name.sendKeys(ConfigReader.getProperty("toName"));
        testotomasyonPage.Email.sendKeys(ConfigReader.getProperty("toEmail"));
        testotomasyonPage.Mobile.sendKeys(ConfigReader.getProperty("toMobile"));
        testotomasyonPage.Adress1.sendKeys(ConfigReader.getProperty("toAdress1"));
        testotomasyonPage.Adress2.sendKeys(ConfigReader.getProperty("toAdress2"));

        Select select=new Select(testotomasyonPage.Contry);
        select.selectByValue("231");

        Select select1=new Select(testotomasyonPage.AdressState);
        select1.selectByVisibleText("Istanbul Province");
        testotomasyonPage.City.sendKeys(ConfigReader.getProperty("toCity"));
        testotomasyonPage.Postcode.sendKeys(ConfigReader.getProperty("toPostcode"));
        extentTest.pass("Kullanici  Name, Email,Mobil,address, address 2, city, postcode, ülke ve sehir bilgilerini doldurur");
     //Add Address butonuna tikla
    testotomasyonPage.KayitAddAdressButon.click();
    //Billing Address listesinde adres bulundugunu test et
    softAssert.assertTrue(testotomasyonPage.AdressBox.isDisplayed(),"Adres kutusu gözükmüyor");
    extentTest.pass("Kullaniciya girdiği bilgiler gösterilir");
    ReusableMethods.bekle(2);
    //Billing Address butonunu tıklar
     testotomasyonPage.BillngAdressButton.click();
     extentTest.info("Kullanici Billing Adress butonunu tiklar");
     ReusableMethods.bekle(2);

    //Delivery address same as billing address kutucuguna tikla
    testotomasyonPage.DeliveryAdressButton.click();
    extentTest.info("Kullanici Delivery address same as billing address kutucuguna tiklar");

    //Delivery Address bolumunun gorunur olmadigini test et
    softAssert.assertFalse(!testotomasyonPage.DeliveryYazi.isDisplayed(), "Delivery Address bolumu gorunur");
    extentTest.pass("Kullanici Delivery Address kutusunu görmez");

    //Delivery address same as billing address kutucugunu unchecked yap
    testotomasyonPage.DeliveryAdressButton.click();
    extentTest.info("Kullanici Delivery address same as billing address kutucugunu unchecked yapar");

    //Delivery Address bolumunun gorunur oldugunu test et
            softAssert.assertTrue(testotomasyonPage.DeliveryAdressButton.isDisplayed(),"Delivery Address bolumu gorumez");
            extentTest.info("Kullanici Delivery Address bolumunu görür");

    //Add Address butonuna tikla
    testotomasyonPage.DeliveryAddressAddAdress.click();
    extentTest.info("Kullanici Delivery Address bolumunden Add Adress butonunu tiklar");
    //Name, address, address 2, city, postcode, ülke ve sehir bilgilerini doldur
        testotomasyonPage.Name.sendKeys(ConfigReader.getProperty("toName"));
        testotomasyonPage.Email.sendKeys(ConfigReader.getProperty("toEmail"));
        testotomasyonPage.Mobile.sendKeys(ConfigReader.getProperty("toMobile"));
        testotomasyonPage.Adress1.sendKeys(ConfigReader.getProperty("toAdress1"));
        testotomasyonPage.Adress2.sendKeys(ConfigReader.getProperty("toAdress2"));

        Select select2=new Select(testotomasyonPage.Contry);
        select2.selectByValue("231");

        Select select3=new Select(testotomasyonPage.AdressState);
        select3.selectByVisibleText("Istanbul Province");
        testotomasyonPage.City.sendKeys(ConfigReader.getProperty("toCity"));
        testotomasyonPage.Postcode.sendKeys(ConfigReader.getProperty("toPostcode"));
        extentTest.pass("Kullanici Delivery Address bölümüne Name, Email,Mobil,address, address 2, city, postcode, ülke ve sehir bilgilerini doldurur");

    //Add Address butonuna tikla
    testotomasyonPage.DeliveryAddAdressOnayButton.click();
    extentTest.info("Kullanici Add Adress butonuna tiklar");
    //Delivery Address listesinde adres bulundugunu test et
     ReusableMethods.bekle(5);
    softAssert.assertTrue(testotomasyonPage.DeliveryAddressKalemIkon.isDisplayed(),"Delivery Address kalem ikonu gözükmüyor");
    extentTest.pass("Kullanici Delivery Address listesinde adres bulundugunu test eder");
    //Delivery Address listesinde addres sec
actions.moveToElement(testotomasyonPage.DeliveryAdressIcon).perform();
    testotomasyonPage.DeliveryAdressIcon.click();
    extentTest.info("Kullanici Delivery Address listesinde addres secer");
    ReusableMethods.bekle(5);

    //Billing Address butonunu tıklar
     testotomasyonPage.BillngAdressButton.click();
     extentTest.info("Kullanici Billing Address butonunu tıklar");

    //Shipping Methods listesinden kargo sec
    actions.moveToElement(testotomasyonPage.ShippingMethodsIcon).perform();
    testotomasyonPage.ShippingMethodsIcon.click();
    extentTest.info("Shipping Methods listesinden kargo secer");

    //  Payment Methods tan Cash on Delivery sec
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    ReusableMethods.bekle(5);
    testotomasyonPage.PaymentMethodsCashOnDelivery.click();
    extentTest.info("Kullanici  Payment Methods tan Cash on Delivery secer");
    ReusableMethods.bekle(5);

    //Return & Refund Policy and Terms and Condition  butonunu sec
   actions.sendKeys(Keys.HOME).perform();
    ReusableMethods.bekle(5);
    testotomasyonPage.ReturandRefundPolicy.click();
    extentTest.info("Return & Refund Policy and Terms and Condition  butonunu secer");

    // Place Order Now butonuna tikla
    testotomasyonPage.PlaceOrderNow.click();
    extentTest.info("Kullanici Place Order Now butonuna tiklar ");

    // Your order is successfully done! Yazisinin gorunur oldugunu test et
    softAssert.assertTrue(testotomasyonPage.YourOrderIsSuccessfullyYaziElementi.isDisplayed(),"Your order is successfully done! Yazisinin gorunmuyoe");
    extentTest.pass("Kullanici Your order is successfully done! Yazisinin gorunur oldugunu test eder");
    ReusableMethods.bekle(10);
    softAssert.assertAll();

    }
}
