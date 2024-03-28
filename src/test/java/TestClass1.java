import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass1 {
    @Test
    public void atidarytiNarsykle()
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.lt");
        Assert.assertEquals("f", "y");
    }

}
