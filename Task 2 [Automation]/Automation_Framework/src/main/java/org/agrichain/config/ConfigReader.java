package org.agrichain.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    public Properties init_prop() {
        properties = new Properties();
        try {
            FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
            properties.load(ip);
        } catch (IOException e) {
            System.out.println("Error reading config file: " + e.getMessage());
            e.printStackTrace();
        }
        return properties;
    }
}
