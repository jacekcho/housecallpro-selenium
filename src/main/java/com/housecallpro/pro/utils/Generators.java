package com.housecallpro.pro.utils;

import com.github.javafaker.Faker;

public class Generators {

    private static Faker faker = new Faker();

    public static String randomFirstName() {
        return faker.name().firstName();
    }

}
