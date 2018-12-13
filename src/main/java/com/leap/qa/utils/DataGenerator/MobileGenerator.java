package com.leap.qa.utils.DataGenerator;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Created by qingshuang on 2018/12/12
 */
public class MobileGenerator {

    private static final int[] MOBILE_PREFIX = new int[] { 133, 153, 177, 180,
            181, 189, 134, 135, 136, 137, 138, 139, 150, 151, 152, 157, 158, 159,
            178, 182, 183, 184, 187, 188, 130, 131, 132, 155, 156, 176, 185, 186,
            145, 147, 170 };

    private static String genMobilePre() {
        return "" + MOBILE_PREFIX[RandomUtils.nextInt(0, MOBILE_PREFIX.length)];
    }

    /**
     * 随机生成手机号码，11位
     * @return
     */
    public static String generateMobile() {
        return genMobilePre() + StringUtils
                .leftPad("" + RandomUtils.nextInt(0, 99999999 + 1), 8, "0");
    }

    /**
     * 生成假的手机号，以19开头
     */
    public static String generateFake() {
        return "19" + StringUtils
                .leftPad("" + RandomUtils.nextInt(0, 999999999 + 1), 9, "0");
    }


}


