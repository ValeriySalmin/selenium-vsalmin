package utils;

import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by selenium on 05.08.2015.
 */
public class PropertyLoader {

    //private static String workingDir = System.getProperty("user.dir");
    private static String workingDir = "e:\\work\\Project\\selenium-vsalmin";

    private static final String PROPERTY_FILE = workingDir + "\\target\\classes\\application.properties";
    public static String loadProperty(String name){
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(PROPERTY_FILE));
        }
        catch (IOException e){
            Assert.fail(Log4Test.info(name));
        }
        String value="";
        if (name != null){
            value = props.getProperty(name);
        }
        return value;
    }
}
