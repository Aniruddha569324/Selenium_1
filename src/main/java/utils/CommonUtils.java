package utils;

import com.github.javafaker.Faker;
import config.DriverFactory;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class CommonUtils {

    Faker faker_US = new Faker(new Locale("en-US"));
    static Faker faker_DE = new Faker(new Locale("en-US"));

    public static String generateRandomAlphabetic(int length)
    {
        return RandomStringUtils.randomAlphabetic(length);
    }

    public static String generateFirstName()
    {
        return faker_DE.name().firstName();
    }

    public static String generateLastName()
    {
        return faker_DE.name().lastName();
    }

    public static String generateFullName()
    {
        return faker_DE.name().fullName();
    }

    public static String generateUserName()
    {
        return faker_DE.name().username();
    }

    public static String generatePassword()
    {
        //return faker_DE.internet().password(8, 12, true, true);
        return faker_DE.regexify("[A-Z]{2}") +
                        faker_DE.regexify("[a-z]{4}") +
                        faker_DE.regexify("[0-9]{2}") +
                        faker_DE.regexify("[@#$%]{1}");
    }
}
