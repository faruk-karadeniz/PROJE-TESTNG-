package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
import java.util.logging.XMLFormatter;

public class TestotomasyonPage {


 public  TestotomasyonPage()
 {
  PageFactory.initElements(Driver.getDriver(),this);
 }

 @FindBy(id= "global-search")
 public WebElement aramaKutusu;
 @FindBy(className = "product-count-text")
 public WebElement aramaSonucYaziElementi;
 @FindBy(xpath = "(//*[text()='Account'])[1]")
 public WebElement accountLinki;
 @FindBy(xpath = "(//*[@class='form-control'])[1]")
 public WebElement emailKutusu;
 @FindBy(xpath = "//input[@type='password']")
 public WebElement passwordKutusu;
 @FindBy(id = "submitlogin")
 public WebElement LoginSayfasiLoginButonu;
 @FindBy (xpath = "(//*[text()='Logout'])[2]")
 public WebElement logoutButonu;
 @FindBy (xpath = "//*[@class='product-box my-2  py-1']")
 public List<WebElement> bulunanSonucElementleriListesi;
 @FindBy (xpath = "//*[text()='Email/Password Wrong!']")
 public WebElement gecersizPasswordElementiYazi;
 @FindBy (xpath = "//*[text()='Customer not found!']")
 public WebElement gecersizUsenameElementYazi;
 @FindBy (xpath = "//div[@class=' heading-sm mb-4']")
 public WebElement ilkUrunSayfasindakiIsimElementi;
 @FindBy(xpath = "//*[text()='Register Now']")
 public WebElement RegisterNow;
 @FindBy(xpath = "//*[@class='sign-up ']")
 public WebElement signupButton;
 @FindBy(xpath = "//*[@id='firstName']")
 public WebElement firstNameKutu;
 @FindBy(xpath = "//*[@id='lastName']")
 public WebElement lastNameKutu;
 @FindBy(xpath = "//*[@id='signupemail']")
 public WebElement emailKayitKutu;
 @FindBy(xpath = "//*[@id='signuppassword']")
 public WebElement passwordKayitKutu;
 @FindBy(xpath = "//*[@id='comfirmPassword']")
 public WebElement comfirmPasswordKutu;
 @FindBy(xpath = "//*[@id='btn-submit-form']")
 public WebElement signupKayitButton;
 @FindBy (xpath = "//*[text()='First name is required']")
 public WebElement firstNameRequired;
 @FindBy (xpath = "//*[text()='Last name is required']")
 public WebElement LastNameRequired;
 @FindBy (xpath = "//*[text()='Email address is required']")
 public WebElement EmailRequired;
 @FindBy (xpath = "//*[text()='Password is required']")
 public WebElement PasswordRequired;
 @FindBy (xpath = "//*[text()='Confirm password does not match']")
 public WebElement ConfirmPasswordRequired;
 @FindBy (xpath = "//*[text()='Login Now']")
 public WebElement LoginNow;
 @FindBy(xpath = "//*[text()=' Login Success']")
 public WebElement loginSuccess;
 @FindBy(xpath = "//*[text()='Update Profile']")
 public WebElement UpdateProfile;
 @FindBy (xpath = "//*[@name='firstName']")
 public  WebElement ProfilFirstName;
 @FindBy (xpath = "//*[@name='lastName']")
 public WebElement ProfilLastName;
 @FindBy (xpath = "(//input[@name='email'])[1]")
 public WebElement ProfilEmail;
 @FindBy(xpath = "//*[text()='My Profile']")
 public WebElement MyProfile;
 @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
 public WebElement Wishlist;
 @FindBy(xpath = "//*[text()='Manage Address']")
 public WebElement MyManageAdress;
 @FindBy(xpath = "//*[text()='Change Password']")
 public WebElement MyChangePassword;
 @FindBy(xpath = "(//*[text()='Electronics'])[3]")
 public WebElement Electronics;
 @FindBy (xpath = "//li[@class='current']")
 public WebElement electronicsSayfaYazi;
 @FindBy(xpath = "(//*[text()='Men Fashion'])[3]")
 public WebElement MenFashion;
@FindBy(xpath = "//li[@class='current']")
 public WebElement MenFashionSayfaYazi;
@FindBy (xpath = "(//*[text()='Women Fashion'])[3]")
 public WebElement WomenFashion;
@FindBy(xpath = "//li[@class='current']")
public WebElement WomenFashionSayfaYazi;
@FindBy (xpath = "(//*[text()='Shoes'])[3]")
 public WebElement Shoes;
@FindBy (xpath = "//li[@class='current']")
 public WebElement ShoesSayfaYazi;
@FindBy (xpath = "(//*[text()='Furniture'])[3]")
public  WebElement Furniture;
@FindBy (xpath = "//li[@class='current']")
 public WebElement FurnitureSayfaYazi;
@FindBy(xpath = "(//*[text()='Travel'])[3]")
 public WebElement Travel;
@FindBy(xpath = "//li[@class='current']")
 public WebElement TravelSayfaYazi;
@FindBy(xpath = "(//*[text()='Kids Wear'])[3]")
public WebElement KidsWear;
@FindBy (xpath = "(//*[text()='Boys'])[1]")
 public WebElement KidsWearBoys;
 @FindBy (xpath = "(//*[text()='Girls'])[1]")
 public WebElement KidsWearGirl;
 @FindBy(xpath = "//li[@class='current']")
 public WebElement KidsWearSayfaYazi;
 @FindBy(xpath = "(//*[text()='Grocery'])[3]")
 public WebElement Grocery;
 @FindBy(xpath = "//li[@class='current']")
public WebElement GrocerySayfaYaziElementi;
@FindBy (xpath = "//li[@class='has-sub']")
 public List<WebElement> AnasayfaKategoriler;
@FindBy(xpath = "(//*[@id='dropdownMenuLink'])[1]")
 public WebElement selectCategory;
@FindBy(xpath = "(//*[text()='Electronics'])[1]")
 public WebElement selectElectronics;
 @FindBy(xpath = "(//*[text()='Men Fashion'])[1]")
 public WebElement selectMenFashion;
 @FindBy(xpath = "(//*[text()='Women Fashion'])[1]")
 public WebElement selectWomenFashion;
 @FindBy(xpath = "(//*[text()='Shoes'])[1]")
 public WebElement selectShoes;
 @FindBy(xpath = "(//*[text()='Furniture'])[1]")
 public WebElement selectFurniture;
 @FindBy(xpath = "(//*[text()='Travel'])[1]")
 public WebElement selectTravel;
 @FindBy(xpath = "(//*[text()='Kids Wear'])[1]")
 public WebElement selectKidsWear;
 @FindBy(xpath = "(//*[text()='Grocery'])[1]")
 public WebElement selectGrocery;
 @FindBy(xpath = "(//*[@class='view_all'])[1]")
 public WebElement ViewAllProducts;
@FindBy(xpath = "//*[text()='16 Products Found']")
 public List<WebElement> UrunSonucElementi;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement IlkUrun;
@FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement AddToCardButton;
@FindBy (xpath = "//*[text()='Product Added To Cart!']")
 public WebElement ProductAddedToCart;
@FindBy(xpath = "(//*[@class='cart-count basket-count'])[1]")
 public WebElement YourCardButton1;
@FindBy(xpath = "(//*[text()='Your Cart'])[1]")
 public WebElement YourCardButton;
@FindBy (xpath = "//*[@class='button-white']")
 public WebElement ContinueShoppingButon;
@FindBy(xpath = "//*[@class='remove']")
 public WebElement Xbutton;
@FindBy(xpath = "//*[text()='Are you sure?']")
 public WebElement AreYouSureYazi;
@FindBy(xpath = "//*[text()='Yes, remove it!']")
 public WebElement YesButton;
@FindBy(xpath = "//*[text()='Shopping cart is empty']")
 public WebElement ShoppingCartIsEmptyYazi;
@FindBy (xpath = "//*[text()='Wait for it... ']")
 public WebElement WaitForItYazi;
@FindBy (xpath = "//*[text()='Most Popular Products']")
 public WebElement MostPopularProducts;
@FindBy(xpath = "//*[@class='nav-item ']")
 public List<WebElement> MostPopularProductsKategori;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement ElectronicBirinciSayfaUrunIkon;
@FindBy (xpath = "(//*[@class='page-item'])[1]")
 public WebElement ElectronicIkinciSayfaButton;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement ElectronicIkinciSyfaUrun1;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement ElectronicIkinciSyfaUrun1Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[4]")
 public WebElement ElectronicIkinciSyfaUrun2;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[4]")
 public WebElement ElectronicIkinciSyfaUrun2Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement MenFashionSayfaUrun1;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement MenFashionSayfaUrun1Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
 public WebElement MenFashionSayfaUrun2;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
 public WebElement MenFashionSayfaUrun2Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[5]")
 public WebElement MenFashionSayfaUrun3;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[5]")
 public WebElement MenFashionSayfaUrun3Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
 public WebElement WomenFashionSayfaUrun1;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
 public WebElement WomenFashionSayfaUrun1Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[6]")
 public WebElement WomenFashionSayfaUrun2;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[6]")
 public WebElement WomenFashionSayfaUrun2Ikon;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement ShoesSyfaUrun1;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement ShoesSyfaUrun1Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[5]")
 public WebElement ShoesSyfaUrun2;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[5]")
 public WebElement ShoesSyfaUrun2Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement FurnitureUrun1;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement FurnitureUrun1Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
 public WebElement FurnitureUrun2;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
 public WebElement FurnitureUrun2Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
 public WebElement FurnitureUrun3;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
 public WebElement FurnitureUrun3Ikon;
 @FindBy (xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public WebElement TravelUrun1;
 @FindBy (xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement TravelUrun1Ikon;
 @FindBy (xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
 public WebElement TravelUrun2;
 @FindBy (xpath = "(//*[@class='add-to-cart-img'])[2]")
 public WebElement TravelUrun2Ikon;
 @FindBy (xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
 public WebElement TravelUrun3;
 @FindBy (xpath = "(//*[@class='add-to-cart-img'])[3]")
 public WebElement TravelUrun3Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
public WebElement KidsWearUrun1;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement KidsWearUrun1Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[2]")
 public WebElement KidsWearUrun2;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[2]")
 public WebElement KidsWearUrun2Ikon;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[3]")
 public WebElement KidsWearUrun3;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[3]")
 public WebElement KidsWearUrun3Ikon;
@FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
public WebElement GroceryUrun1;
 @FindBy(xpath = "//*[@class='add-to-cart-img']")
 public WebElement GroceryUrun1Ikon;
 @FindBy (xpath = "(//*[@class='cart-count basket-count'])[1]")
 public WebElement YirmiIkon;
 @FindBy (xpath = "//*[@class='button-block button-place']")
 public  WebElement CheckoutButton;

 //US_004-->TC_002
 @FindBy(xpath = "//*[text()=' Top Selling Products  ']")
 public WebElement TopSellingYazi;
 @FindBy(xpath = "(//*[@class='view_all'])[1]")
 public WebElement viewAllProducts;
 @FindBy(xpath = "//*[text()='16 Products Found']")
 public List<WebElement> TopSellingProductsUrunSonucYazi;
 @FindBy(xpath = "(//*[@class='product-box mb-2 pb-1'])[1]")
 public  WebElement TopSellingIlkUrun;
 @FindBy(xpath = "(//*[@class='add-to-cart-img'])[1]")
 public WebElement AddtoCartbuton;
 @FindBy (xpath = "//*[text()='Product Tax']")
 public  WebElement ProductTaxUrun;

 //US_004-->TC_004
 @FindBy(id = "global-search")
 public WebElement SearchBox;
 @FindBy(xpath = "//*[text()='4 Products Found']")
 public List<WebElement> PhoneSonuc;
 @FindBy(xpath = "(//*[@class='prod-img'])[1]")
 public WebElement PhoneIlkUrun;
@FindBy(xpath = "//*[@class='quantitybox d-flex justify-content-center align-items-center']")
 public WebElement MiktarKutusu;
@FindBy(xpath = "//*[@value='Increase Value']")
 public WebElement MiktarKutusuArtiButton;
@FindBy(xpath = "//*[@class='add-to-cart']")
 public WebElement AddToCart;
@FindBy(xpath = "(//*[@class='cart-count basket-count'])[1]")
 public WebElement YourCartUcIkon;
@FindBy(xpath = "//*[@class='retro-notify-content']")
public WebElement ProductAddToCartYaziElement;
@FindBy(xpath = "//*[@value=\"3\"]")
 public WebElement UrunMiktar;

 //US_004-->TC_005
@FindBy(xpath = "//*[text()='  Billing Address ']")
 public WebElement BillingAddress;
@FindBy(xpath = "(//*[@class='btn-add-address'])[1]")
 public WebElement BillinAddAdressButton;
@FindBy(id = "name")
 public WebElement Name;
 @FindBy(id = "useremail")
 public WebElement Email;
 @FindBy(id = "usermobile")
 public WebElement Mobile;
 @FindBy(id = "address_1")
 public WebElement Adress1;
 @FindBy(id = "address_2")
 public WebElement Adress2;
 @FindBy(id = "country_id")
 public WebElement Contry;
 @FindBy(id = "add_address_state")
 public WebElement AdressState;
 @FindBy(id = "city")
 public WebElement City;
 @FindBy(id = "postcode")
 public WebElement Postcode;
@FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
 public WebElement KayitAddAdressButon;
@FindBy (xpath = "//*[@class='address-box']")
 public WebElement AdressBox;
@FindBy(xpath = "(//*[@class='checkmark'])[1]")
 public WebElement BillngAdressButton;
@FindBy(xpath = "(//*[text()='  Delivery Address '])")
 public WebElement DeliveryAdressButton;
@FindBy(xpath = "(//*[@class='btn-add-address'])[2]")
 public WebElement DeliveryAddressAddAdress;
@FindBy(xpath = "(//*[@class='heading-xs my-1'])[2]")
public WebElement DeliveryYazi;
@FindBy(xpath = "//*[@class='swal2-confirm swal2-styled']")
 public WebElement DeliveryAddAdressOnayButton;
@FindBy(xpath = "(//*[@class='checkmark'])[3]")
 public WebElement DeliveryAdressIcon;
@FindBy(xpath = "(//*[@class='checkmark'])[4]")
 public WebElement ShippingMethodsIcon;
@FindBy(xpath = "(//*[@class='d-flex justify-content-center align-items-center '])[1]")
 public WebElement PaymentMethodsCashOnDelivery;
@FindBy(xpath = "(//*[@class='mx-2'])[2]")
 public WebElement ReturandRefundPolicy;
@FindBy(xpath = "//*[@class='button-block button-place mt-3']")
 public WebElement PlaceOrderNow;
@FindBy(xpath = "(//*[@class='fa fa-pencil'])[2]")
 public WebElement DeliveryAddressKalemIkon;
@FindBy(xpath = "//*[text()='Your order is successfully done!']")
 public WebElement YourOrderIsSuccessfullyYaziElementi;
@FindBy(xpath = "//*[text()='Continue Shopping']")
 public WebElement ContinueShoppingButton;


}


