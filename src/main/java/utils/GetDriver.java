package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.util.concurrent.TimeUnit;

public class GetDriver {
    public static WebDriver driverWeb;

    public WebDriver onPage(String url) {
        driverWeb.manage().window().maximize();
        driverWeb.get(url);
        driverWeb.manage().deleteAllCookies();
        return driverWeb;
    }

    public static GetDriver web() {
        driverWeb = getDriverWeb();
        driverWeb.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        return new GetDriver();
    }

    public static WebDriver getDriverWeb() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver");
        ChromeOptions chropts = new ChromeOptions();
        chropts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return new ChromeDriver(chropts);

    }

}
