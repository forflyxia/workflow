package cn.tcc.workflow;

import cn.tcc.foundation.core.ServerConfigProvider;
import cn.tcc.foundation.core.env.Env;

import java.util.ResourceBundle;

public class ClientConfig {

    private static final String SERVICE_ADDRESS_KEY = "workflow.service.address";
    private static volatile String Environment  = "";

    public static String getHostAddressValue() {
        if (Environment == "") {
            try {
                Environment = getPropertiesConfigValue(SERVICE_ADDRESS_KEY);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return Environment;
    }

    private static String getPropertiesConfigValue(String key) throws Exception {
        String env = ClientEnvironment.getEnv();
        if (env == null || env.isEmpty()) {
            throw new Exception("PROFILES_ACTIVE Setting error.");
        }
        String propertiesName = "";
        if (env.equalsIgnoreCase("tc")) {
            ServerConfigProvider serverConfigProvider = new ServerConfigProvider();
            Env localEnv = serverConfigProvider.getEnv();
            if (localEnv == null || localEnv.name() == null) {
                throw new Exception("OPT Setting error.");
            }
            propertiesName = String.format("clientconfig-%s", localEnv.name().toLowerCase());
        } else {
            propertiesName = String.format("clientconfig-%s", env);
        }
        ResourceBundle bundle = ResourceBundle.getBundle(propertiesName);
        if (bundle == null) {
            throw new Exception("Workflow client config resource can not find.");
        }
        return bundle.getString(key);
    }
}
