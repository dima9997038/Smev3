package mipris.smev3.repository;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertyUtil {
    private static final Properties PROPERTIES=new Properties();
    static {
        loadProperties();
    }

    public static String get(String key){
        return PROPERTIES.getProperty(key);
    }

    private static void loadProperties() {
      try  {
          InputStream resourceAsStream = PropertyUtil.class.getClassLoader().getResourceAsStream("application.properties");
          PROPERTIES.load(resourceAsStream);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }

    private PropertyUtil() {
    }
}
