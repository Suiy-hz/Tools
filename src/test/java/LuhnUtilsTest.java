import com.leap.qa.utils.DataGenerator.utils.LuhnUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by qingshuang on 2018/12/12
 */
public class LuhnUtilsTest {

    @Test
    public void testLuhn(){

        char[] s = RandomStringUtils.randomNumeric(19).toCharArray();
        System.out.println(s);
        int luhnNum = LuhnUtils.getLuhnSum(s);
        System.out.println(luhnNum);
        Assert.assertNotNull(luhnNum);
    }
}
