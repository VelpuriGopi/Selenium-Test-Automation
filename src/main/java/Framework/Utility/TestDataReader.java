package Framework.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestDataReader {

    private Properties properties;

    public TestDataReader() {

        properties = new Properties();

        try {

            FileInputStream file =
                    new FileInputStream("src/main/resources/testdata.properties");

            properties.load(file);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    public String getData(String key) {

        return properties.getProperty(key);
    }
}