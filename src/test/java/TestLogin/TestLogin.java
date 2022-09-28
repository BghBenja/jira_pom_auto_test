package TestLogin;

import com.codecool.FileReader;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestLogin {

    static WebDriver webDriver;

    private static ChromeOptions browserOptions;

    @BeforeAll
    public void setProperty(){
        System.setProperty("webdriver.chrome.driver", FileReader.getValueByKey("driver.location"));
    }

    @BeforeEach
    public void openNewTab(){
        browserOptions = new ChromeOptions();
        browserOptions.addArguments("--incognito");
        webDriver = new ChromeDriver(browserOptions);
    }
}
