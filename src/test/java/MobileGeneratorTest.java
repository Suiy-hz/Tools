import com.leap.qa.utils.DataGenerator.MobileGenerator;
import org.junit.Assert;
import org.junit.Test;


/**
 * Created by qingshuang on 2018/12/12
 */
public class MobileGeneratorTest {

    @Test
    public void testMobileGenerate(){

        String mobile = MobileGenerator.generateMobile();
        System.out.println(mobile);
        Assert.assertNotNull(mobile);
    }


    @Test
    public void testFakeGenerate(){

        String fake = MobileGenerator.generateFake();
        System.out.println(fake);
        Assert.assertNotNull(fake);
    }
}
