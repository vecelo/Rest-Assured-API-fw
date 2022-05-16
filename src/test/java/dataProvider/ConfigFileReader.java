package dataProvider;

import enums.DriverType;
import enums.EnvironmentType;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
    private final Properties proper;
    private final String propertyFilePath = "config//Configuration.properties";

    public ConfigFileReader() throws IOException {

        BufferedReader reader;
        reader = new BufferedReader(new FileReader(propertyFilePath));
        proper = new Properties();
        proper.load(reader);
    }

    public String getDriverPath() {
        String driverPath = proper.getProperty("driverPath");
        if (driverPath != null) return driverPath;
        else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
    }

    public String getApplicationUrl() {
        String url = proper.getProperty("url");
        if (url != null) return url;
        else throw new RuntimeException("url not specified in the Configuration.properties file.");
    }

    public long getImplicitlyWait() {
        String implicitlyWait = proper.getProperty("implicitlyWait");
        if (implicitlyWait != null) {
            try {
                return Long.parseLong(implicitlyWait);
            } catch (NumberFormatException e) {
                throw new RuntimeException("Not able to parse value : " + implicitlyWait + " in to Long");
            }
        }
        return 30;
    }

    public DriverType getBrowser() {
        String checkBrowser = proper.getProperty("browser");
        if (checkBrowser == null || checkBrowser.equals("chrome"))
            return DriverType.CHROME;
        else if (checkBrowser.equals("firefox"))
            return DriverType.FIREFOX;
        else throw new RuntimeException("browser not specified in the Configuration.properties file.");
    }

    public EnvironmentType getEnvironment() {
        String checkEnv = proper.getProperty("environment");
        if (checkEnv == null || checkEnv.equals("local"))
            return EnvironmentType.LOCAL;
        else if (checkEnv.equals("remote"))
            return EnvironmentType.REMOTE;
        else throw new RuntimeException("environment not specified in the Configuration.properties file.");
    }

    public Boolean getBrowserWindowSize() {
        String windowSize = proper.getProperty("windowMaximize");
        if (windowSize != null)
            return Boolean.valueOf(windowSize);
        return true;
    }
}
