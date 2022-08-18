package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    public Properties prop;

    public Properties init_prop() {
        prop = new Properties();


        try {
            FileInputStream ip = new FileInputStream("E:\\Laxmikant\\DBI\\DBI\\src\\test\\resources\\config\\config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prop;
    }
}
