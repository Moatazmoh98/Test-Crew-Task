package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandler {

    public Properties loadDataFromPropertiesFile(String path) {
        Properties pro = new Properties();
        try {
            FileInputStream stream = new FileInputStream(path);
            pro.load(stream);
        } catch (IOException e) {

            System.out.println("error occurred is " + e.getMessage());
        }
        return pro;
    }
}
