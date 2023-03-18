package com.housecallpro.utils;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Generators {

    private static Faker faker = new Faker(Locale.US);

    public static String randomFirstName() {
        return faker.name().firstName();
    }

    public static String randomLastName() {
        return faker.name().lastName();
    }

    public static String randomMobile() {
        return faker.phoneNumber().cellPhone();
    }

    public static String randomEmail() {
        return faker.internet().emailAddress();
    }

    public static String randomItem() {
        return faker.food().fruit();
    }

    public static String randomSentence() {
        return faker.chuckNorris().fact();
    }
}
