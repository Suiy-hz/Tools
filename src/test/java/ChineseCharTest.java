import com.leap.qa.utils.DataGenerator.utils.ChineseCharUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by qingshuang on 2018/12/12
 */
public class ChineseCharTest {

    @Test
    public void testgenFixedLengthChineseChars(){

        String fixedchar = ChineseCharUtils.genFixedLengthChineseChars(RandomUtils.nextInt(0,10));
        System.out.println(fixedchar);
        Assert.assertNotNull(fixedchar);
    }


    @Test
    public void testGenRandomLengthChineseChars(){

        String randomlengthchar = ChineseCharUtils.genRandomLengthChineseChars(RandomUtils.nextInt(0,10),RandomUtils.nextInt(11,20));
        System.out.println(randomlengthchar);
        Assert.assertNotNull(randomlengthchar);
    }

    @Test
    public void testGetOneOddChar(){

        char oddchar = ChineseCharUtils.getOneOddChar();
        System.out.println(oddchar);
        Assert.assertNotNull(oddchar);
    }


}
