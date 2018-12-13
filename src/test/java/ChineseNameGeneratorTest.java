import com.leap.qa.utils.DataGenerator.ChineseNameGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by qingshuang on 2018/12/12
 */
public class ChineseNameGeneratorTest {

    @Test
    public void testNormalGenerate(){
        String normalchinesename = ChineseNameGenerator.generateNormal();
        System.out.println(normalchinesename);

        Assert.assertNotNull(normalchinesename);

    }

    @Test
    public void testOddGenerate(){

        String oddchinesename = ChineseNameGenerator.generateOdd();
        System.out.println(oddchinesename);
        Assert.assertNotNull(oddchinesename);

    }
}
