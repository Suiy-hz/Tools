package com.leap.qa.utils.DataGenerator;

import com.leap.qa.utils.DataGenerator.utils.ChineseAreaList;
import com.leap.qa.utils.DataGenerator.utils.ChineseCharUtils;
import org.apache.commons.lang3.RandomUtils;

/**
 * Created by qingshuang on 2018/12/12
 */
public class AddressGenerator{

    /**
     * 获取省市
     * @return
     */
    private static String genProvinceAndCity() {
        return ChineseAreaList.provinceCityList.get(
                RandomUtils.nextInt(0, ChineseAreaList.provinceCityList.size()));
    }

    public static String generateAddress() {

        StringBuilder result = new StringBuilder(genProvinceAndCity());
        result.append(ChineseCharUtils.genRandomLengthChineseChars(3, 4) + "路");
        result.append(RandomUtils.nextInt(1, 8000) + "号");
        result
                .append(ChineseCharUtils.genRandomLengthChineseChars(2, 3) + "小区");
        result.append(RandomUtils.nextInt(1, 20) + "单元");
        result.append(RandomUtils.nextInt(101, 2500) + "室");


        return result.toString();
    }


}
