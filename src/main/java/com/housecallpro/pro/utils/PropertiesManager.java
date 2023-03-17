package com.housecallpro.pro.utils;


import com.netflix.config.DynamicProperty;

import java.util.Base64;

public class PropertiesManager {

    public static String getHousecallproUrl() {
        return DynamicProperty.getInstance("housecallpro.url").getString();
    }

    public static String getUserLogin() {
        return DynamicProperty.getInstance("user.login").getString();
    }

    public static String getUserPassword() {
        return getDecodedValue(DynamicProperty.getInstance("user.password").getString());
    }

    private static String getDecodedValue(String encodedValue) {
        return new String(Base64.getDecoder().decode(encodedValue));
    }

}