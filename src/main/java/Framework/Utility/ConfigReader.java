package Framework.Utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private Properties properties;

    public ConfigReader() {
        properties = new Properties();

        try {
            FileInputStream file = new FileInputStream(
                    "src/main/resources/config.properties");

            properties.load(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser() {
        return properties.getProperty("browser");
    }

    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    public int getImplicitWait() {
        return Integer.parseInt(
                properties.getProperty("implicitWait"));
    }

    public int getCloseDelay() {

        return Integer.parseInt(
                properties.getProperty("closeDelay"));
    }
}
