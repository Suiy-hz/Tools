import com.leap.qa.utils.DataGenerator.IDCardGenerator;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by qingshuang on 2018/12/13
 */
public class IDCardGeneratorTest {

    @Test
    public void testValidPeriodGenerate(){
        String vp = IDCardGenerator.generateValidPeriod();
        System.out.println(vp);
        Assert.assertNotNull(vp);
    }

    @Test
    public void testIssueOrgGenerate(){
        String issueOrg = IDCardGenerator.generateIssueOrg();
        System.out.println(issueOrg);
        Assert.assertNotNull(issueOrg);
    }

    @Test
    public void testIDCardGenerate(){
        String idCard = IDCardGenerator.generateIDCard();
        System.out.println(idCard);
        Assert.assertNotNull(idCard);
    }
}
