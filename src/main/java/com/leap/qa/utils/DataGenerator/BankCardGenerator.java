package com.leap.qa.utils.DataGenerator;

import com.leap.qa.utils.DataGenerator.Enum.BankCardTypeEnum;
import com.leap.qa.utils.DataGenerator.Enum.BankNameEnum;
import com.leap.qa.utils.DataGenerator.utils.LuhnUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Random;

/**
 * Created by qingshuang on 2018/12/13
 */
public class BankCardGenerator {

    /**
     * 生成随机银行卡号：
     *  1. 效验是否为银行卡，用于验证：
     *  现行 16 位银联卡现行卡号开头 6 位是 622126～622925 之间的，7 到 15 位是银行自定义的，
     *  可能是发卡分行，发卡网点，发卡序号，第 16 位是校验码。
     *  2. 16 位卡号校验位采用 Luhm 校验方法计算：
     */

    /**
     * 随机获取银行枚举的值
     */
    public static String randomBankName(){
        BankNameEnum enums[] = BankNameEnum.values();
        Random random = new Random();
        BankNameEnum bankName = enums[random.nextInt(enums.length)];
        return bankName.toString();
    }

    /**
     * 随机获取银行卡号类型枚举的值
     */
    public static String randomBankType(){
        BankCardTypeEnum enums[] = BankCardTypeEnum.values();
        Random random = new Random();
        BankCardTypeEnum bankType = enums[random.nextInt(enums.length)];
        return bankType.toString();
    }

    /**
     * 根据给定前六位生成卡号
     */
    public static String generateByPrefix(Integer prefix) {
        Random random = new Random(System.currentTimeMillis());
        String bardNo = prefix + StringUtils.leftPad(random.nextInt(999999999) + "", 9, "0");
        char[] chs = bardNo.trim().toCharArray();
        int luhnSum = LuhnUtils.getLuhnSum(chs);
        char checkCode = luhnSum % 10 == 0 ? '0' : (char) (10 - luhnSum % 10 + '0');
        return bardNo + checkCode;
    }


    /**
     * 根据银行名称 及银行卡类型生成对应卡号
     * @param bankName 银行名称
     * @param cardType 银行卡类型
     * @return 银行卡号
     */
    public static String generateBankCard(BankNameEnum bankName, BankCardTypeEnum cardType) {
        Integer[] candidatePrefixes = null;
        if (cardType == null) {
            candidatePrefixes = bankName.getAllCardPrefixes();
        } else {
            switch (cardType) {
                case DEBIT:
                    candidatePrefixes = bankName.getDebitCardPrefixes();
                    break;
                case CREDIT:
                    candidatePrefixes = bankName.getCreditCardPrefixes();
                    break;
                default:
            }
        }

        if (candidatePrefixes == null || candidatePrefixes.length == 0) {
            throw new RuntimeException("没有该银行的相关卡号信息");
        }

        Integer prefix = candidatePrefixes[new Random().nextInt(candidatePrefixes.length)];
        return generateByPrefix(prefix);
    }

}
