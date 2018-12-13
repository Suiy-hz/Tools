import com.leap.qa.utils.DataGenerator.utils.TimeUtils;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;
import java.util.Date;

/**
 * Created by qingshuang on 2018/12/13
 */
public class TimeUtilsTest {


    @Test
    public void testGetNow(){
        Date now = TimeUtils.getNow();
        System.out.println(now);
        Assert.assertNotNull(now);
    }

    @Test
    public void testDateFormat1(){
        String df1 = TimeUtils.dateFormat1(TimeUtils.getNow());
        System.out.println(df1);
        Assert.assertNotNull(df1);
    }

    @Test
    public void testDateFormat2(){
        String df2 = TimeUtils.dateFormat2(TimeUtils.getNow());
        System.out.println(df2);
        Assert.assertNotNull(df2);
    }

    @Test
    public void testDateFormat3(){
        String df3 = TimeUtils.dateFormat3(TimeUtils.getNow());
        System.out.println(df3);
        Assert.assertNotNull(df3);
    }

    @Test
    public void testGetTimestampByDate(){
        long tms = TimeUtils.getTimestampByDate("2018-12-24 00:00:00");
        System.out.println(tms);
        Assert.assertNotNull(tms);
    }

    @Test
    public void testGetSpecificYeasGapDate(){
        Date ygdate = TimeUtils.getSpecificYeasGapDate(TimeUtils.getNow(), RandomUtils.nextInt(0,10));
        System.out.println(ygdate);
        Assert.assertNotNull(ygdate);
    }

    @Test
    public void testRandomDate(){
        Date randomDate = TimeUtils.randomDate();
        System.out.println(randomDate);
        Assert.assertNotNull(randomDate);
    }
}
