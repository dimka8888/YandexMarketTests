import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.clipboard.ClipboardContentType.URL;

public class Main {

    public static AndroidDriver<MobileElement> initializeDriver() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "your_device_name");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "ru.yandex.market");
        caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".start.YandexStartViewActivity");

        return new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
    }

    public static void main(String[] args) {
        AndroidDriver<MobileElement> driver;
        try {
            driver = initializeDriver();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }


    }
}