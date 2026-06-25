package Framework.TestCases;

import Framework.Utility.ConfigReader;

public class TestConfig {

    public static void main(String[] args) {

        ConfigReader config = new ConfigReader();

        System.out.println(config.getBrowser());
        System.out.println(config.getBaseUrl());
        System.out.println(config.getImplicitWait());
    }
}