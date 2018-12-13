import com.leap.qa.utils.DataGenerator.AddressGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by qingshuang on 2018/12/12
 */
public class AddressGeneratorTest {

    @Test
    public void testAddressGenerate(){
        String address = AddressGenerator.generateAddress();
        System.out.println(address);
        Assert.assertNotNull(address);
    }


}
