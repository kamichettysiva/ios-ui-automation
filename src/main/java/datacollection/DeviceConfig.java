package datacollection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by twe on 03/03/2017.
 */
public class DeviceConfig {
    public static Map<String, String> deviceUrl = new HashMap<String, String>() {
        {
            put("7p", "http://localhost:8101/session");
            put("7", "http://localhost:8102/session");
        }
    };

    public static Map<String, String> bundleId = new HashMap<String, String>() {
        {
            put("my", "com.iproperty.myipropertyapp.developer");
            put("sf", "");
        }
    };

    public static Map<String, String> appPath = new HashMap<String, String>() {
        {
            put("my", "/Users/sivakumar/Downloads/iPropertyMY-Developer.app");
            put("sf", "");
        }
    };


//    public static String appPath = "/Users/twe/Documents/app/iPropertyMY-Developer.app";

    public static String commandPath = "/Users/sivakumar/Downloads/fbsimctl/fbsimctl";

//    public static String bundleId = "com.iproperty.myipropertyapp.developer";

    public static Map<String, String> deviceInfo = new HashMap<String, String>() {
        {
            put("7p", "AEB4A701-905D-48B2-9B67-0D528DE339C0");
            put("7", "6B35A7EE-0C66-456E-9E2C-593EB9D18A15");
        }
    };
}
