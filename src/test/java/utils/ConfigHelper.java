package utils;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.IllegalFormatCodePointException;
import java.util.Properties;

@NoArgsConstructor(access = AccessLevel.PRIVATE) //WHY DO WE NEED THIS?
public class ConfigHelper {
    private static  final Properties CONFIG_FILE  = new Properties(); //Why is this in capitals?

    public static String getProperty(String key)
    {
        // Loads property file only once (when first getProperty() method called)
        if (CONFIG_FILE.isEmpty()){
            loadPropertyFile();
        }

        // Gets property from config file for the given key
        String fromConfigFile = CONFIG_FILE.getProperty(key);

        // Checks for property in environment.  If not found returns config file value as default
        return System.getProperty(key, fromConfigFile);
    }


    private static void loadPropertyFile()
    {

        try {
            Path target = Paths.get("src/test/java/resources");
            String absPath = target.toAbsolutePath().toString();
            String fileName = absPath+"/config.properties";

            FileReader reader = new FileReader(fileName);

            CONFIG_FILE.load(reader);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

}
