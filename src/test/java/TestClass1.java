import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.color.ICC_ColorSpace;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class TestClass1 {
     WebDriver _globalDriver;



    @BeforeTest
    public  void WebDriverSetUp(){
        _globalDriver = new ChromeDriver();
   }


    @Test
    public void testUploadNewAd() {


        _globalDriver.get("https://elenta.lt");
        WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
        cookieButton.click();

        WebElement loginButton = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[3]"));
        loginButton.click();

        _globalDriver.findElement(By.id("UserName")).sendKeys("belekoks");
        _globalDriver.findElement(By.id("Password")).sendKeys("Belekoks@23");
        _globalDriver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).click();

        _globalDriver.findElement(By.id("submit-new-ad-nav-button")).click();

        WebElement cattegory = _globalDriver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/a"));
        cattegory.click();

        WebElement subCattegory = _globalDriver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/a"));
        subCattegory.click();

        _globalDriver.findElement(By.id("title")).sendKeys(generateUserName());
        _globalDriver.findElement(By.id("text")).sendKeys(generateUserName() + " " + generateUserName() + " " + generateUserName() + generateUserName());
        _globalDriver.findElement(By.id("price")).sendKeys("15");
        _globalDriver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
        _globalDriver.findElement(By.id("phone")).sendKeys("+370666684666");
        _globalDriver.findElement(By.id("email")).sendKeys(generateRandomEmail());

        _globalDriver.findElement(By.id("submit-button")).click();
    }



//       try
//
//    {
//        TimeUnit.SECONDS.sleep(5);
//    }  catch(
//    InterruptedException e)
//
//    {
//        e.printStackTrace();
//    }
//


    @Test
    public void testELentosregistration() {


         _globalDriver.get("https://elenta.lt");
         WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
         cookieButton.click();

        WebElement login = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[3]"));
        login.click();

        WebElement register = _globalDriver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[10]/td/p/a"));
        register.click();

        _globalDriver.findElement(By.id("UserName")).sendKeys(generateUserName());
        _globalDriver.findElement(By.id("Email")).sendKeys(generateRandomEmail());
        _globalDriver.findElement(By.id("Password")).sendKeys("Belekoks@23");
        _globalDriver.findElement(By.id("Password2")).sendKeys("Belekoks@23");
        String registruotis = new String ("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input");
        WebElement registration = _globalDriver.findElement(By.xpath(registruotis));
        registration.click();
        WebElement valifdationText = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/h1/b"));
        Assert.assertEquals( valifdationText.getText(), "Jūs sėkmingai prisiregistravote!");
        


    }
    public static String generateRandomEmail() {
            String[] domains = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
            String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};

            Random random = new Random();

            StringBuilder email = new StringBuilder();

            // Generate username part
            int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 characters
            for (int i = 0; i < usernameLength; i++) {
                String characterSet = characters[random.nextInt(2)]; // Selecting either alphabets or numbers

                char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
                email.append(randomChar);
            }
            email.append("@");

            // Selecting random domain
            String randomDomain = domains[random.nextInt(domains.length)];
            email.append(randomDomain);

            return email.toString();
        }

    public static String generateUserName(){
            String[] characters = {"abcdefghijklmnopqrstuvwxyz", "0123456789"};
            Random random = new Random();
            StringBuilder username = new StringBuilder();
            int usernameLength = random.nextInt(10) + 5; // Random length between 5 to 14 cha
            for (int i = 0; i < usernameLength; i++) {
                String characterSet = characters[random.nextInt(2)]; // Selecting either alph
                char randomChar = characterSet.charAt(random.nextInt(characterSet.length()));
                username.append(randomChar);
            }
             return username.toString();
        }

    @Test
    public void test11() {


          _globalDriver.get("https://elenta.lt");
          WebElement cookieButton = _globalDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
          cookieButton.click();

         WebElement login = _globalDriver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[3]"));
         login.click();

         WebElement register = _globalDriver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[10]/td/p/a"));
         register.click();

         //driver.findElement(By.id("UserName")).sendKeys();
         _globalDriver.findElement(By.id("Email")).sendKeys(generateRandomEmail());
         _globalDriver.findElement(By.id("Password")).sendKeys("Belekoks@23");
         _globalDriver.findElement(By.id("Password2")).sendKeys("Belekoks@23");
         String registruotis = new String ("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input");
         WebElement registration = _globalDriver.findElement(By.xpath(registruotis));
         registration.click();
         WebElement valifdationText = _globalDriver.findElement(By.xpath("/html/body/div[1]/div[2]/h1/b"));
         Assert.assertEquals(valifdationText.getText(), "Jūs sėkmingai prisiregistravote!");



     }



























}