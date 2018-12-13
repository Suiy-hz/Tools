import com.leap.qa.utils.DataGenerator.EmailAddressGenerator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by qingshuang on 2018/12/12
 */
public class EmailGeneratorTest {

    @Test
    public void testEmailGenerate(){

        String email = EmailAddressGenerator.generateEmailAddress();
        System.out.println(email);
        Assert.assertNotNull(email);
    }
}
