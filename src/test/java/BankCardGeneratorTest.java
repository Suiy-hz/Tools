import com.leap.qa.utils.DataGenerator.BankCardGenerator;
import com.leap.qa.utils.DataGenerator.Enum.BankCardTypeEnum;
import com.leap.qa.utils.DataGenerator.Enum.BankNameEnum;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by qingshuang on 2018/12/13
 */
public class BankCardGeneratorTest {

    @Test
    public void testRandomBankName(){
        String bk = BankCardGenerator.randomBankName();
        System.out.println(bk);
        Assert.assertNotNull(bk);
    }

    @Test
    public void testRandomBankType(){
        String bankType = BankCardGenerator.randomBankType();
        System.out.println(bankType);
        Assert.assertNotNull(bankType);
    }

    @Test
    public void testGenerateByPrefix(){
        String cardNo = BankCardGenerator.generateByPrefix(402658);
        System.out.println(cardNo);
        Assert.assertNotNull(cardNo);
    }

    @Test
    public void testGenerateBankCard(){
        String bankName = BankCardGenerator.randomBankName();
        String bankType = BankCardGenerator.randomBankType();
        String cardNo = BankCardGenerator.generateBankCard(BankNameEnum.valueOf(bankName), BankCardTypeEnum.valueOf(bankType));
        System.out.println(bankName + " " + bankType);
        System.out.println(cardNo);
        Assert.assertNotNull(cardNo);
    }
}
