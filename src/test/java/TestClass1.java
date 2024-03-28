import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class TestClass1 {
//    @BeforeTest
//    public  void WebDriverSetUp(){
//        _globalDriver = new ChromeDriver();
//    }



     @Test
    public void testUploadNewAd(){
          ChromeDriver driver = new ChromeDriver();

          driver.get("https://elenta.lt");
          WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
          cookieButton.click();

          WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[3]"));
          loginButton.click();

          driver.findElement(By.id("UserName")).sendKeys("belekoks");
          driver.findElement(By.id("Password")).sendKeys("Belekoks@23");
          driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[4]/td[2]/input")).click();

          driver.findElement(By.id("submit-new-ad-nav-button")).click();

          WebElement cattegory = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/a"));
          cattegory.click();

          WebElement subCattegory = driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/a"));
          subCattegory.click();

          driver.findElement(By.id("title")).sendKeys(generateUserName());
          driver.findElement(By.id("text")).sendKeys(generateUserName() + " " + generateUserName() + " " + generateUserName() + generateUserName());
          driver.findElement(By.id("price")).sendKeys("15");
          driver.findElement(By.id("location-search-box")).sendKeys("Vilnius");
          driver.findElement(By.id("phone")).sendKeys("+370666684666");
          driver.findElement(By.id("email")).sendKeys(generateRandomEmail());

          driver.findElement(By.id("submit-button")).click(); }



          try {
        TimeUnit.SECONDS.sleep(5);
    }  catch (InterruptedException e){
               e.printStackTrace();
    }



    @Test
    public void testELentosregistration() {//jei atidaro teising
         ChromeDriver driver = new ChromeDriver();

         driver.get("https://elenta.lt");
         WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
         cookieButton.click();

        WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[3]"));
        login.click();

        WebElement register = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[10]/td/p/a"));
        register.click();

        driver.findElement(By.id("UserName")).sendKeys(generateUserName());
        driver.findElement(By.id("Email")).sendKeys(generateRandomEmail());
        driver.findElement(By.id("Password")).sendKeys("Belekoks@23");
        driver.findElement(By.id("Password2")).sendKeys("Belekoks@23");
        String registruotis = new String ("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input");
        WebElement registration = driver.findElement(By.xpath(registruotis));
        registration.click();
        WebElement valifdationText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1/b"));
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
          ChromeDriver driver = new ChromeDriver();

          driver.get("https://elenta.lt");
          WebElement cookieButton = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/button[1]/p"));
          cookieButton.click();

         WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[3]"));
         login.click();

         WebElement register = driver.findElement(By.xpath("/html/body/div[1]/form/fieldset/table/tbody/tr[10]/td/p/a"));
         register.click();

         //driver.findElement(By.id("UserName")).sendKeys();
         driver.findElement(By.id("Email")).sendKeys(generateRandomEmail());
         driver.findElement(By.id("Password")).sendKeys("Belekoks@23");
         driver.findElement(By.id("Password2")).sendKeys("Belekoks@23");
         String registruotis = new String ("/html/body/div[1]/form/fieldset/table/tbody/tr[11]/td[2]/input");
         WebElement registration = driver.findElement(By.xpath(registruotis));
         registration.click();
         WebElement valifdationText = driver.findElement(By.xpath("/html/body/div[1]/div[2]/h1/b"));
         Assert.assertEquals(valifdationText.getText(), "Jūs sėkmingai prisiregistravote!");



     }



























}