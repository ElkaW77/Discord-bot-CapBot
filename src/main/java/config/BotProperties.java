package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BotProperties {
    private String token = "TOKEN";
    private static BotProperties INSTANCE;

    private BotProperties() {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(".env.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.token = prop.getProperty("KEY_TOKEN");
    }

    public static BotProperties getInstance() throws Exception {
        if(INSTANCE == null) {
            INSTANCE = new BotProperties();
        }
        return INSTANCE;
    }

    public String getToken() {
        return token;
    }
}
