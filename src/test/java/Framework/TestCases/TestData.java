package Framework.TestCases;

import Framework.Utility.TestDataReader;

public class TestData {

    public static void main(String[] args) {

        TestDataReader data = new TestDataReader();

        System.out.println(data.getData("validEmail"));
        System.out.println(data.getData("validPassword"));
        System.out.println(data.getData("searchProduct"));
    }
}