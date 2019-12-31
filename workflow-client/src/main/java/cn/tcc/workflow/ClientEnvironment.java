package cn.tcc.workflow;

public class ClientEnvironment {

    private static final String PROFILES_ACTIVE = "spring.profiles.active";

    public static String getEnv() {
        return System.getProperty(PROFILES_ACTIVE);
    }
}
