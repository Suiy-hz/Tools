package com.leap.qa.utils.DataGenerator;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by qingshuang on 2018/12/12
 */
public class EmailAddressGenerator {


    public static String generateEmailAddress() {
        StringBuilder result = new StringBuilder();
        result.append(RandomStringUtils.randomAlphanumeric(10));
        result.append("@");
        result.append(RandomStringUtils.randomAlphanumeric(5));
        result.append(".");
        result.append(RandomStringUtils.randomAlphanumeric(3));

        return result.toString().toLowerCase();
    }


}
