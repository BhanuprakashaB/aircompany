import org.junit.Assert;
import org.junit.Test;

public class NewTest {

    @Test
    public void checkThatJavaMavenAndJUnitAreInstalled(){

        Assert.assertTrue("this test should pass if Java, JUnit and Maven are installed",
                true);
    }
}
